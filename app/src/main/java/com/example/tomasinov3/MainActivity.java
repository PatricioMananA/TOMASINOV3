package com.example.tomasinov3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox seleccionarChk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionarChk = ( CheckBox)findViewById(R.id.chkSeleccionar);
    }

    public void SiguienteACT (View v){
        Intent inte = new Intent(this,Actividad2.class);
        startActivity(inte);

    }

    public void formu (View form){
        Intent inte2 = new Intent(this,Actividad3.class);
        startActivity(inte2);

    }


    public void btnCheck (View v){

        if (seleccionarChk.isChecked()==true){
            String mensaje = "credenciales guardadas";
            Toast toast = Toast.makeText(this,"credenciales guardadas",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START,90,0);
            toast.show();

        }
        else{
            String mensaje = "credenciales no guardadas";
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        }

    }

    public void IrContacto (View form){
        Intent inte3 = new Intent(this,Contacto.class);
        startActivity(inte3);

    }

    public void IrMapas (View form){
        Intent inte4 = new Intent(this,MapsActivity.class);
        startActivity(inte4);

    }

}