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
}