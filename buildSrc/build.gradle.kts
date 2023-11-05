plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${libs.plugins.spotless.get().version}")
}

gradlePlugin {
    plugins {
        register("spotless-config-plugin") {
            id = "spotless-config-plugin"
            implementationClass = "me.shatopop.script.SpotlessConfigurationPlugin"
        }
        register("spigot-plugin") {
            id = "spigot-plugin"
            implementationClass = "me.shatopop.script.SpigotPlugin"
        }
        register("compile-plugin") {
            id = "compile-plugin"
            implementationClass = "me.shatopop.script.JavaCompilePlugin"
        }
    }
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}