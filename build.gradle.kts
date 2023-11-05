import me.shatopop.script.JavaCompilePlugin
import me.shatopop.script.SpigotPlugin
import me.shatopop.script.SpotlessConfigurationPlugin

plugins {
    id("java")
}

subprojects {
    apply<SpigotPlugin>()
    apply<SpotlessConfigurationPlugin>()
    apply<JavaCompilePlugin>()

    version = rootProject.version
}