package contacts

import kotlinx.serialization.Serializable
import kotlin.js.JsExport
import kotlin.js.JsName

@JsExport
@Serializable(with = PhoneSerializer::class)
class Phone(phone: String) {
    @JsName("ofNumber")
    constructor(phone: Int) : this(phone.toString())

    @JsName("_ofNumber")
    constructor(phone: Long) : this(phone.toString())

    internal val value: String = parse(phone)

    override fun toString() = value
}