package com.h3dg3wytchery.rex.audiovideodemo;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Rex on 6/3/2015.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop(){
        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context context){
        mPlayer = new MediaPlayer.create(context, R.)
    }
}
