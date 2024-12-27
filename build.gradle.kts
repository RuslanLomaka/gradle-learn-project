plugins {
    id("java")
    id("com.gradleup.shadow") version "9.0.0-beta4"
}
apply(plugin = "com.gradleup.shadow")
group = "com.ruslanlomaka"
version = "1.0-SNAPSHOT"

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "App"
    }
    archiveBaseName.set("myname")
    archiveVersion.set("")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.code.gson:gson:2.8.9")
}


tasks.test {
    useJUnitPlatform()
}


