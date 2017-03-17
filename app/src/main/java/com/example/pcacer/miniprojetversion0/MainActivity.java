package com.example.pcacer.miniprojetversion0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username;
    EditText password;
    String usernamet;
    String passwordt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login= (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                username =(EditText) findViewById(R.id.user);
                password =(EditText) findViewById(R.id.pwd);
                usernamet=username.getText().toString();
                passwordt= password.getText().toString();
                if(usernamet.equals("client")&& passwordt.equals("client")){
                startActivity(new Intent(MainActivity.this, MainListLog.class));
            }}
        });
    }
}
