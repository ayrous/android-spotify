package br.com.senai.spotffy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class heisweActivity extends AppCompatActivity {


    private Button playUm;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heiswe);

        playUm = findViewById(R.id.btnUm);
        player = MediaPlayer.create(heisweActivity.this, R.raw.allaboutus);

    //Aplicando evento no botãoUm
        playUm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(player.isPlaying()){
                pausarMusica();
            }else{
                tocarMusica();
            }
        }
    });
}

    private void tocarMusica(){
        if(player != null){
            player.start();
        }
    }

    private void pausarMusica(){
        if(player != null){
            player.pause();
        }
    }

    @Override
    protected void onDestroy() {
        if (player != null) {
            player.release();
            player.stop();
            player = null;
            super.onDestroy();
        }
    }
}