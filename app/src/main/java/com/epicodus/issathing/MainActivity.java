package com.epicodus.issathing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mInputButton;
    private EditText mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputButton = (Button) findViewById(R.id.btn_login);
        mEmail = (EditText) findViewById(R.id.input_email);

        mInputButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String email = mEmail.getText().toString();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}
