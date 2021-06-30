import expect.expect
import contacts.Email
import kotlin.test.*

class EmailTest {

    @Test
    fun should_pass() {
        expect("${Email("andy@lamax.com")}").toBe("andy@lamax.com")
        expect("andy@lamax.com").toBe(Email("andy@lamax.com").toString())
    }

    @Test
    fun should_fail() {
        expect { Email("kitimtim") }.toFail()
        expect { Email("test.com") }.toFail()
    }

    @Test
    fun a_valid_email_should_have_valid_parts() {
        val email = Email("andy@lamax.com")
        expect(email.parts.size).toBe(2)
        expect(email.domain).toBe("lamax.com")
        expect(email.identity).toBe("andy")
    }
}