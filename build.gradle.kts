ext["kotestVersion"] = "4.2.0"
ext["logbackVersion"] = "1.2.3"
ext["slf4jVersion"] = "1.7.30"

plugins {
    base
    kotlin("jvm") version "1.4.0"
}

allprojects {
    group = "com.why.hellogradle"

    version = "1.0-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
    }
}