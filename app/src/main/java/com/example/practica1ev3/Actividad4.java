package com.example.practica1ev3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Actividad4 extends AppCompatActivity {
    TextView txtPorcen,txtCantP,txtCantN;
    ImageView imgEstado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        txtPorcen = findViewById(R.id.txtPrc);
        txtCantP = findViewById(R.id.txtPos);
        txtCantN = findViewById(R.id.txtNeg);
        imgEstado = findViewById(R.id.imgProcentage);
        double prc;
        int cantP,cantN;

        prc=0.45;
        if(prc<=0.25){
            imgEstado.setImageResource(R.mipmap.Malo);
        }else if(prc>0.25&&prc<=0.50){
            imgEstado.setImageResource(R.mipmap.Bueno);
        }else if(prc>50&&prc<=0.75){
            imgEstado.setImageResource(R.mipmap.muy);
        }else if(prc>0.75){
            imgEstado.setImageResource(R.mipmap.Exelente);
        }
    }
}