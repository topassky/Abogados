package com.comcop.abogados.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.comcop.abogados.R;
import com.comcop.abogados.models.Utilidades;

public class registro_datos_personales2 extends AppCompatActivity {

    TextView numTabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_datos_personales2);

        numTabla = (TextView) findViewById(R.id.numTabla);
        numTabla.setText(Utilidades.REGISTRO +"-n");

    }
    public void OnClickSiguiente(View view) {
        switch (view.getId()){
            case R.id.Siguiente1:
                Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
            break;
            case R.id.Anteorior:
                Utilidades.REGISTRO=Utilidades.REGISTRO-1;
                //Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(registro_datos_personales2.this, registro_datos_personales1.class);
                startActivity(intent);
            break;
        }
    }


}