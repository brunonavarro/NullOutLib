dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Advertencia: este repositorio se cerrará pronto
        maven("https://jitpack.io")
    }
}

rootProject.name = "NullOut"
include(":app")
include(":NullOutLib")

 