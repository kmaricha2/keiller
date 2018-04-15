package com.example.keiller.Listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/**
 * Created by KEILLER on 14/04/2018.
 */

//Clase Area ok gracias keiller commit
public class Areas extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lv = (ListView)findViewById(R.id.opcionesArea);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.opciones_areas);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(Adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         in = new Intent(Areas.this,Operar_Area_Cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Areas.this,Operar_Area_Rectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Areas.this,Operar_Area_Triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Areas.this,Operar_Area_Circulo.class);
                        startActivity(in);
                        break;

                }
            }
        });
    }
}
