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

    fun generateFor(name: Name): Email {
        val (first, last) = if ((1..10).random() > 5) name.first to name.last else name.last to name.first
        val identity = "$first${if ((1..10).random() > 5) "." else ""}$last"
            .lowercase().replace("'", "")
        return Email("$identity@${domains.random()}")
    }

    fun generateFor(name: String): Email = generateFor(Name(name))

    fun random(): Email = generateFor(NameGenerator.random())

    fun random(size: Int): List<Email> = List(size) { random() }
}