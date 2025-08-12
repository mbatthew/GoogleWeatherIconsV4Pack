# Contributing to Google Weather Icons v4 Pack

Thank you for your interest in contributing to this Breezy Weather icon pack!

## ⚠️ Important Legal Notice

Before contributing, please understand that this project includes weather icons with **uncertain licensing status**. The icons are sourced from Google but lack clear open source licensing. Contributors should be aware of potential copyright restrictions.

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
- **Note**: Icon additions are limited by the available source material

### 🔧 Code Contributions

#### Prerequisites
- Android Studio (latest version recommended)
- Basic knowledge of Android development
- Familiarity with Breezy Weather app
- **Understanding of copyright implications**

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

**Application Code Changes:**
1. Follow existing code style
2. Comment your changes
3. Test thoroughly with different Android versions
4. Ensure app builds without errors

**Icon-Related Changes:**
1. **DO NOT** add new icons from unclear sources
2. Focus on optimizing existing icons (compression, sizing)
3. Update app/src/main/res/xml/drawable_filter.xml for any mappings
4. Test in Breezy Weather
5. Update documentation

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
    - **Confirmation that no copyrighted material was added**

## Code Style

- Use meaningful variable names
- Follow Android development best practices
- Comment complex logic
- Keep functions focused and small

## Icon Guidelines

### ⚠️ CRITICAL: Copyright Restrictions

**DO NOT contribute new weather icons unless:**
- You own the copyright
- You have explicit permission from the copyright holder
- The icons are confirmed to be under a compatible open source license

### Technical Requirements (for existing icons)
- Format: PNG with transparent background
- Resolution: 256x256px (current optimization)
- Color depth: 32-bit RGBA
- Naming: Use snake_case (e.g., weather_partly_cloudy_day.png)

### Design Guidelines (for modifications only)
- Maintain consistency with existing style
- Ensure good contrast for both light and dark themes
- Test visibility at small sizes (24dp, 32dp)
- Preserve day/night variants when applicable

### Icon Mapping
Update drawable_filter.xml when modifying icons:
```xml
<item>weather_condition_day</item>
<item>weather_condition_night</item>
```

## Legal & Attribution Requirements

When contributing:

### Must Do:
- Respect all existing copyright notices
- Maintain proper attribution in README and LICENSE
- Don't remove existing legal disclaimers
- Only contribute code you have rights to

### Must Not Do:
- Add icons from uncertain or copyrighted sources
- Remove copyright warnings
- Make false licensing claims
- Distribute copyrighted material without permission

### If Contributing Significantly:
- Add your contribution to the credits section
- Include your own copyright notice for your code contributions
- Understand that your code will be MIT licensed

## Alternative Icon Sources

If you want to contribute new icons, consider these open source alternatives:
- Weather Icons by Erik Flowers (SIL OFL 1.1 license)
- Feather Icons (MIT license)  
- Heroicons (MIT license)
- Material Design Icons (Apache 2.0 license)

## Questions?

- Check existing [Issues](../../issues) for similar questions
- Create a new issue with the "question" label
- Reference [Breezy Weather documentation](https://github.com/breezy-weather/breezy-weather) for app-specific questions
- **For legal questions**: Consult qualified legal counsel

## Code of Conduct

- Be respectful and constructive
- Focus on the technical aspects
- Help newcomers learn
- Follow GitHub's community guidelines
- **Respect copyright and intellectual property rights**

---

**Legal Reminder**: This project exists in a legal gray area regarding the weather icons. Contributors should be aware of this limitation and focus contributions on application code, optimization, and clearly licensed content.

Thank you for helping improve this icon pack while respecting intellectual property rights! 🌤️
