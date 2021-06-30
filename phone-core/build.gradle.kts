plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
    id("io.codearte.nexus-staging")
    signing
}

kotlin {
    jvm {
        library()
        withJava()
        tasks.withType<Test> {
            useJUnitPlatform()
        }
    }
    js(IR) { library() }
    val darwinTargets = listOf(
        macosX64(),
        iosArm64(),
        iosArm32(),
        iosX64(),
        watchosArm32(),
        watchosArm64(),
        watchosX86(),
        tvosArm64(),
        tvosX64()
    )

    val linuxTargets = listOf(
        linuxArm64(),
        linuxArm32Hfp(),
        linuxX64()
    )
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(kotlinx("serialization-core", vers.kotlinx.serialization))
            }
        }
        val commonTest by getting {
            dependencies {
                api(kotlinx("serialization-json", vers.kotlinx.serialization))
                api(asoft("expect-core", vers.asoft.expect))
            }
        }
    }
}
//
//aSoftLibrary(
//    version = vers.asoft.contacts,
//    description = "A multiplatfrom library for dealing with phone numbers"
//)