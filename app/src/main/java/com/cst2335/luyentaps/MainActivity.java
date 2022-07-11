package com.cst2335.luyentaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    firstFragment = findViewById(R.id.fragment1btn);
    secondFragment = findViewById(R.id.fragment2btn);

    firstFragment.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            replacefragment(new fragment1());
        }
    });

    secondFragment.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            replacefragment(new fragment2());
        }
    });


    }//end of onCreate
private void replacefragment(Fragment fragment){
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frameLayout,fragment);
    fragmentTransaction.commit();
}

}//end of class