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
    Switch switch1,switch2,switch3,switch4,switch5,switch6,switch7,switch8;

    //Creamos un Arreglo para llenar las listas afirmativa
    ArrayList<String> RespuestasA,RespuestasN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);
        switch3=findViewById(R.id.switch3);
        switch4=findViewById(R.id.switch4);
        switch5=findViewById(R.id.switch5);
        switch6=findViewById(R.id.switch6);
        switch7=findViewById(R.id.switch7);
        switch8=findViewById(R.id.switch8);



        btnRetro=findViewById(R.id.btnRetro);
        btnAvanzar3=findViewById(R.id.btnAvanza3);







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

 //inicio kevin
                if(switch3.isChecked()==true){
                    RespuestasA.add(switch3.getText().toString());
                    RespuestasN.remove(switch3.getText().toString());
                }
                else{
                    RespuestasN.add(switch3.getText().toString());
                    RespuestasA.remove(switch3.getText().toString());
                }

                if(switch4.isChecked()==true){
                    RespuestasA.add(switch4.getText().toString());
                    RespuestasN.remove(switch4.getText().toString());
                }
                else{
                    RespuestasN.add(switch4.getText().toString());
                    RespuestasA.remove(switch4.getText().toString());
                }

                if(switch5.isChecked()==true){
                    RespuestasA.add(switch5.getText().toString());
                    RespuestasN.remove(switch5.getText().toString());
                }
                else{
                    RespuestasN.add(switch5.getText().toString());
                    RespuestasA.remove(switch5.getText().toString());
                }

                if(switch6.isChecked()==true){
                    RespuestasA.add(switch6.getText().toString());
                    RespuestasN.remove(switch6.getText().toString());
                }
                else{
                    RespuestasN.add(switch6.getText().toString());
                    RespuestasA.remove(switch6.getText().toString());
                }

                if(switch7.isChecked()==true){
                    RespuestasA.add(switch7.getText().toString());
                    RespuestasN.remove(switch7.getText().toString());
                }
                else{
                    RespuestasN.add(switch7.getText().toString());
                    RespuestasA.remove(switch7.getText().toString());
                }

                if(switch8.isChecked()==true){
                    RespuestasA.add(switch8.getText().toString());
                    RespuestasN.remove(switch8.getText().toString());
                }
                else{
                    RespuestasN.add(switch8.getText().toString());
                    RespuestasA.remove(switch8.getText().toString());
                }
      //Fin kevin

                intent2.putExtra("resN",RespuestasN);
                intent2.putExtra("resA", RespuestasA);


                startActivity(intent2);
            }
        });


    }
}