// data module (Room) placeholder
plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    namespace = "com.mostarid.data"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
}

dependencies {
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
}
