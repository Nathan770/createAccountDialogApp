package com.nathan.createaccountlibrary;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class CreateAccount extends Dialog {
    private static final String TAG = "CreateAccount";

    private Context context;

    private TextInputLayout newAccount_EDT_name;
    private TextInputLayout newAccount_EDT_email;
    private TextInputLayout newAccount_EDT_phone;
    private TextInputLayout newAccount_EDT_city;
    private TextInputLayout newAccount_EDT_password;
    private TextInputLayout newAccount_EDT_confirmPassword;
    private MaterialButton newAccount_EDT_submit;

    public CreateAccount(@NonNull Context context) {
        super(context);
        this.context = context;
        this.show();
        int height = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.8);
        int width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.9);
        this.getWindow().setLayout(width, height);
    }

    public String[] build(Context context){

        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        findViews();
    }

    private void findViews() {
        newAccount_EDT_name = findViewById(R.id.newAccount_EDT_name);
        newAccount_EDT_email = findViewById(R.id.newAccount_EDT_email);
        newAccount_EDT_phone = findViewById(R.id.newAccount_EDT_phone);
        newAccount_EDT_city = findViewById(R.id.newAccount_EDT_city);
        newAccount_EDT_password = findViewById(R.id.newAccount_EDT_password);
        newAccount_EDT_confirmPassword = findViewById(R.id.newAccount_EDT_confirmPassword);
        newAccount_EDT_submit = findViewById(R.id.newAccount_EDT_submit);
        newAccount_EDT_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValidInfo();
            }
        });
    }

    /**
     * A method to set the new account page listeners
     */
    private void setViewListeners() {
        Log.d(TAG, "setViewListeners: setting listeners");
        newAccount_EDT_name.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_name.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_email.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_email.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_city.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_city.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_phone.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_phone.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_password.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_password.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_confirmPassword.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                newAccount_EDT_confirmPassword.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    /**
     * A method to check the valid information
     */
    private void checkValidInfo() {
        Log.d(TAG, "checkValidInfo: Checking valid input");
        if (newAccount_EDT_name.getEditText().getText().toString().equals("")) {
            Log.d(TAG, "checkForValidInputs: first name invalid");
            newAccount_EDT_name.setError("enter_name_error");
            return;
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(newAccount_EDT_email.getEditText().getText().toString()).matches()) {
            Log.d(TAG, "checkForValidInputs: Email invalid");
            newAccount_EDT_email.setError("enter_email_error");
            return;
        }
        if (newAccount_EDT_city.getEditText().getText().toString().equals("")) {
            Log.d(TAG, "checkForValidInputs: invalid city");
            //TODO: Search for real cities
            newAccount_EDT_city.setError("enter_city_error");
            return;
        }
        if (newAccount_EDT_phone.getEditText().getText().toString().equals("")) {
            Log.d(TAG, "checkForValidInputs: invalid phone");
            //TODO: Add prefix for number & check if number valid
            newAccount_EDT_phone.setError("enter_phone_error");
            return;
        }
        if (newAccount_EDT_password.getEditText().getText().toString().equals("")
                || newAccount_EDT_password.getEditText().getText().toString().length() < 6) {
            if (newAccount_EDT_password.getEditText().getText().toString().length() < 6) {
                Log.d(TAG, "checkForValidInputs: short password");
                newAccount_EDT_password.setError("six_chars_password_error");
                return;
            } else {
                Log.d(TAG, "checkForValidInputs: invalid password");
                newAccount_EDT_password.setError("null_password");
                return;
            }
        }
        if (newAccount_EDT_confirmPassword.getEditText().getText().toString().equals("")) {
            Log.d(TAG, "checkForValidInputs: confirm invalid");
            newAccount_EDT_confirmPassword.setError("confirm_password");
            return;
        }
        if (!newAccount_EDT_password.getEditText().getText().toString()
                .equals(newAccount_EDT_confirmPassword.getEditText().getText().toString())) {
            Log.d(TAG, "checkForValidInputs: Passwords doesnt match");
            newAccount_EDT_confirmPassword.getEditText().setText("");
            newAccount_EDT_confirmPassword.setError("password_no_match");
            return;
        }
        sendInfoToLoginActivity();


    }

    private void sendInfoToLoginActivity() {
    }


    public static void test(){

    }
}
