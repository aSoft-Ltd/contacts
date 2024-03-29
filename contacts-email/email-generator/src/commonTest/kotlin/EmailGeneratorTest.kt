import contacts.EmailGenerator
import expect.expect
import kotlin.test.Test

class EmailGeneratorTest {

    @Test
    fun should_generate_valid_emails() {
        val emails = EmailGenerator.random(20)
        println(emails)
        expect(emails).toBeOfSize(20)
    }

    @Test
    fun should_be_able_to_generate_email_for_a_given_name() {
        val email = EmailGenerator.generateFor("Johny Cage")
        println(email)
    }
}