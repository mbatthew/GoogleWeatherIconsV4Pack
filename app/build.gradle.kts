// build.gradle.kts
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.matthew.googleweathericonsv4"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.matthew.googleweathericonsv4"
        minSdk = 21
        targetSdk = 34
        versionCode = 4
        versionName = "1.3.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // A minimal icon pack might not even need these if the MainActivity is completely empty.
    // However, keeping core-ktx is a good practice for compatibility.
    // All other dependencies are likely safe to remove.
    implementation("androidx.core:core-ktx:1.12.0")

    // Test dependencies can also be stripped down if not being used.
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}