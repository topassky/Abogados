package com.comcop.abogados.ui.hojaVida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.comcop.abogados.R;


public class registro_datos_personales2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_datos_personales2);


    }
    public void OnClickSiguiente(View view) {
        switch (view.getId()){
            case R.id.Siguiente1:

                //Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(registro_datos_personales2.this, registro_datos_personales3.class);
                startActivity(intent);
            break;
            case R.id.Anteorior:

                //Toast.makeText(this,"Numero"+ Utilidades.REGISTRO,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(registro_datos_personales2.this, registro_datos_personales1.class);
                startActivity(i);
            break;
        }
    }


}