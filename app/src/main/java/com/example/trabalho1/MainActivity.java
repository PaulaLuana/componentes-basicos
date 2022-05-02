package com.example.trabalho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer media;
    private ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media = MediaPlayer.create(this, R.raw.music);
    }

    public void orcamento(View view){

        Intent intent = new Intent(this, Orcamento.class);
        startActivity(intent);
    }

    public void play(){
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        if(toggleButton.isChecked()){
            media.start();
        }else{
            media.pause();
        }

    }
}