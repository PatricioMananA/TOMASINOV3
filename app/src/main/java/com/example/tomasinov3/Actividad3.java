package com.example.tomasinov3;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Actividad3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ConstraintLayout Layout ;


    String [] country = {"seleccione sede","Santiago centro",
            "San Joaquin",
            "Arica",
            "Iquique",
            "Antofagasta",
            "Copiapo",
            "la serana",
            "Ovalle",
            "Viña del mar",
            "Rancagua",
            "Curico",
            "Talca",
            "Chillan",
            "concepcion",
            "Los angeles", "Temuco",
            "Valdivia",
            "Osorno",
            "Puerto Montt",
            "Punta Arenas",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        Layout = findViewById(R.id.Layout);


        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void snack (View v2){
        Snackbar.make(Layout,"Datos guardados correctamente", Snackbar.LENGTH_LONG).setAction("Cerrar", new View.OnClickListener() {
            @Override
            public void onClick(View v3) {

            }
        })
                .setActionTextColor(getResources().getColor(R.color.purple_200)).show();

    }

}