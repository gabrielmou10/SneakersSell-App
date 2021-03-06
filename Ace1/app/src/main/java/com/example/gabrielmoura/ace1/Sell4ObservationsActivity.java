package com.example.gabrielmoura.ace1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class Sell4ObservationsActivity extends AppCompatActivity {

    private void openCameraActivity() {
        Intent intent = new Intent(this, Sell5CameraActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell4_observations);

        Switch Switch1= (Switch) findViewById(R.id.Switch1);
        Switch Switch2= (Switch) findViewById(R.id.Switch2);
        Switch Switch3= (Switch) findViewById(R.id.Switch3);
        Switch Switch4= (Switch) findViewById(R.id.Switch4);
        Switch Switch5= (Switch) findViewById(R.id.Switch5);
        Switch Switch6= (Switch) findViewById(R.id.Switch6);
        Switch Switch7= (Switch) findViewById(R.id.Switch7);
        Switch Switch8= (Switch) findViewById(R.id.Switch8);
        ImageButton Next= (ImageButton) findViewById(R.id.nextbuttonsell4);
        ImageButton back = (ImageButton) findViewById(R.id.backbuttonsell4);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCameraActivity();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Goback();
            }
        });


    }
    @Override
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, Sell3Activity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }

    private void Goback() {
        Intent intent = new Intent(this, Sell3Activity.class);
        startActivity(intent);
        finish();
    }
}