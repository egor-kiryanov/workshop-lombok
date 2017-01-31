package workshop;

/**
 * Immutable object
 *
 * @author egor.kirianov
 */
public final class ImmutableObject {
    private final Object fieldOne;
    private final Object fieldTwo;
    private final Object fieldThree;
    private final Object fieldFour;

    public ImmutableObject(Object fieldOne, Object fieldTwo, Object fieldThree, Object fieldFour) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
        this.fieldFour = fieldFour;
    }

    public Object getFieldOne() {
        return fieldOne;
    }

    public Object getFieldTwo() {
        return fieldTwo;
    }

    public Object getFieldThree() {
        return fieldThree;
    }

    public Object getFieldFour() {
        return fieldFour;
    }
}
