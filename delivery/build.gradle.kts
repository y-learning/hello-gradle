plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "com.why.hellogradle.MainKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":app"))
}