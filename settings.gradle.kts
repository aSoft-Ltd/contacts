pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "contacts"
include(":email-core")
include(":phone-core")
include(":name-core")