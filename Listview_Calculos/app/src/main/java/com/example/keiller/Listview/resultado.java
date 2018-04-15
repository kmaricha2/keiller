package com.example.keiller.Listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by KEILLER on 14/04/2018.
 */

public class resultado extends AppCompatActivity {
    private TextView t;
    private TextView d;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resources=this.getResources();
        t= (TextView)findViewById(R.id.txttitulo);
        d= (TextView)findViewById(R.id.txttitudato);
        t.setText(principal.Titulo_Resultado);
        d.setText(principal.Titulo_datos);
    }

    public void ok (View v){
        in = new Intent(resultado.this,principal.class);
        startActivity(in);
    }
}
