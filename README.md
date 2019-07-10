
# react-native-web-jsoup

## Getting started

`$ npm install react-native-web-jsoup --save`

### Mostly automatic installation

`$ react-native link react-native-web-jsoup`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-web-jsoup` and add `RNWebJsoup.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNWebJsoup.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.qd.almo.webjsoup.RNWebJsoupPackage;` to the imports at the top of the file
  - Add `new RNWebJsoupPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-web-jsoup'
  	project(':react-native-web-jsoup').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-web-jsoup/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-web-jsoup')
  	```


## Usage
```javascript
import RNWebJsoup from 'react-native-web-jsoup';

// TODO: What to do with the module?
RNWebJsoup;
```
  