import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.pavel"
version = "0.3.4"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

println("1")

dependencies {

    implementation("com.google.code.gson:gson:2.9.0")
    implementation("io.github.microutils:kotlin-logging:2.1.21")
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.slf4j:slf4j-simple:1.7.36")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}