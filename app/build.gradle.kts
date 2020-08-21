plugins {
    application
    kotlin("jvm")
}

dependencies {
    val ext = project.rootProject.ext

    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:${ext["kotestVersion"]}")
    testRuntimeOnly("org.slf4j;slf4j-nop:${ext["slf4jVersion"]}")
}