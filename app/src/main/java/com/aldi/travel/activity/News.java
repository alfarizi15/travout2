package com.aldi.travel.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.aldi.travel.R;
import com.aldi.travel.adapter.AlertDialogManager;
import com.aldi.travel.database.DatabaseHelper;
import com.aldi.travel.session.SessionManager;

import java.util.HashMap;

public class News extends AppCompatActivity {
    Button webView1,webView2,webView3,webView4,webView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webView1 = (Button)findViewById(R.id.button1);
        webView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.detik.com/berita/d-5102071/demo-anies-begini-keluhan-pekerja-karaoke-yang-terpaksa-nganggur?_ga=2.229845916.148101778.1595232992-1438100288.1595232992"));
                startActivity(intent);
            }
        });
        webView2 = (Button)findViewById(R.id.button2);
        webView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.detik.com/berita-jawa-barat/d-5101420/tidur-di-kamarnya-bocah-bandung-barat-tewas-terpanggang?_ga=2.265940879.148101778.1595232992-1438100288.1595232992"));
                startActivity(intent);
            }
        });
        webView3 = (Button)findViewById(R.id.button3);
        webView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.detik.com/berita/d-5090842/ini-analisis-bmkg-soal-gempa-m-51-yang-guncang-bantul?_ga=2.57287466.148101778.1595232992-1438100288.1595232992"));
                startActivity(intent);
            }
        });
        webView4 = (Button)findViewById(R.id.button4);
        webView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.detik.com/berita-jawa-tengah/d-5101282/ngaku-petinggi-aau-napi-ini-tipu-korban-puluhan-juta?_ga=2.32695230.148101778.1595232992-1438100288.1595232992"));
                startActivity(intent);
            }
        });
        webView5 = (Button)findViewById(R.id.button5);
        webView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.detik.com/berita-jawa-timur/d-5101937/terdampak-proyek-rs-warga-di-surabaya-demo-tuntut-kompensasi-rp-50-juta?_ga=2.34735905.148101778.1595232992-1438100288.1595232992"));
                startActivity(intent);
            }
        });


    }
}