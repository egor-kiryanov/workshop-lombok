package workshop;

import org.junit.Assert;
import org.junit.Test;

/**
 * STimple unit test
 *
 * @author egor.kirianov
 */
public class ImmutableObjectUnitTest {
    @Test
//    @SneakyThrows
    public void testImmutableObject() {
        Object fieldOne = new Object();
        Object fieldTwo = new Object();
        Object fieldThree = new Object();
        Object fieldFour = new Object();

        ImmutableObject object = new ImmutableObject(fieldOne, fieldTwo, fieldThree, fieldFour);

        Assert.assertEquals(fieldOne, object.getFieldOne());
        Assert.assertEquals(fieldTwo, object.getFieldTwo());
        Assert.assertEquals(fieldThree, object.getFieldThree());
        Assert.assertEquals(fieldFour, object.getFieldFour());
    }
}