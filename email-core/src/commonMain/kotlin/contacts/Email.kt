package contacts

import kotlinx.serialization.Serializable

@Serializable
data class Email(private val value: String) {
    init {
        val parts = value.split("@")
        if (parts.size != 2 || parts.getOrNull(1)?.contains(".") != true) {
            throw IllegalArgumentException("Invalid email: $value")
        }
    }

    val parts get() = value.split("@")

    val identity get() = parts.first()

    val domain get() = parts.last()

    override fun toString() = value
}