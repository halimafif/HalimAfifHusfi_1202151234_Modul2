package com.afifhalim.halimafifhusfi_1202151234;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.takeaway_activity);
    }

    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class); //melakukan intent ke activity Menu
        startActivity(intent);
    }
}