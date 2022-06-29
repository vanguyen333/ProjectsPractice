package com.cst2335.luyentaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    EditText name, age;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        name = findViewById(R.id.edit1_name);
        age = findViewById(R.id.edit1age);

        btn = findViewById(R.id.btnmain);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getname = name.getText().toString();
                String getage = age.getText().toString();
                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("keyname",getname);
                intent.putExtra("keyage",getage);
                startActivity(intent);
            }

        });

    }//end of onCreate



}//end of class