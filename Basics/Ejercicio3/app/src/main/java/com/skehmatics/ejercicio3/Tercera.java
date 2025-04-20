package com.skehmatics.ejercicio3;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tercera extends AppCompatActivity {
    ConstraintLayout fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera);
        // codogp para ligar
        fondo = findViewById(R.id.fondo);
        // codigo para un click en el fondo
        fondo.setOnClickListener(evento ->{
            // codigo para lanzar una actividad
            Intent actividad = new Intent(this, Primera.class);
            startActivity(actividad);
            // Codigp para cerrar esta actividad
            finish();
        });
    }
}
