# YomiYum

YomiYum is a scaffold Android application built with Gradle and the Android Gradle Plugin.

## Build locally

```bash
gradle assembleDebug
```

## Continuous integration

GitHub Actions builds the debug APK on every push to `main` and on pull requests.

## Releases

Every push to `main` builds the debug APK and publishes it to GitHub Releases using a commit-specific `build-<sha>` tag. Pull requests build the APK without publishing a release.
