package com.cst2335.luyentaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn = findViewById(R.id.btnmain);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
            public void openActivity2(){
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }
        });

    }//end of onCreate



}//end of class