package com.skehmatics.ejercicio5;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Tercera extends AppCompatActivity {
    // variables globales
    ConstraintLayout fondo;
    float xi;
    float xf;
    float mitad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera);
        // codigo para ligar
        fondo = findViewById(R.id.fondo);
        // codigo paa el touch en el fondo
        fondo.setOnTouchListener((view, evento) -> {
            if (evento.getAction() == MotionEvent.ACTION_DOWN){
                xi = evento.getX();
            }
            if (evento.getAction() == MotionEvent.ACTION_UP){
                xf = evento.getX();
                mitad = fondo.getWidth()/2;
                if (xi>mitad && xf<mitad) {
                    // codigo para lanzar una actividad
                    Intent actividad = new Intent(this, Primera.class);
                    startActivity(actividad);
                    // cerrar
                    finish();
                }
                if (xi<mitad && xf>mitad){
                    // codigo para lanzar una actividad
                    Intent actividad = new Intent(this, Segunda.class);
                    startActivity(actividad);
                    // cerrar
                    finish();
                }
            }
            return true;
        });
    }
}
