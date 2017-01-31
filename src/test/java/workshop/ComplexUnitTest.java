package workshop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.sameInstance;

/**
 * ComplexUnitTest
 *
 * @author egor.kirianov
 */
public class ComplexUnitTest {
    @Test
    public void testComplexPojoBuilding()  {

        Object obj = new Object();
        final Complex pojo = Complex.builder()
                .fieldOne(obj)
                .fieldTwoElement(obj)
                .fieldThreeElement("obj", obj)
                .build();

        Assert.assertThat(pojo.getFieldOne(), sameInstance(obj));
        Assert.assertThat(pojo.getFieldTwo(), hasItems(obj));
        Assert.assertThat(pojo.getFieldThree().get("obj"), sameInstance(obj));
    }
}