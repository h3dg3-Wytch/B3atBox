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

    public void pause(){
        if(mPlayer.isPlaying()){
            mPlayer.pause();
        } else {
            mPlayer.start();
        }

    }

    public void play(Context context){

        stop();
        mPlayer = new MediaPlayer().create(context, R.raw.beat1);

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mPlayer.stop();
            }
        });

        mPlayer.start();
    }
}
