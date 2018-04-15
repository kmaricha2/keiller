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

//operacion Volumen del cubo
public class Operar_Volumen_Cubo extends AppCompatActivity {
    private EditText valor;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__volumen__cubo);
        resources=this.getResources();
        valor=(EditText)findViewById(R.id.txtdatoArea);
    }
    public void  Aceptar(View v){
        if (valor.getText().length()==0){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double dato = Double.parseDouble(valor.getText().toString().trim());
            String r = Datos.CalcularVolumenCubo(dato);
            principal.Titulo_Resultado = resources.getString(R.string.cubo);
            principal.Titulo_datos = "Volumen : " + r;
            in = new Intent(Operar_Volumen_Cubo.this,resultado.class);
            startActivity(in);
        }
    }
//Metodo Borrar
    public void  borrar(View v){
        valor.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
