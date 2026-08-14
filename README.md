# مستعرض الخرائط (Mostarid Maps)

This repository contains the initial scaffold for the Android app "مستعرض الخرائط" (Arabic RTL, Kotlin + Jetpack Compose + Material3).

Important notes
- This is an initial scaffold. It includes modular gradle modules, basic Compose entry, Room/data module placeholders, and a MapProvider interface skeleton.
- You MUST add API keys (Google Maps & Esri) and the Android SDK/NDK locally to build/run the project.
- To build locally: open the project in Android Studio and let it configure the Gradle wrapper & SDK. Or run `./gradlew wrapper` then `./gradlew assembleDebug`.

Default choices used in this scaffold
- applicationId: com.mostarid.mostarid
- minSdk: 24
- DI: Hilt (prepared but not fully wired yet)
- Map providers: Google + Esri (providers are sketched as interfaces/skeletons — keys required to run maps)

Next steps (short)
1. Add Google & Esri API keys (do NOT commit them). Locally add to `local.properties` or to CI secrets:
   - GOOGLE_MAPS_API_KEY
   - ESRI_API_KEY
2. Open project in Android Studio, let Gradle sync and install required SDK packages.
3. Run app on a device/emulator. The initial MainActivity shows an About screen and skeleton entries.

For Release signing with GitHub Actions (optional)
- Convert your keystore to Base64 and add as repository secrets:
  - KEYSTORE_BASE64
  - KEYSTORE_PASSWORD
  - KEY_ALIAS
  - KEY_PASSWORD

"تصميم وبرمجة م. محمد المطاع" will be shown in the About/Settings screen.


---

This scaffold was pushed by a helper assistant. Continue development by fleshing out modules and adding provider keys.