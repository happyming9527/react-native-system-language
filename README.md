
# react-native-system-language

## Getting started

`$ npm install react-native-system-language --save`

### Mostly automatic installation

`$ react-native link react-native-system-language`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-system-language` and add `RNSystemLanguage.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSystemLanguage.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSystemLanguagePackage;` to the imports at the top of the file
  - Add `new RNSystemLanguagePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-system-language'
  	project(':react-native-system-language').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-system-language/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-system-language')
  	```


## Usage
```javascript
import RNSystemLanguage from 'react-native-system-language';

// TODO: What do with the module?
RNSystemLanguage;
```
  