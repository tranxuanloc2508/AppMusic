package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MusicLibActivity extends AppCompatActivity {

    ImageView img_MusicLib,img_SubLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_lib);

        img_MusicLib = (ImageView)findViewById(R.id.musicLib);
        img_SubLib =(ImageView)findViewById(R.id.subIV);
    }
}