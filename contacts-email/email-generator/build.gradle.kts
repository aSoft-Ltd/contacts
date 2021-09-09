plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    jvm {
        library();withJava()
    }
    js(IR) { library() }
    nativeTargets(true)
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":email-core"))
                api(project(":name-generator"))
            }
        }
        val commonTest by getting {
            dependencies {
                api(asoft("expect-core", vers.asoft.expect))
                api(kotlinx("serialization-json", vers.kotlinx.serialization))
            }
        }
    }
}

aSoftOSSLibrary(
    version = vers.asoft.contacts,
    description = "A multiplatfrom library for dealing with email generation"
)