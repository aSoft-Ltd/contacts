plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    jvm {
        library(); withJava()
    }
    js(IR) { library() }
    nativeTargets(false)
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":phone-core"))
            }
        }
        val commonTest by getting {
            dependencies {
                api(asoft("expect-core", vers.asoft.expect))
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.contacts,
    description = "A multiplatfrom library for dealing with phone numbers generation"
)