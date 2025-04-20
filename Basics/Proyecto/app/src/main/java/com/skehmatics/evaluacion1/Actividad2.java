package com.skehmatics.evaluacion1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    //varb globales
    Button agregar;
    EditText numero;
    ListView lista;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);
        // pa ligar
        numero = findViewById(R.id.numero);
        agregar =  findViewById(R.id.agregar);
        lista = findViewById(R.id.lista);
        // ligar el adaptador
        adaptador = new ArrayAdapter<>(this, R.layout.fila);
        lista.setAdapter(adaptador);
        // codigo click en le boton
        agregar.setOnClickListener(evento -> {
            if (numero.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),
                        "Falta el numero",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            adaptador.add(numero.getText().toString());
            numero.setText("");
        });
        // long click  largo
        lista.setOnItemLongClickListener((adaptador, view, posicion, id) -> {
            // DIALOGO
            AlertDialog.Builder dialogo = new AlertDialog.Builder(Actividad2.this);
            dialogo.setTitle("Eliminar un numero");
            dialogo.setMessage("Estas seguro?");
            dialogo.setPositiveButton("Si", (interfaz, i) -> {
                this.adaptador.remove(this.adaptador.getItem(posicion));
            });
            dialogo.setNegativeButton("No", (interfaz, i) -> {
                //nada
            });
            dialogo.setCancelable(false);
            dialogo.show();
            return true;
        });

    }
}
