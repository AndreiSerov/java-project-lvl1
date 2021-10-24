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

    named<JavaExec>("run") {
        standardInput = System.`in`
    }
}

application {
    mainClass.set("hexlet.code.App")
}