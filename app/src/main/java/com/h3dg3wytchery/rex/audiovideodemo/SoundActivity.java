package com.h3dg3wytchery.rex.audiovideodemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SoundActivity extends ActionBarActivity {

    private AudioPlayer mPlayer = new AudioPlayer();

    private ImageButton mPlayButton;
    private ImageButton mNextButton;
    private ImageButton mPauseButton;

    private Button mRickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);

        mPlayButton = (ImageButton) findViewById(R.id.playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.play(getApplicationContext());
                mPlayButton.setEnabled(false);
            }
        });

        mNextButton = (ImageButton) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
            }
        });

        mPauseButton = (ImageButton) findViewById(R.id.pauseButton);
        mPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.pause();
                mPlayButton.setEnabled(true);
            }
        });

        mRickButton = (Button) findViewById(R.id.rickButton);
        mRickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RickActivity.class);
                startActivity(i);
            }
        });

    }



}
