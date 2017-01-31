package workshop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * UserUnitTest
 *
 * @author egor.kirianov
 */
public class UserUnitTest {
    @Test
    public void testGettersSettersAndEquals() {
        User userOne = new User();
        userOne.setUserId(1L);
        userOne.setFirstName("User firstName");
        userOne.setLastName("User full firstName");
        userOne.setEmail("email@email.com");
        userOne.setPassword("password");

        User userTwo = new User();
        userTwo.setUserId(userOne.getUserId()   );
        userTwo.setFirstName(userOne.getFirstName());
        userTwo.setLastName(userOne.getLastName());
        userTwo.setEmail(userOne.getEmail());
        userTwo.setPassword(userOne.getPassword());

        assertThat(userTwo, is(userOne));
    }

    @Test
    public void testToStringMethod() {
        User user = new User();
        user.setUserId(1L);
        user.setFirstName("User firstName");
        user.setLastName("User full firstName");
        user.setEmail("email@email.com");
        user.setPassword("password");

        String toStringResult = user.toString();

        assertThat(toStringResult, containsString("1"));
        assertThat(toStringResult, containsString("User firstName"));
        assertThat(toStringResult, containsString("User full firstName"));
        assertThat(toStringResult, containsString("email@email.com"));
        assertThat(toStringResult, containsString("password"));
    }
}