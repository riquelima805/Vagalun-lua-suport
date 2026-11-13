// Projeto Gradle INDEPENDENTE: não toca no settings.gradle.kts nem no CI do app principal.
pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories { google(); mavenCentral() }
}
rootProject.name = "vagalun-functions-lab"
include(":app")
