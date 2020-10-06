package com.example.practica1ev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    ImageView btnRetro,btnAvanzar3;
    Switch switch1,switch2;

    //Creamos un Arreglo para llenar las listas afirmativa
    ArrayList<String> RespuestasA,RespuestasN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        btnRetro=findViewById(R.id.btnRetro);
        btnAvanzar3=findViewById(R.id.btnAvanza3);
        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);



        btnRetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actividad2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnAvanzar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Actividad2.this,Actividad3.class);

                RespuestasA=new ArrayList<>();
                RespuestasN=new ArrayList<>();


                if(switch1.isChecked()==true){
                    RespuestasA.add(switch1.getText().toString());
                    RespuestasN.remove(switch1.getText().toString());
                }
                else{
                    RespuestasN.add(switch1.getText().toString());
                    RespuestasA.remove(switch1.getText().toString());
                }

                if(switch2.isChecked()==true){
                    RespuestasA.add(switch2.getText().toString());
                    RespuestasN.remove(switch2.getText().toString());
                }
                else{
                    RespuestasN.add(switch2.getText().toString());
                    RespuestasA.remove(switch2.getText().toString());
                }

                intent2.putExtra("resN",RespuestasN);
                intent2.putExtra("resA", RespuestasA);


                startActivity(intent2);
            }
        });


    }
}