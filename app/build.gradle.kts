apply(plugin = "com.android.application")
apply(plugin = "org.jetbrains.kotlin.android")

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mostarid.mostarid"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    buildFeatures {
        compose = true
    }

    namespace = "com.mostarid.mostarid"
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.12.00")
    implementation(composeBom)
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.9.0")

    // Compose
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3:1.3.0")
    implementation("androidx.compose.ui:ui-tooling-preview")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Room (placeholder)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // Hilt (prepared)
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-compiler:2.48")

    // Maps Compose (Google) - runtime requires API key and play services
    implementation("com.google.maps.android:maps-compose:2.12.0")
    implementation("com.google.android.gms:play-services-maps:18.1.0")

    // Esri (placeholder) - add official ArcGIS runtime dependency per Esri instructions
    // implementation("com.esri.arcgisruntime:arcgis-android:100.15.0")

    // Debug tooling
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
