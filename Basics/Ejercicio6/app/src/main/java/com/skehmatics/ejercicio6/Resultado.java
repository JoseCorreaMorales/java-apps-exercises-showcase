package com.skehmatics.ejercicio6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    // variables globales
    TextView resultado;
    int aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        // codigo recibir
        aciertos = getIntent().getIntExtra("aciertos", 0);
        // ligar
        resultado = findViewById(R.id.resultado);

        resultado.setText(aciertos + " Acierto(s)");
    }
}
