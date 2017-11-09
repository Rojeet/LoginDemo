package com.example.lenovo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        EditText username;
        EditText password;

        private String Name;
        private String Password;

        Button login;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EditText editTextUserName = (EditText) findViewById(R.id.nametxt);
            Name = editTextUserName.getText().toString();
            EditText editTextPassword = (EditText)findViewById(R.id.passwordtxt);
            Password = editTextPassword.getText().toString();
            login = (Button) findViewById(R.id.loginbtn);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setLogin();
                }
            });



        }

        public void setLogin() {
            Name = username.getText().toString().trim();
            Password = password.getText().toString().trim();
            if (!validate()){
                Toast.makeText(this, "Invalid Name",Toast.LENGTH_SHORT).show();
            }else{
                onSignupSuccess();
            }


        }
        public boolean validate(){
            boolean valid = true;
            if (Name.isEmpty() || Password.isEmpty()) {
                Toast.makeText(this, "Invalid Name", Toast.LENGTH_SHORT).show();
                valid = false;
            }
            return valid;

        }
        public void onSignupSuccess(){
            //TODO WHAT WILL GO AFTER SIGHNUP
        }
    }
