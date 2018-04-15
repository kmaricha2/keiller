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

//Volumen del Cobo
public class Operar_Volumen_cono extends AppCompatActivity {
    private EditText base, alt;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__volumen_cono);
        resources=this.getResources();
        base=(EditText)findViewById(R.id.txtbase);
        alt=(EditText)findViewById(R.id.txtaltura);
    }
    public void  Aceptar(View v){
        if (base.getText().length()==0 ||alt.getText().length()==0 ){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double al = Double.parseDouble(alt.getText().toString().trim());
            double ba = Double.parseDouble(base.getText().toString().trim());
            String r = Datos.CalcularVolumenCono(ba,al);
            principal.Titulo_Resultado = resources.getString(R.string.cono);
            principal.Titulo_datos = "Volumen : " + r;
            in = new Intent(Operar_Volumen_cono.this,resultado.class);
            startActivity(in);
        }
    }
    //Metodo borrar
    public void  borrar(View v){
        base.setText("");
        alt.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
