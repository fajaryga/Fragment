package com.fajaryoga.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toAct(View view) {
        Intent pindahAct = new Intent(MainActivity.this, pindah_Activity.class);
        startActivity(pindahAct);
    }

    public void toFrg(View view) {
        Intent pindahFrg = new Intent(MainActivity.this, fragment_Activity.class);
        startActivity(pindahFrg);
    }
}
