package com.example.keiller.Listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by KEILLER on 14/04/2018.
 */

//Operacion del area del Circulo
public class Operar_Area_Circulo extends AppCompatActivity {
    private EditText radio;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__area__circulo);
        resources=this.getResources();
        radio=(EditText)findViewById(R.id.txtradio);
    }
    public void  Aceptar(View v){
        if (radio.getText().length()==0){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double dato = Double.parseDouble(radio.getText().toString().trim());
            String r = Datos.CalcularAreaCirculo(dato);
            principal.Titulo_Resultado = resources.getString(R.string.circulo);
            principal.Titulo_datos = "Area : " + r;
            in = new Intent(Operar_Area_Circulo.this,resultado.class);
            startActivity(in);
        }
    }
//Metodo borrar
    public void  borrar(View v){
        radio.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
