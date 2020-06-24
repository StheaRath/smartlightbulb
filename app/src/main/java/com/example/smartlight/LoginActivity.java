package com.example.smartlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private Intent getdata;
    private String userName,userPassword;
    private EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.usernameLogin);
        password = findViewById(R.id.passwdLogin);

        getdata = getIntent();
        userName = getdata.getStringExtra("username");
        userPassword = getdata.getStringExtra("password");
    }
    public void onClick(View view){

        String a = username.getText().toString();
        String b = password.getText().toString();
        if(userName.equals(a) && userPassword.equals(b)){
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("username",a);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }

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
