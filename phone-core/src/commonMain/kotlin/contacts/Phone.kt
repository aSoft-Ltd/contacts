package contacts

import kotlinx.serialization.Serializable

@Serializable(with = PhoneSerializer::class)
class Phone internal constructor(phone: String) {
    constructor(phone: Int) : this(phone.toString())
    constructor(phone: Long) : this(phone.toString())

    internal val value: String = parse(phone)

    override fun toString() = value

    companion object {
        val fakeProviderNumber = listOf(22, 61, 65, 67, 68, 71, 74, 75, 76, 78)
        val fake get() = "255" + fakeProviderNumber.random() + (1111111..9999999).random()
    }
}