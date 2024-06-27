plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
//    kotlin("kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    // compileOnly(project(":DecoradorLib"))
    // implementation(project(path = ":NullOutLib"))

    // implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // implementation("com.squareup:kotlinpoet:1.11.0")
    // implementation("com.google.auto.service:auto-service:1.0-rc4")
    // kapt("com.google.auto.service:auto-service:1.0-rc4")
    // implementation(kotlin("stdlib-jdk8"))
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "com.github.brunonavarro"
            artifactId = "NullOutLib"
            version = "1.0.0-beta1"
        }
    }
}


////En caso de que tu version de JDK genere problemas puedes usar este bloque
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}