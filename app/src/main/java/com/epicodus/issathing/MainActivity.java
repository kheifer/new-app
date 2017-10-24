package com.epicodus.issathing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mInputButton;
    private EditText mName;
    private EditText mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputButton = (Button) findViewById(R.id.btn_login);
        mName = (EditText) findViewById(R.id.input_name);
        mEmail = (EditText) findViewById(R.id.input_email);


        mInputButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = mName.getText().toString();
                String email = mEmail.getText().toString();
                if((name.length()<= 2)||!email.contains("@")||!email.contains(".")){
                    Toast.makeText(MainActivity.this, "Please fill out all the fields!", Toast.LENGTH_SHORT).show();
                } else {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("username", name);
                intent.putExtra("email", email);
                startActivity(intent);
                finish();
                }
            }
        });
    }
}
