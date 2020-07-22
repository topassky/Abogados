package com.comcop.abogados.ui.hojaVida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import com.comcop.abogados.R;
import com.comcop.abogados.models.ExperienciaVo;
import com.comcop.abogados.ui.AdaptadorExperiencia;

import java.util.ArrayList;

public class registro_datos_personales4 extends AppCompatActivity {

    ArrayList<ExperienciaVo> listaExperiencia;
    RecyclerView recyclerViewExperiencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_datos_personales4);

        listaExperiencia=new ArrayList<>();
        recyclerViewExperiencia=findViewById(R.id.recycleviewExperiencia);
        recyclerViewExperiencia.setLayoutManager(new LinearLayoutManager(this));
        llenearExperiencia();

        AdaptadorExperiencia adaptadorExperiencia = new AdaptadorExperiencia(listaExperiencia);
        recyclerViewExperiencia.setAdapter(adaptadorExperiencia);
    }

    private void llenearExperiencia() {
        listaExperiencia.add(new ExperienciaVo("Comcop Visión Artificial","Ingeniero de desarrollo","Encargado de desarrolar paltaforma de empleo","20/4/2020 "+" 21/12/2020"));
    }

    public void OnClickSiguiente(View view) {
        switch (view.getId()) {
            case R.id.Siguiente1:

                //Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(registro_datos_personales4.this, registro_datos_personales5.class);
                startActivity(intent);
                break;
            case R.id.Anteorior:

                //Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(registro_datos_personales4.this, registro_datos_personales3.class);
                startActivity(i);
                break;
        }
    }

    public void OnClickExperiencia(View view) {
        Intent intent = new Intent(registro_datos_personales4.this, experienciaLaboral.class);
        startActivity(intent);

    }
}