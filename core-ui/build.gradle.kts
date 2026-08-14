plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mostarid.coreui"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
}

dependencies {
    implementation("androidx.compose.material3:material3:1.3.0")
}
