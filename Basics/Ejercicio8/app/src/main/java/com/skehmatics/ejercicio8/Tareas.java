package com.skehmatics.ejercicio8;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tareas extends AppCompatActivity {
    // variables globales
    Button agregar;
    EditText tarea;
    ListView lista;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tareas);
        //ligar
        agregar = findViewById(R.id.agregar);
        tarea = findViewById(R.id.tarea);
        lista = findViewById(R.id.lista);
        // ligar adaptador
        adaptador = new ArrayAdapter<>(this, R.layout.fila);
        lista.setAdapter(adaptador);
        // codigo click button
        agregar.setOnClickListener(evento -> {
            if (tarea.getText().toString().equals("")){
                // mensaje
                Toast.makeText(getApplicationContext(),
                        "Falta la tarea",
                Toast.LENGTH_SHORT).show();
                return;

            }
            adaptador.add(tarea.getText().toString());
            tarea.setText("");

         });
// codigo del long click
        lista.setOnItemLongClickListener((adaptador, view, posicion, id) -> {
            // codigo del dialogo
            AlertDialog.Builder dialogo = new AlertDialog.Builder(Tareas.this);
            dialogo.setTitle("Eliminar una tarea");
            dialogo.setMessage("Estas seguro?");
            dialogo.setPositiveButton("Si", (interfaz, i)-> {
                this.adaptador.remove(this.adaptador.getItem(posicion));
            });
dialogo.setNegativeButton("No", ( interfaz, i) -> {

            });
       dialogo.setCancelable(false);
       dialogo.show();
       return true;

    });

   }
}
