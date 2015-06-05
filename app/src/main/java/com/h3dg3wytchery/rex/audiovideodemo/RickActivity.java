package com.h3dg3wytchery.rex.audiovideodemo;

import android.app.Activity;
import android.graphics.PixelFormat;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Rex on 6/4/2015.
 */
public class RickActivity extends Activity {

    private VideoView view;

    protected void onCreate(Bundle onSaveInstance){
        super.onCreate(onSaveInstance);
        setContentView(R.layout.activity_rick);


        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        VideoView videoHolder = new VideoView(this);
//if you want the controls to appear
        videoHolder.setMediaController(new MediaController(this));
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.rickroll); //do not add any extension
//if your file is named sherif.mp4 and placed in /raw
//use R.raw.sherif
        videoHolder.setVideoURI(video);
        setContentView(videoHolder);
        videoHolder.start();

        

    }
}
