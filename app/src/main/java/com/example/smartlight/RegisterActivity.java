package com.example.smartlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private EditText username,password,email,phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.usernameRegister);
        password = findViewById(R.id.passwdRegister);
        email = findViewById(R.id.emailRegister);
        phone = findViewById(R.id.phoneRegister);
    }

    public void onRegister(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        intent.putExtra("username",username.getText().toString());
        intent.putExtra("password",password.getText().toString());
        intent.putExtra("email",email.getText().toString());
        intent.putExtra("phone",phone.getText().toString());
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
}
