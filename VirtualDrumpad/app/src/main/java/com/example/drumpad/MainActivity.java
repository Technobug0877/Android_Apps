package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener   {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=new MediaPlayer();
        m2=new MediaPlayer();
        m3=new MediaPlayer();
        m4=new MediaPlayer();
        m5=new MediaPlayer();
        m6=new MediaPlayer();
        m7=new MediaPlayer();
        m8=new MediaPlayer();


    }

    public void onClick(View v) {
        int id=v .getId();
        switch (id){

            case R.id.One:
                Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();
                m1=MediaPlayer.create(MainActivity.this, R.raw.one);
                m1.start();
                break;
            case R.id.Two:
                m2=MediaPlayer.create(MainActivity.this, R.raw.two);
                m2.start();
                break;
            case R.id.Three:
                m3=MediaPlayer.create(MainActivity.this, R.raw.three);
                m3.start();
                break;
            case R.id.Four:
                m4=MediaPlayer.create(MainActivity.this, R.raw.four);
                m4.start();
                break;
            case R.id.Five:
                m5=MediaPlayer.create(MainActivity.this, R.raw.fv);
                m5.start();
                break;
            case R.id.Six:
                m6=MediaPlayer.create(MainActivity.this, R.raw.sixth);
                m6.start();
                break;
            case R.id.Seven:
                m7=MediaPlayer.create(MainActivity.this, R.raw.seventh);
                m7.start();
                break;
            case R.id.Eight:
                m8=MediaPlayer.create(MainActivity.this, R.raw.eighth);
                m8.start();
                break;
            default:
                break;

        }

    }


}
