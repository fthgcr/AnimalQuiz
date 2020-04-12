package com.example.animalquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level1Activity extends AppCompatActivity {

    Button dolphin, buffalo, sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        buffalo = findViewById(R.id.buttonBuffalo);
        dolphin = findViewById(R.id.buttonDolphin);
        sound = findViewById(R.id.buttonSound);
        final MediaPlayer dolphinSound = MediaPlayer.create(this, R.raw.dolphin);

        buffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Level1Activity.this, "Yanlis Cevap", Toast.LENGTH_LONG).show();
            }
        });

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dolphinSound.start();
            }
        });
        dolphin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newLevel = new Intent(Level1Activity.this, SuccessActivity.class);
                startActivity(newLevel);
            }
        });
    }
}
