plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    universalLib()
    sourceSets {
        val commonTest by getting {
            dependencies {
                api(asoft("test", vers.asoft.test))
            }
        }
    }
}

aSoftLibrary(
    version = vers.asoft.contacts,
    description = "A multiplatfrom library for dealing with phone numbers"
)