package com.nathan.createaccountlibrary;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class EasyForm extends Dialog {


    private static final String TAG = "EasyForm";

    public static class Builder {

        private Context context;
        private int width, height;
        private boolean doNameBox = false;
        private boolean doEmailBox = false;
        private boolean doCountryBox = false;
        private boolean doCityBox = false;
        private boolean doPhoneBox = false;
        private boolean doPasswordBox = false;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setDimensions(int width, int height) {
            Log.d(TAG, "setDimensions: Setting dimensions");
            this.width = width;
            this.height = height;
            return this;
        }

        public Builder setNameBox() {
            this.doNameBox = true;
            return this;
        }

        public Builder setEmailBox() {
            this.doEmailBox = true;
            return this;
        }

        public Builder setCountryBox() {
            this.doCountryBox = true;
            return this;
        }

        public Builder setCityBox() {
            this.doCityBox = true;
            return this;
        }

        public Builder setPhoneBox() {
            this.doPhoneBox = true;
            return this;
        }

        public Builder setPasswordBox() {
            this.doPasswordBox = true;
            return this;
        }


        public EasyForm build() {
            Log.d(TAG, "build: Building EasyDialog");
            EasyForm easyForm = new EasyForm(this.context, this);
            easyForm.show();
            easyForm.getWindow().setLayout(this.width, this.height);
            return easyForm;
        }
    }

    private Context context;
    private Builder builder;

    private EditText newAccount_EDT_name;
    private EditText newAccount_EDT_email;
    private EditText newAccount_EDT_phone;
    private EditText newAccount_EDT_city;
    private EditText newAccount_EDT_country;
    private EditText newAccount_EDT_password;
    private EditText newAccount_EDT_confirmPassword;
    private Button newAccount_EDT_submit;


    private EasyForm(Context context, Builder builder) {
        super(context);
        this.context = context;
        this.builder = builder;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        findViews();
        setViewListeners();
        setViews();
    }

    private void setViews() {
        if (builder.doNameBox) {
            newAccount_EDT_name.setVisibility(View.VISIBLE);
        }
        if (builder.doEmailBox) {
            newAccount_EDT_email.setVisibility(View.VISIBLE);
        }
        if (builder.doPhoneBox) {
            newAccount_EDT_phone.setVisibility(View.VISIBLE);
        }
        if (builder.doCityBox) {
            newAccount_EDT_city.setVisibility(View.VISIBLE);
        }
        if (builder.doCountryBox) {
            newAccount_EDT_country.setVisibility(View.VISIBLE);
        }
        if (builder.doPasswordBox) {
            newAccount_EDT_password.setVisibility(View.VISIBLE);
            newAccount_EDT_confirmPassword.setVisibility(View.VISIBLE);
        }

    }

    private void findViews() {
        newAccount_EDT_name = findViewById(R.id.newAccount_EDT_name);
        newAccount_EDT_email = findViewById(R.id.newAccount_EDT_email);
        newAccount_EDT_phone = findViewById(R.id.newAccount_EDT_phone);
        newAccount_EDT_city = findViewById(R.id.newAccount_EDT_city);
        newAccount_EDT_country = findViewById(R.id.newAccount_EDT_country);
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
     * A method to create the return object
     */
    private EasyFormObject initReturnObject() {
        Log.d(TAG, "initReturnObject: ");
        EasyFormObject easyFormObject = new EasyFormObject();
        if (builder.doNameBox) {
            easyFormObject.setName(newAccount_EDT_name.getText().toString());
        }
        if (builder.doEmailBox) {
            easyFormObject.setEmail(newAccount_EDT_email.getText().toString());
        }
        if (builder.doCityBox) {
            easyFormObject.setCity(newAccount_EDT_city.getText().toString());
        }
        if (builder.doCountryBox) {
            easyFormObject.setCountry(newAccount_EDT_country.getText().toString());
        }
        if (builder.doPhoneBox) {
            easyFormObject.setPhone(newAccount_EDT_phone.getText().toString());
        }
        if (builder.doPasswordBox) {
            easyFormObject.setPassword(newAccount_EDT_password.getText().toString());
        }
        return easyFormObject;
    }

    /**
     * A method to set the view listeners
     */
    private void setViewListeners() {
        Log.d(TAG, "setViewListeners: setting listeners");
        newAccount_EDT_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               // newAccount_EDT_name.setError("error");// disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               // newAccount_EDT_email.setError("error"); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_city.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
              //  newAccount_EDT_city.setError("error"); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_country.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               // newAccount_EDT_country.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               // newAccount_EDT_phone.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //newAccount_EDT_password.setErrorEnabled(false); // disable error
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newAccount_EDT_confirmPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
              //  newAccount_EDT_confirmPassword.setErrorEnabled(false); // disable error
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
        if (newAccount_EDT_name.getText().toString().equals("") && builder.doNameBox) {
            Log.d(TAG, "checkForValidInputs: first name invalid");
            newAccount_EDT_name.setError("Please enter a name");
            return;
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(newAccount_EDT_email.getText().toString()).matches()
                && builder.doEmailBox) {
            Log.d(TAG, "checkForValidInputs: Email invalid");
            newAccount_EDT_email.setError("Please enter a valid email address");
            return;
        }
        if (newAccount_EDT_city.getText().toString().equals("") && builder.doCityBox) {
            Log.d(TAG, "checkForValidInputs: invalid city");
            newAccount_EDT_city.setError("Please enter a city");
            return;
        }
        if (newAccount_EDT_country.getText().toString().equals("") && builder.doCountryBox) {
            Log.d(TAG, "checkForValidInputs: invalid city");
            newAccount_EDT_country.setError("Please enter a city");
            return;
        }
        if (newAccount_EDT_phone.getText().toString().equals("") && builder.doPhoneBox) {
            Log.d(TAG, "checkForValidInputs: invalid phone");
            newAccount_EDT_phone.setError("Please enter phone number");
            return;
        }
        if ((newAccount_EDT_password.getText().toString().equals("")
                || newAccount_EDT_password.getText().toString().length() < 6) && builder.doPasswordBox) {
            if (newAccount_EDT_password.getText().toString().length() < 6) {
                Log.d(TAG, "checkForValidInputs: short password");
                newAccount_EDT_password.setError("Please enter at least 6 digits");
                return;
            } else {
                Log.d(TAG, "checkForValidInputs: invalid password");
                newAccount_EDT_password.setError("Invalid password");
                return;
            }
        }
        if (newAccount_EDT_confirmPassword.getText().toString().equals("") && builder.doPasswordBox) {
            Log.d(TAG, "checkForValidInputs: confirm invalid");
            newAccount_EDT_confirmPassword.setError("Please confirm password");
            return;
        }
        if (!newAccount_EDT_password.getText().toString()
                .equals(newAccount_EDT_confirmPassword.getText().toString()) && builder.doPasswordBox) {
            Log.d(TAG, "checkForValidInputs: Passwords doesn't match");
            newAccount_EDT_confirmPassword.setText("");
            newAccount_EDT_confirmPassword.setError("Passwords didn't match");
            return;
        }
        sendInfoToCaller();


    }

    /**
     * A method to callback the container object to the calling activity
     */
    private void sendInfoToCaller() {
        Log.d(TAG, "sendInfoToCaller: ");
        EasyFormObject object = initReturnObject();
        ((EasyFormSubmitListener) context).getEasyDialogObject(object);
        dismiss();
    }

}
