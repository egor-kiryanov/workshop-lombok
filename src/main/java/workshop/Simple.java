package workshop;

/**
 * Simple
 *
 * @author egor.kirianov
 */
public class Simple {
    private final String caption;

    private int number;
    private int count;

    private Simple(final String caption) {
        if (caption == null) {
            throw new NullPointerException("caption");
        }
        this.caption = caption;
    }

    public static Simple of(final String caption) {
        return new Simple(caption);
    }

    public Simple number(final int number) {
        this.number = number;
        return this;
    }

    public Simple count(final int count) {
        this.count = count;
        return this;
    }

    public String caption() {
        return caption;
    }

    public int number() {
        return number;
    }

    public int count() {
        return count;
    }
}
