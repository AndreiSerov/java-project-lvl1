plugins {
    id ("com.github.ben-manes.versions") version "0.39.0"
    application
    java
    checkstyle
}

repositories {
    mavenCentral()
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

tasks {
    withType<JavaCompile> {
        options.release.set(17)
    }

    withType<Checkstyle>().configureEach {
        reports {
            xml.required.set(false)
            html.required.set(true)
        }
    }
}

application {
    mainClass.set("hexlet.code.App")
}

val run: JavaExec by tasks
run.standardInput = System.`in`