package com.example.laptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
EditText lp;
Button ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        lp=findViewById(R.id.lap);
        ob=findViewById(R.id.btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((lp.getText().toString()).equalsIgnoreCase("LENOVO"))
                {
                    Intent intent=new Intent(MainActivity.this,LENOVO.class);
                    startActivity(intent);

                }
                if((lp.getText().toString()).equalsIgnoreCase("DELL"))
                {
                    Intent i=new Intent(MainActivity.this,DELL.class);
                    startActivity(i);

                }

            }
        });


    }
}
