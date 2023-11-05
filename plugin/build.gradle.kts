@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.bukkitPluginYAML)
    alias(libs.plugins.shadow)
}

repositories {
    maven("https://repo.dmulloy2.net/repository/public/")
    maven("https://repo.unnamed.team/repository/unnamed-public/")
}

dependencies {
    implementation(libs.inject)
    compileOnly(libs.protocollib)
}

tasks {
    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")

        arrayOf(
            "team.unnamed.inject"
        ).forEach {
                dependency -> relocate(dependency, "me.shatopop.signature.lib")
        }
    }

    named<DefaultTask>("build") {
        dependsOn("spotlessApply", "shadowJar")
    }
}

bukkit {
    val pluginName = findProperty("plugin-name").toString()

    main = "me.shatopop.signature.AllowInvalidSignaturesPlugin"
    apiVersion = "1.13"
    version = "${project.version}"
    authors = listOf("shatopop")
    description = "${findProperty("plugin-description")}"
    name = pluginName
    depend = listOf("ProtocolLib")
}
