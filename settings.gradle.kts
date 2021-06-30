pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "contacts"
include(":email-core")
project(":email-core").projectDir = File("contacts-email/email-core")

include(":email-generator")
project(":email-generator").projectDir = File("contacts-email/email-generator")


include(":name-core")
project(":name-core").projectDir = File("contacts-name/name-core")

include(":name-generator")
project(":name-generator").projectDir = File("contacts-name/name-generator")


include(":phone-core")
project(":phone-core").projectDir = File("contacts-phone/phone-core")

include(":phone-generator")
project(":phone-generator").projectDir = File("contacts-phone/phone-generator")
