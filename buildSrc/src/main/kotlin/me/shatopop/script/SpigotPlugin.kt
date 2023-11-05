package me.shatopop.script

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*

class SpigotPlugin : Plugin<Project> {

    override fun apply(target: Project) = target.configure()

    private fun Project.configure() {
        project.plugins.apply("java")

        project.repositories {
            maven("https://oss.sonatype.org/content/repositories/snapshots/")
            maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        }

        project.dependencies.apply {
            add("compileOnly", "org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
        }
    }
}