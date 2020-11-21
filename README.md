# createAccountDialog
[![](https://jitpack.io/v/Nathan770/createAccountDialogApp.svg)](https://jitpack.io/#Nathan770/createAccountDialogApp)

A library for create Account

<img src="https://github.com/Nathan770/createAccountDialogApp/blob/master/createcountAll.png"  width="512">
<img src="https://github.com/Nathan770/createAccountDialogApp/blob/master/createcountMail.png"  width="512">


## Setup 

Step 1. Add the JitPack repository to your build.gradle file
```
allprojects {
		repositories {
		
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency :
```
dependencies {
  implementation 'com.github.Nathan770:createAccountDialogApp:Tag'
	}
```

## Usage

###### StepProgress Constructor:
```java
// Create your page with all Box
EasyForm easyForm = new EasyForm.Builder(this)
                .setDimensions(width, RelativeLayout.LayoutParams.WRAP_CONTENT)
                .setNameBox()
                .setEmailBox()
                .setCityBox()
                .setCountryBox()
                .setPhoneBox()
                .setPasswordBox()
                .build();
		
// Create your page with mail and password
EasyForm easyForm = new EasyForm.Builder(this)
                .setDimensions(width, RelativeLayout.LayoutParams.WRAP_CONTENT)
                .setEmailBox()
                .setPasswordBox()
                .build();

		
// To get the info		
 Log.d(TAG, "getEasyDialogObject: Got object: " + easyFormObject.toString());		
		
```


