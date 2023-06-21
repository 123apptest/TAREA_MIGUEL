package com.example.miguel_llamedo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class listaPatalla extends AppCompatActivity {
    ListView Lista;
    String[][] datos={
            { "Alex","+56 94111111",},
            { "Bastian","+56 95111111",},
            { "Jose","+56 96111111",},
            {""},
    };
    int[]datosImg={R.drawable.man, R.drawable.man1, R.drawable.woman};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_patalla);

        Lista = (ListView) findViewById(R.id.principal);
        Lista.setAdapter(new adaptador(this, datos, datosImg));

    }
}