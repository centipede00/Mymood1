pluginManagement {
    repositories {
        jcenter {}
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        jcenter {}
        google()
        mavenCentral()
    }
}
rootProject.name = "My mood"
include(":app")
 