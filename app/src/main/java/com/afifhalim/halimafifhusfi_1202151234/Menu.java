package com.afifhalim.halimafifhusfi_1202151234;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> IceList = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, IceList, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){ //list menu makanan
            IceList.add("Ice Bubble Gum");
            IceList.add("Ice Coklat");
            IceList.add("Ice Strawberry");
            IceList.add("Ice Vanila");
            IceList.add("Ice Oreo");

            priceses.add(15000); //list harga
            priceses.add(12000);
            priceses.add(15000);
            priceses.add(15000);
            priceses.add(17000);

            photos.add(R.drawable.ice1); //list gambar yang akan ditampilkan
            photos.add(R.drawable.ice2);
            photos.add(R.drawable.ice3);
            photos.add(R.drawable.ice4);
            photos.add(R.drawable.ice6);
        }
    }
}
