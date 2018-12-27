package br.com.senai.spotffy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView heiswe;
    private Button playUm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heiswe = findViewById(R.id.imgPrincipal);

        //Abrindo nova janela
        heiswe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                /*
                * Outro jeito:
                * Intent intent = new Intent( packageContext: MainActivity.this, heisweActivity.class);
                *startActivity(intent);
                * */

                startActivity(new Intent(MainActivity.this, heisweActivity.class));
            }
        });

    }
}