import java.net.URI

//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//        maven{
//            url 'https://jitpack.io'
//        }
//    }
//}
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

 