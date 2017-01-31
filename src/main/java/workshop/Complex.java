package workshop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * Complex
 *
 * @author egor.kirianov
 */
public class Complex {
    private Object fieldOne;
    private List<Object> fieldTwo;
    private Map<String, Object> fieldThree;

    public Complex(
            final Object fieldOne, final List<Object> fieldTwo, final Map<String, Object> fieldThree
    ) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }

    public Object getFieldOne() {
        return fieldOne;
    }

    public List<Object> getFieldTwo() {
        return fieldTwo;
    }

    public Map<String, Object> getFieldThree() {
        return fieldThree;
    }

    public static class Builder {
        private Object fieldOne;
        private ArrayList<Object> fieldTwo;
        private Map<String, Object> fieldThree;

        Builder() {
        }

        public Builder fieldOne(final Object fieldOne) {
            this.fieldOne = fieldOne;
            return this;
        }

        public Builder fieldTwo(final Collection<? extends Object> fieldTwo) {
            if (this.fieldTwo == null) this.fieldTwo = new ArrayList<>();
            this.fieldTwo.addAll(fieldTwo);
            return this;
        }

        public Builder fieldTwoElement(final Object fieldTwoElement) {
            if (this.fieldTwo == null) this.fieldTwo = new ArrayList<>();
            this.fieldTwo.add(fieldTwoElement);
            return this;
        }

        public Builder fieldThree(final Map<? extends String, ? extends Object> fieldThree) {
            if (this.fieldThree == null) {
                this.fieldThree = new LinkedHashMap<>();
            }
            this.fieldThree.putAll(fieldThree);
            return this;
        }

        public Builder fieldThreeElement(final String fieldThreeElementKey, final Object fieldThreeElementValue) {
            if (this.fieldThree == null) {
                this.fieldThree = new LinkedHashMap<>();
            }
            this.fieldThree.put(fieldThreeElementKey, fieldThreeElementValue);
            return this;
        }

        public Complex build() {
            List<Object> fieldTwo;
            if (this.fieldTwo == null) {
                fieldTwo = Collections.emptyList();
            } else {
                fieldTwo = Collections.unmodifiableList(new ArrayList<>(this.fieldTwo));
            }

            Map<String, Object> fieldThree;
            if (this.fieldThree == null) {
                fieldThree = Collections.emptyMap();
            } else {
                fieldThree = new LinkedHashMap<>();
                for (Map.Entry<String, Object> entry : this.fieldThree.entrySet()) {
                    fieldThree.put(entry.getKey(), entry.getValue());
                }
                fieldThree = Collections.unmodifiableMap(fieldThree);
            }
            return new Complex(fieldOne, fieldTwo, fieldThree);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
