package com.comcop.abogados.ui.hojaVida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.comcop.abogados.R;

public class experienciaLaboral extends AppCompatActivity {

    RadioGroup g1;
    TextView textFinalizacion;
    ImageView imageFechaFinal;
    EditText EditFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiencia_laboral);

        textFinalizacion=(TextView)findViewById(R.id.textFinalizacion);
        imageFechaFinal=(ImageView)findViewById(R.id.imageFechaFinal);
        EditFecha=(EditText)findViewById(R.id.EditFinalizar);

        g1 =(RadioGroup)findViewById(R.id.RadioActual);
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioActualSi){
                    textFinalizacion.setVisibility(View.INVISIBLE);
                    imageFechaFinal.setVisibility(View.INVISIBLE);
                    EditFecha.setVisibility(View.INVISIBLE);
                }else if(i==R.id.radioActualNo){
                    textFinalizacion.setVisibility(View.VISIBLE);
                    imageFechaFinal.setVisibility(View.VISIBLE);
                    EditFecha.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}