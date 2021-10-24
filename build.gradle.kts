plugins {
    id ("com.github.ben-manes.versions") version "0.39.0"
    application
    java
}

repositories {
    mavenCentral()
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

tasks.withType<JavaCompile> {
    options.release.set(17)
}

application {
    mainClass.set("hexlet.code.App")
}