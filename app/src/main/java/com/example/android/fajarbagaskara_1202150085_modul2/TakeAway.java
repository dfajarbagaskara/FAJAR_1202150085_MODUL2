package com.example.android.fajarbagaskara_1202150085_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onClickOrder(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
