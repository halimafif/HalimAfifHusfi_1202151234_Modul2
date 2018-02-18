package com.afifhalim.halimafifhusfi_1202151234;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuDetail extends AppCompatActivity {

    TextView tv_ice, tv_price;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmenu_activity);
        Intent intent = getIntent();
        String icecream = intent.getStringExtra("ice cream");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_ice = (TextView)findViewById(R.id.tv_detailFood);
        tv_price = (TextView)findViewById(R.id.tv_detailPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto);

        tv_ice.setText(icecream);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
