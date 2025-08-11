# Contributing to Google Weather Icons v4 Pack

Thank you for your interest in contributing to this Breezy Weather icon pack!

## Ways to Contribute

### 🐛 Report Issues
- Use the [Issues](../../issues) section to report bugs
- Include your Android version, Breezy Weather version, and device info
- Describe steps to reproduce the issue
- Add screenshots if helpful

### 💡 Suggest Improvements
- Request new weather condition icons
- Suggest UI/UX improvements
- Propose new features

### 🔧 Code Contributions

#### Prerequisites
- Android Studio (latest version recommended)
- Basic knowledge of Android development
- Familiarity with Breezy Weather app

#### Getting Started
1. Fork the repository
2. Clone your fork:
   ```bash
   git clone https://github.com/[your-username]/GoogleWeatherIconsV4Pack.git
   ```
3. Open in Android Studio
4. Create a new branch for your changes:
   ```bash
   git checkout -b feature/your-feature-name
   ```

#### Making Changes

**Adding New Icons:**
1. Add PNG files to `app/src/main/res/drawable/`
2. Update `app/src/main/res/xml/config.xml` with new icon mappings
3. Test in Breezy Weather
4. Update documentation

**Code Changes:**
1. Follow existing code style
2. Comment your changes
3. Test thoroughly with different Android versions
4. Ensure app builds without errors

#### Testing
- Install your modified APK on a real Android device
- Test in Breezy Weather with different weather conditions
- Verify icons appear correctly in day/night modes
- Check that the app icon appears properly on home screen

#### Submitting Changes
1. Commit your changes:
   ```bash
   git commit -m "Add: brief description of changes"
   ```
2. Push to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```
3. Create a Pull Request with:
    - Clear description of changes
    - Screenshots if UI-related
    - Testing information

## Code Style

- Use meaningful variable names
- Follow Android development best practices
- Comment complex logic
- Keep functions focused and small

## Icon Guidelines

When adding or modifying icons:

### Technical Requirements
- **Format**: PNG with transparent background
- **Resolution**: 512x512px
- **Color depth**: 32-bit RGBA
- **Naming**: Use snake_case (e.g., `weather_partly_cloudy_day.png`)

### Design Guidelines
- Follow Google's existing weather icon style
- Ensure good contrast for both light and dark themes
- Test visibility at small sizes (24dp, 32dp)
- Provide day/night variants when applicable

### Icon Mapping
Update `config.xml` when adding icons:
```xml
<item>weather_new_condition_day</item>
<item>weather_new_condition_night</item>
```

## Attribution Requirements

When contributing:
- Respect Google's copyright on original weather icons
- Maintain proper attribution in README and LICENSE
- Don't remove existing credits
- Add your contribution to the credits section if significant

## Questions?

- Check existing [Issues](../../issues) for similar questions
- Create a new issue with the "question" label
- Reference [Breezy Weather documentation](https://github.com/breezy-weather/breezy-weather) for app-specific questions

## Code of Conduct

- Be respectful and constructive
- Focus on the technical aspects
- Help newcomers learn
- Follow GitHub's community guidelines

---

Thank you for helping make this icon pack better for the Breezy Weather community! 🌤️