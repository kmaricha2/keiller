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

// operacion del area de un cuadrado
public class Operar_Area_Cuadrado extends AppCompatActivity {
    private EditText valor;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__area__cuadrado);
        resources=this.getResources();
        valor=(EditText)findViewById(R.id.txtdatoArea);
    }

    public void  Aceptar(View v){
        if (valor.getText().length()==0){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
        double dato = Double.parseDouble(valor.getText().toString().trim());
        String r = Datos.CalcularAreaCuadrado(dato);
        principal.Titulo_Resultado = resources.getString(R.string.cuadrado);
        principal.Titulo_datos = "Area : " + r;
        in = new Intent(Operar_Area_Cuadrado.this,resultado.class);
        startActivity(in);
        }
    }
    //Metodo borrar
    public void  borrar(View v){
     valor.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
