package com.example.tomasinov3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Actividad2 extends AppCompatActivity {

    private RecyclerView recyclerViewPersona;
    private  RecyclerViewAdaptador adaptadorPersona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        recyclerViewPersona=(RecyclerView)findViewById(R.id.recyclerPersonas);
        recyclerViewPersona.setLayoutManager(new LinearLayoutManager(this));

        adaptadorPersona = new RecyclerViewAdaptador(obtenerPersonas());
        recyclerViewPersona.setAdapter(adaptadorPersona);
    }


    public List<PersonaModelo> obtenerPersonas(){
        List <PersonaModelo> persona = new ArrayList<>();
        persona.add(new PersonaModelo("pato","gonzalez",R.drawable.nombre));
        persona.add(new PersonaModelo("andres","perez",R.drawable.facebook));
        persona.add(new PersonaModelo("nicol","soto",R.drawable.facebook));
        persona.add(new PersonaModelo("sandra","lolo",R.drawable.facebook));
        persona.add(new PersonaModelo("pato","gonzalez",R.drawable.nombre));
        persona.add(new PersonaModelo("andres","perez",R.drawable.facebook));
        persona.add(new PersonaModelo("nicol","soto",R.drawable.facebook));
        persona.add(new PersonaModelo("sandra","lolo",R.drawable.facebook));
        persona.add(new PersonaModelo("pato","gonzalez",R.drawable.nombre));
        persona.add(new PersonaModelo("andres","perez",R.drawable.facebook));
        persona.add(new PersonaModelo("nicol","soto",R.drawable.facebook));
        persona.add(new PersonaModelo("sandra","lolo",R.drawable.facebook));
        persona.add(new PersonaModelo("pato","gonzalez",R.drawable.nombre));
        persona.add(new PersonaModelo("andres","perez",R.drawable.facebook));
        persona.add(new PersonaModelo("nicol","soto",R.drawable.facebook));
        persona.add(new PersonaModelo("sandra","lolo",R.drawable.facebook));
        return persona;
    }
}