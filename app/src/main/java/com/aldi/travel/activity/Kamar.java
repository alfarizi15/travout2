package com.aldi.travel.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.aldi.travel.R;

public class Kamar extends AppCompatActivity {
    Button webkmr1,webkmr2,webkmr3,webkmr4,webkmr5,webkmr6,webkmr7,webkmr8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kamar);
        webkmr1 = (Button)findViewById(R.id.kmr1);
        webkmr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/capsule-old-batavia.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2679652;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=price;srepoch=1595325025;srpvid=2c434530e1f9018a;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr2 = (Button)findViewById(R.id.kmr2);
        webkmr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/mk-house-tendean-kota-jakarta-selatan.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2679652;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1595324805;srpvid=40fe44c2beb10187;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr3 = (Button)findViewById(R.id.kmr3);
        webkmr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/the-packer-lodge.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2679652;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1595324805;srpvid=40fe44c2beb10187;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr4 = (Button)findViewById(R.id.kmr4);
        webkmr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/kini-capsule.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2679652;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1595324805;srpvid=40fe44c2beb10187;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr5 = (Button)findViewById(R.id.kmr5);
        webkmr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/vk-pods-bandung.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2671576;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=13;hpos=13;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=price;srepoch=1595325087;srpvid=68f0454f6fcd0002;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr6 = (Button)findViewById(R.id.kmr6);
        webkmr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/eve-guest-house.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2671576;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=19;hpos=19;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=price;srepoch=1595325087;srpvid=68f0454f6fcd0002;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr7 = (Button)findViewById(R.id.kmr7);
        webkmr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/mitra-dago-antapani-bandung.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2671576;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=26;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=price;srepoch=1595325186;srpvid=2f7e4581f2c6001a;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });
        webkmr8 = (Button)findViewById(R.id.kmr8);
        webkmr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/id/mitra-mutiara-inn.id.html?aid=397594;label=gog235jc-1DCAEoggI46AdIElgDaGiIAQGYARK4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AufX2vgFwAIB0gIkNzZkNDczNGUtMzIxMC00YTgxLWE1N2QtM2JlZWQ2ZmE2YzEy2AIE4AIB;sid=757e39382553ce2a33a632e8f7a35465;dest_id=-2671576;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=36;hpos=11;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=price;srepoch=1595325186;srpvid=2f7e4581f2c6001a;type=total;ucfs=1&#hotelTmpl"));
                startActivity(intent);
            }
        });


    }
}