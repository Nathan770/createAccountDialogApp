# createAccountDialog

[![](https://jitpack.io/v/Nathan770/createAccountDialogApp.svg)](https://jitpack.io/#Nathan770/createAccountDialogApp)
[![GitHub license](https://img.shields.io/github/license/Nathan770/createAccountDialogApp)](https://github.com/Nathan770/createAccountDialogApp/blob/master/LICENSE)

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
  implementation 'com.github.Nathan770:createAccountDialogApp:1.00.00'
	}
```

## Usage

###### StepProgress Constructor:
```java

public class MainActivity extends AppCompatActivity implements EasyFormSubmitListener {
    private static final String TAG = "EasyTextApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	
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
     
     }
     
     @Override
    public void getEasyDialogObject(EasyFormObject easyFormObject) {
    	// To get the info
        Log.d(TAG, "getEasyDialogObject: Got object: " + easyFormObject.toString());
    }
     
}     		
```
## License

    Copyright 2020 Nathan Amiel & Vadim Kandaurov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Credits

Icon made by Flat Icons (www.flat-icons.com) from www.flaticon.com

