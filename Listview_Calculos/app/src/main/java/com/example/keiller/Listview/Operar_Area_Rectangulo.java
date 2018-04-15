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

//Operacion del  area del rectangulo
public class Operar_Area_Rectangulo extends AppCompatActivity {
    private EditText a, b;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__area__rectangulo);
        resources=this.getResources();
        a=(EditText)findViewById(R.id.txtladoa);
        b=(EditText)findViewById(R.id.txtladob);
    }
    public void  Aceptar(View v){
        if (a.getText().length()==0 ||b.getText().length()==0 ){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double la = Double.parseDouble(a.getText().toString().trim());
            double lb = Double.parseDouble(b.getText().toString().trim());
            String r = Datos.CalcularAreaRectangulo(la,lb);
            principal.Titulo_Resultado = resources.getString(R.string.rectangulo);
            principal.Titulo_datos = "Area : " + r;
            in = new Intent(Operar_Area_Rectangulo.this,resultado.class);
            startActivity(in);
        }
    }
//Metodo Borrar
    public void  borrar(View v){
        a.setText("");
        b.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
