package me.shatopop.script

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.kotlin.dsl.withType

class JavaCompilePlugin : Plugin<Project> {

    override fun apply(target: Project) = target.configure()

    private fun Project.configure() {
        project.tasks.apply {
            withType<JavaCompile>().configureEach {
                sourceCompatibility = JavaVersion.VERSION_1_8.toString()
                targetCompatibility = JavaVersion.VERSION_1_8.toString()

                options.encoding = "UTF-8"
                options.compilerArgs.add("-parameters")
            }
        }
    }
}