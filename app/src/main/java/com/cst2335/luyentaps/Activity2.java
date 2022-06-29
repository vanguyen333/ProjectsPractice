package com.cst2335.luyentaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView name, age;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name = findViewById(R.id.textview2name);
        age = findViewById(R.id.textview2age);
        btn2 = findViewById(R.id.btnactivity2);

        String getname = getIntent().getStringExtra("keyname");
        String getage = getIntent().getStringExtra("keyage");

        name.setText(getname);
        age.setText(getage);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtoActivity1();
            }
            public void backtoActivity1(){
                Intent intent = new Intent(Activity2.this, Activity1.class);
                startActivity(intent);
            }

        });

    }//end of onCreate
}//end of class