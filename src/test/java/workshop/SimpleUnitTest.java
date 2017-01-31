package workshop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * SimpleUnitTest
 *
 * @author egor.kirianov
 */
public class SimpleUnitTest {
    @Test
    public void testBuilding() {
        final Simple pojo = Simple.of("test").number(5).count(2);

        assertThat(pojo.caption(), is("test"));
        assertThat(pojo.number(), is(5));
        assertThat(pojo.count(), is(2));
    }

    @Test(expected = NullPointerException.class)
    public void testCreationWithNull() throws Exception {
        Simple.of(null);
    }
}