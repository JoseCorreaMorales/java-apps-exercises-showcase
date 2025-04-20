package com.skehmatics.ejercicio6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta3 extends AppCompatActivity {
    // variables globales
    Button finalizar;
    RadioButton correcta;
    int aciertos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3);
        // recibir
        aciertos =  getIntent().getIntExtra("aciertos", 0);
        // ligar
        finalizar = findViewById(R.id.finalizar);
        correcta = findViewById(R.id.correcta);
        // click en boton
        finalizar.setOnClickListener(evento -> {
            if (correcta.isChecked()){
                aciertos++;
            }
            // lanzar actividad
            Intent actividad = new Intent(this, Resultado.class);
            // codigo enviar
            actividad.putExtra("aciertos", aciertos);
            startActivity(actividad);
            // cerrar
            finish();
        });
    }

    // evitar cierre
    @Override
    public void onBackPressed(){
        onResume();
    }
    }

