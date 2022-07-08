package com.example.trabalho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media = MediaPlayer.create(this, R.raw.music);
        setUpListeners();
    }

    private void setUpListeners() {
        ToggleButton toggle = findViewById(R.id.toggleButton);
        Button orcamento = findViewById(R.id.orcamento);

        toggle.setBackgroundResource(R.color.green);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    media.start();
                    toggle.setBackgroundResource(R.color.red);
                } else {
                    media.pause();
                    toggle.setBackgroundResource(R.color.green);
                }
            }
        });

        orcamento.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have pressed it long :)", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, OrcamentoActivity.class);
                startActivity(intent);
            }
        });


    }

}