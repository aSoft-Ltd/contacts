package contacts

import kotlinx.serialization.Serializable
import kotlin.js.JsExport
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmStatic

@JsExport
@Serializable(with = EmailSerializer::class)
class Email(val value: String) {
    init {
        val parts = value.split("@")
        if (parts.size != 2 || parts.getOrNull(1)?.contains(".") != true) {
            throw IllegalArgumentException("Invalid email: $value")
        }
    }

    val parts get() = value.split("@")

    val identity get() = parts.first()

    val domain get() = parts.last()

    override fun equals(other: Any?): Boolean = when (other) {
        is String -> value == other
        is Email -> value == other.value
        else -> false
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString() = value
}