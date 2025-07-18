plugins {
    kotlin("jvm") version "2.1.21"
}

group = "net.keyfc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.21.1")
    implementation("com.squareup.okhttp3:okhttp:5.1.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}