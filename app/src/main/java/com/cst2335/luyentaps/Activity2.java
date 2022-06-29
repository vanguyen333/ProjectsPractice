package com.cst2335.luyentaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn2 = findViewById(R.id.btnactivity2);
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