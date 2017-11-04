package com.example.lenovo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.etname);
        Login = (Button) findViewById(R.id.button);


    }
    private void validate(String UserName, String UserPassword){
        if ((UserName == "admin") && (UserPassword == "1234"))


    }

}
