package com.example.gabrielmoura.ace1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class Sell1Activity extends AppCompatActivity {

    private void openSell2RulesActivity() {
        Intent intent = new Intent(this, Sell2RulesActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell1);

        ImageButton info1= (ImageButton) findViewById(R.id.InfoButton1);
        ImageButton info2= (ImageButton) findViewById(R.id.InfoButton2);
        ImageButton info3= (ImageButton) findViewById(R.id.InfoButton3);
        ImageButton info4= (ImageButton) findViewById(R.id.InfoButton4);
        ImageButton info5= (ImageButton) findViewById(R.id.InfoButton5);
        Button next= (Button) findViewById(R.id.NextButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSell2RulesActivity();
            }
        });
    }
    @Override
    public void onBackPressed(){ //Botão BACK padrão do android
        startActivity(new Intent(this, MainActivity.class)); //O efeito ao ser pressionado do botão (no caso abre a activity)
        finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
        return;
    }
}