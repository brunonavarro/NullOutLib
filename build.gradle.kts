plugins {
    id("com.google.devtools.ksp") version "1.5.31-1.0.0" apply false
}

buildscript {
    val compose_version by extra { "1.0.0" }
    repositories {
        google()
        mavenCentral()
        jcenter() // Advertencia: este repositorio se cerrará pronto
        maven(url = "https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")

        // NOTA: No coloques tus dependencias de la aplicación aquí; pertenecen
        // en los archivos build.gradle del módulo individual
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}