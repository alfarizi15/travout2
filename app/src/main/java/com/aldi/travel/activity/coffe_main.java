package com.aldi.travel.activity;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import com.aldi.travel.R;
public class coffe_main extends AppCompatActivity {

    private ArrayList<ItemCoffe> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffe_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adaptercoffe(items,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        //i am prepare strings for this project
        items.add(new ItemCoffe(R.drawable.wisata_jakarta1,getString(R.string.jakarta1_title),getString(R.string.jakarta1_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_jakarta2,getString(R.string.jakarta2_title),getString(R.string.jakarta2_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_jakarta3,getString(R.string.jakarta3_title),getString(R.string.jakarta3_desc)));

        items.add(new ItemCoffe(R.drawable.wisata_bandung1,getString(R.string.bandung1_title),getString(R.string.bandung1_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_bandung2,getString(R.string.bandung2_title),getString(R.string.bandung2_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_bandung3,getString(R.string.bandung3_title),getString(R.string.bandung3_desc)));

        items.add(new ItemCoffe(R.drawable.wisata_purwekerto1,getString(R.string.purwekerto1_title),getString(R.string.purwekerto1_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_purwekerto2,getString(R.string.purwekerto2_title),getString(R.string.purwekerto2_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_purwekerto3,getString(R.string.purwekerto3_title),getString(R.string.purwekerto3_desc)));

        items.add(new ItemCoffe(R.drawable.wisata_yogyakarta1,getString(R.string.yogjakarta1_title),getString(R.string.yogyakarta1_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_yogyakarta2,getString(R.string.yogyakarta2_title),getString(R.string.yogyakarta2_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_yogyakarta3,getString(R.string.yogyakarta3_title),getString(R.string.yogyakarta3_desc)));

        items.add(new ItemCoffe(R.drawable.wisata_surabya1,getString(R.string.surabaya1_title),getString(R.string.surabaya1_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_surabya2,getString(R.string.surabya2_title),getString(R.string.surabaya2_desc)));
        items.add(new ItemCoffe(R.drawable.wisata_surabya3,getString(R.string.surabya3_title),getString(R.string.surabya3_desc)));


    }
}
