package contacts

object EmailGenerator {

    val domains = listOf(
        "google.com",
        "yahoo.com",
        "mail.com",
        "test.com",
        "adobe.com",
        "asoft.co.tz",
        "bing.net",
        "microsoft.com"
    )

    fun random(): Email {
        val name = NameGenerator.random()
        val identity = (if ((1..10).random() > 5) name.first + "." + name.last else name.first + name.last)
            .lowercase().replace("'", "")
        return Email("$identity@${domains.random()}")
    }

    fun random(size: Int): List<Email> = List(size) { random() }
}