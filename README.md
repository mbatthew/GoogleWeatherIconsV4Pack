# Google Weather Icons v4 - Breezy Weather Icon Pack

A custom icon pack for [Breezy Weather](https://github.com/breezy-weather/breezy-weather) featuring weather icons inspired by Google's Weather Icons v4 with clean, transparent backgrounds.

![Preview](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/preview.png)

## Features

- ✅ 24 essential weather icons inspired by Google Weather Icons v4
- ✅ Day and night variants for accurate weather representation  
- ✅ Transparent backgrounds - no circular masks or backgrounds
- ✅ Optimized file size - 256x256px PNG icons for fast downloads
- ✅ Full compatibility with Breezy Weather v5.4.8+
- ✅ Clean integration - appears seamlessly in Breezy Weather settings
- ✅ Lightweight APK - Under 500KB download size

## Installation

### Method 1: Download APK
1. Go to [Releases](https://github.com/mbatthew/GoogleWeatherIconsV4Pack/releases)
2. Download the latest GoogleWeatherIconsV4Pack.apk
3. Install the APK on your Android device
4. Open Breezy Weather → Settings → Appearance → Icon Packs
5. Select "Google Weather Icons v4"

### Method 2: Build from Source
1. Clone this repository
2. Open in Android Studio
3. Build → Generate Signed Bundle / APK
4. Install the generated APK

## Requirements

- Android 5.0+ (API level 21+)
- [Breezy Weather](https://github.com/breezy-weather/breezy-weather) app installed

## Screenshots

| Breezy Weather Settings | Icon Pack Preview |
|------------------------|-------------------|
| ![Settings](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/settings.png) | ![Preview](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/preview.png) |

| Day Weather | Night Weather | More Examples |
|-------------|---------------|---------------|
| ![Weather Day](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/weather1.png) | ![Weather Night](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/weather-night.png) | ![Weather 2](https://raw.githubusercontent.com/mbatthew/GoogleWeatherIconsV4Pack/main/app/src/main/assets/weather2.png) |

## Technical Details

- Package name: com.matthew.googleweathericonsv4
- Target SDK: Android API level 34 (Android 14)
- Minimum SDK: Android API level 21 (Android 5.0)
- APK size: ~500KB
- Architecture: Uses drawable_filter.xml for Breezy Weather integration
- Icon format: 256x256px PNG with transparent backgrounds

## Icon Coverage

This icon pack includes essential weather conditions with day/night variants:

**Clear & Cloudy**
- Clear day/night
- Partly cloudy day/night
- Cloudy day/night

**Precipitation**
- Rain day/night
- Snow day/night
- Sleet day/night
- Hail day/night

**Atmospheric Conditions**
- Fog day/night
- Haze day/night

**Severe Weather & Wind**
- Thunder day/night
- Thunderstorm day/night
- Wind day/night

## Development

### Project Structure
```
app/
├── src/main/
│   ├── res/
│   │   ├── drawable/           # Weather icons (PNG)
│   │   ├── mipmap-*/           # App launcher icons
│   │   └── xml/
│   │       └── drawable_filter.xml  # Breezy Weather mapping
│   ├── assets/                 # Preview images
│   └── AndroidManifest.xml     # App configuration
└── build.gradle.kts           # Build configuration
```

### Building
1. Ensure you have Android Studio with SDK 34+
2. Clone the repository
3. Open project in Android Studio
4. Sync project with Gradle files
5. Build → Generate Signed Bundle / APK

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on contributing to this project.

## License & Legal Notice

**Application Code**: This project's source code is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

**Weather Icons**: The weather icons included in this application are sourced from https://github.com/mrdarrengriffin/google-weather-icons. The licensing status of these icons is uncertain, as:
- The source repository explicitly disclaims ownership with "I do not own these icons. All rights belong to Google"
- No official Google documentation has been located that confirms these specific icons are released under an open source license
- Users and distributors should be aware of potential copyright restrictions

**Disclaimer**: This application is provided for educational and interoperability purposes. Users assume responsibility for compliance with applicable copyright laws in their jurisdiction.

## Changelog

### v1.3.0 (Latest)
- Dramatically reduced APK size from 5MB to 500KB
- Optimized icon dimensions to 256x256px
- Streamlined dependencies for better performance
- Updated licensing documentation for accuracy

### v1.2.0
- Optimized PNG file sizes using advanced compression
- Improved download and installation speed

### v1.1.0
- Fixed night icon support in Breezy Weather
- Replaced config.xml with proper drawable_filter.xml
- Added missing critical weather icons
- Complete day/night icon coverage
