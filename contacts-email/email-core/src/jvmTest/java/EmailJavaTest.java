import org.junit.jupiter.api.Test;
import contacts.Email;

import static expect.Builders.expect;

public class EmailJavaTest {

    @Test
    public void should_pass() {
        var mail = "andy@lamax.com";
        expect(new Email(mail).toString()).toBe(mail);
    }

    @Test
    public void should_fail() {
        expect(() -> new Email("kitimtim")).toFail();
        expect(() -> new Email("test.com")).toFail();
    }

    @Test
    public void should_get_an_email_instance() {
        var email = new Email("andy@lamax.com");
        expect(email).toBe(email);
    }

    @Test
    public void can_get_an_instance_of_an_email() {
        var email = new Email("andy@lamax.com");
    }
}
