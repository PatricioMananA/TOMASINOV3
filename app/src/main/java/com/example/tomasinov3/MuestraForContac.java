package com.example.tomasinov3;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MuestraForContac extends Activity {

    private Bundle bundle;
    private Bundle bundle2;
    private Bundle bundle3;
    private Bundle bundle4;
    private TextView tvnombre;
    private TextView tvapellido;
    private TextView tvcorreo;
    private TextView tvmensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_for_contac);

        tvnombre = (TextView) findViewById(R.id.tvnombre);
        tvapellido = (TextView) findViewById(R.id.tvapellido);
        tvcorreo = (TextView) findViewById(R.id.tvcorreo);
        tvmensaje= (TextView) findViewById(R.id.tvmensaje);

        bundle = getIntent().getExtras();
        bundle2 = getIntent().getExtras();
        bundle3 = getIntent().getExtras();
        bundle4 = getIntent().getExtras();

        String nombre = bundle.getString("nombre");
        String apellido = bundle2.getString("apellido");
        String correo = bundle3.getString("correo");
        String mensaje = bundle4.getString("mensaje");

        tvnombre.append(" " + nombre );
        tvapellido.append(" " + apellido );
        tvcorreo.append(" " + correo );
        tvmensaje.append(" " + mensaje );

    }

    public void IrPrincipal (View form){
        Intent inte3 = new Intent(this,MainActivity.class);
        startActivity(inte3);
        Toast.makeText(MuestraForContac.this, "Gracias , te respondere a la brevedad", Toast.LENGTH_SHORT).show();
    }



}