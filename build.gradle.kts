plugins {
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
    maven("https://repo.mineinabyss.com/snapshots")
}

dependencies {
    val particlesVersion by properties
    implementation("me.dvyy:particles:$particlesVersion")
}

kotlin {
    jvmToolchain(23)
}

// set src as source root
kotlin.sourceSets.main {
    kotlin.srcDir("src")
}
