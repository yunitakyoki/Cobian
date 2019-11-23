package com.dicoding.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
EditText inputUsername, inputPassword;
CheckBox checkBox;
Button btnLogin;

    String username="admin";
    String password="yuni";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        inputUsername=findViewById(R.id.username);
        inputPassword= findViewById(R.id.password);
        checkBox=findViewById(R.id.checkbox);
        btnLogin=findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        checkBox.setOnCheckedChangeListener(this);


    }

    @Override
    public void onClick(View v) {
             String user = inputUsername.getText().toString();
             String pass = inputPassword.getText().toString();

             if (username.equals(user)&&password.equals(pass)){
                 Toast.makeText(this, "Login Succes", Toast.LENGTH_SHORT).show();
                 Intent pindah =new Intent(this, MainActivity.class);
                 startActivity(pindah);

             }
             else {
                 Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
             }
        }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    if (!isChecked) {
        inputPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

        else {
            inputPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    }
}
