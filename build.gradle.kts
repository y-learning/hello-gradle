plugins {
    application
    kotlin("jvm") version "1.4.0"
}

application {
    mainClassName = "com.why.hellogradle.MainKt"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}
