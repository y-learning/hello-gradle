val kotlinTestVersion = "4.2.0"
val logbackVersion = "1.2.3"
val slf4jVersion = "1.7.30"

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
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotlinTestVersion")
    testRuntimeOnly("org.slf4j:slf4j-nop:$slf4jVersion")
}
