plugins {
        id("java")
        id("org.jetbrains.intellij") version "1.17.2"
}

group = "com.github.dr3amydiamonds"
version = "1.0.1"

repositories {
        mavenCentral()
}

// Configuración para que el tema funcione en PyCharm y otros
intellij {
        version.set("2023.2.5")
        type.set("IC")
        updateSinceUntilBuild.set(false)
}

tasks {
        patchPluginXml {
                sinceBuild.set("222")
        }

        buildSearchableOptions {
                enabled = false
        }
}
