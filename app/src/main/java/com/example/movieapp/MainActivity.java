package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    String getUname,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.login);
        e1=(EditText) findViewById(R.id.usename);
        e2=(EditText) findViewById(R.id.passs);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUname=e1.getText().toString();
                getPass=e2.getText().toString();
                if(getUname.equals("theatre") && getPass.equals("1234")) {
                    Intent k = new Intent(getApplicationContext(), DashBoardActivity.class);
                    startActivity(k);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Inavlid credential", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}