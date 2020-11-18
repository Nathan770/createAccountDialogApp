package com.example.createaccountdialogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nathan.createaccountlibrary.EasyForm;
import com.nathan.createaccountlibrary.EasyFormObject;
import com.nathan.createaccountlibrary.EasyFormSubmitListener;

public class MainActivity extends AppCompatActivity implements EasyFormSubmitListener {
    private static final String TAG = "EasyTextApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialButton button = findViewById(R.id.main_BTN_openDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openDialog() {
        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.8);
        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.9);

        EasyForm easyForm = new EasyForm.Builder(this)
                .setDimensions(width, RelativeLayout.LayoutParams.WRAP_CONTENT)
                .setNameBox()
                .setEmailBox()
                .setPasswordBox()
                .build();
    }

    @Override
    public void getEasyDialogObject(EasyFormObject easyFormObject) {
        Log.d(TAG, "getEasyDialogObject: Got object: " + easyFormObject.toString());
    }
}