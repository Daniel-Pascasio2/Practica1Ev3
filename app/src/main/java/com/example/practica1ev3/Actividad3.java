package com.example.practica1ev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Actividad3 extends AppCompatActivity {

    ArrayList<String> ListaA;
    ArrayList<String> ListaN;
    ListView listA,listN;
    ImageView btnRetro,btnAvanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        btnRetro=findViewById(R.id.btnRetro1);
        btnAvanzar=findViewById(R.id.btnAvanza4);
        listA=findViewById(R.id.listA);
        listN=findViewById(R.id.listN);

        ListaA=new ArrayList<>();
        ListaN=new ArrayList<>();

        ListaA=getIntent().getStringArrayListExtra("resA");
        ListaN=getIntent().getStringArrayListExtra("resN");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListaA);
        listA.setAdapter(adapter);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListaN);
        listN.setAdapter(adapter1);


        btnRetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Actividad3.this,Actividad2.class);
                startActivity(intent3);
            }
        });

        btnAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent intent4=new Intent(Actividad3.this,Actividad4.class);
                //startActivity(intent4);

            }
        });







    }
}