import contacts.PhoneGenerator
import expect.expect
import kotlin.test.Test

class PhoneGeneratorTest {
    @Test
    fun should_generate_valid_phone_numbers() {
        val phones = PhoneGenerator.random(20)
        println(phones)
        expect(phones.size).toBe(20)
    }
}