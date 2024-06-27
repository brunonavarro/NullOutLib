plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("kapt")
    id("com.google.devtools.ksp")
}

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "com.brunonavarro.nullout"
        minSdk = 16
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        //multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
//    buildFeatures {
//        compose = true
//    }
    kotlinOptions {
        jvmTarget = "1.8"
        //useIR = true
    }
//    composeOptions {
//        kotlinCompilerExtensionVersion(compose_version)
//        kotlinCompilerVersion("1.5.31")
//    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    //implementation("com.github.brunonavarro:nullout:1.0.0-beta3")
    implementation("com.github.brunonavarro:DecoradorNullOut:1.0.0-beta5")
    implementation(project(":NullOutLib"))

//    kapt(project(":ProcesadorNullOutLib"))
    ksp("com.github.brunonavarro:ProcesadorNullOutLib:1.0.0-beta2")
//    ksp(project("com.github.brunonavarro:nullout:1.0.0-beta3"))
//    compileOnly(project(":NullOutLib"))

//    implementation("com.github.brunonavarro:SideSheetComposeDialog:1.0.0")


    implementation("androidx.core:core-ktx:1.1.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
//    implementation "androidx.compose.ui:ui:$compose_version"
//    implementation "androidx.compose.material:material:$compose_version"
//    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
//    implementation 'androidx.activity:activity-compose:1.3.0'
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"


//    implementation("androidx.core:core-ktx:1.7.0")
//    implementation("androidx.compose.ui:ui:$compose_version")
//    implementation("androidx.compose.material:material:$compose_version")
//    implementation("androidx.compose.ui:ui-tooling-preview:$compose_version")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
//    implementation("androidx.activity:activity-compose:1.3.1")
//    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.9.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


}


//apply plugin: 'com.android.application'
//apply plugin: 'kotlin-android'
//apply plugin: 'kotlin-kapt'
//
//android {
//    compileSdk 30
//
//    defaultConfig {
//        applicationId "com.brunonavarro.nullout"
//        minSdk 16
//        targetSdk 30
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary true
//        }
//        //multiDexEnabled true
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8
//    }
////    buildFeatures {
////        compose true
////    }
//    kotlinOptions {
//        jvmTarget = '1.8'
//        //useIR = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion compose_version
//        kotlinCompilerVersion '1.5.31'
//
//    }
//    packagingOptions {
//        resources {
//            excludes += '/META-INF/{AL2.0,LGPL2.1}'
//        }
//    }
//}
//
//dependencies {
//
//    implementation project(path: ':DecoradorLib')
//    implementation project(path: ':NullOutLib')
//
//    kapt project(path: ':ProcesadorNullOutLib')
////    compileOnly project(':NullOutLib')
//
//
////    implementation 'com.github.brunonavarro:SideSheetComposeDialog:1.0.0'
//
//
//    //implementation 'com.android.support:multidex:2.0.1'
//
//
//
//    implementation 'androidx.core:core-ktx:1.1.0'
//    implementation 'androidx.appcompat:appcompat:1.3.0'
//    implementation 'com.google.android.material:material:1.2.1'
//    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
////    implementation "androidx.compose.ui:ui:$compose_version"
////    implementation "androidx.compose.material:material:$compose_version"
////    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.2.0'
////    implementation 'androidx.activity:activity-compose:1.3.0'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
////    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
////    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//
//
//
//
////    implementation 'androidx.core:core-ktx:1.7.0'
////    implementation "androidx.compose.ui:ui:$compose_version"
////    implementation "androidx.compose.material:material:$compose_version"
////    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
////    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
////    implementation 'androidx.activity:activity-compose:1.3.1'
////    implementation 'androidx.appcompat:appcompat:1.6.1'
////    implementation 'com.google.android.material:material:1.9.0'
////    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
////    testImplementation 'junit:junit:4.13.2'
////    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
////    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
////    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
////    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//
////    def nav_version = "2.5.3"
////    implementation "androidx.navigation:navigation-compose:$nav_version"
//}