package com.comcop.abogados.ui.hojaVida;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.comcop.abogados.R;



public class registro_datos_personales2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    EditText EditSoltero;
    EditText EdiTconduccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_datos_personales2);
        EditSoltero = (EditText) findViewById(R.id.EdiEstadoCivil);
        EdiTconduccion=(EditText) findViewById(R.id.EditConducion);
    }
    public void OnClickSiguiente(View view) {

        RadioGroup rg = (RadioGroup)findViewById(R.id.Vehiculo);
        int option = rg.getCheckedRadioButtonId();
        String output = "";

        switch (option)
        {
            case R.id.radioSi: output = "Si";
                break;
            case R.id.radioNo: output = "No";
                break;
            default: output = "No buttons selected";

        }

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

    public void showPopupCivil(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_estado_civil, popup.getMenu());
        popup.setOnMenuItemClickListener(registro_datos_personales2.this);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.Soltero:
                //archive(item);
                //Toast.makeText(getApplicationContext(),"Hombre :", Toast.LENGTH_SHORT).show();
                EditSoltero.setText("Soltero(a)");
                return true;
            case R.id.Casado:
                //delete(item);
                EditSoltero.setText("Casado(a)");
                return true;
            case R.id.Sepadado:
                //delete(item);
                EditSoltero.setText("Sepadado(a)");
                return true;
            case R.id.Viudo:
                //delete(item);
                EditSoltero.setText("Viudo(a)");
                return true;
            case R.id.A1:
                //delete(item);
                EdiTconduccion.setText("A1");
                return true;
            case R.id.A2:
                //delete(item);
                EdiTconduccion.setText("A2");
                return true;
            case R.id.B1:
                //delete(item);
                EdiTconduccion.setText("B1");
                return true;
            case R.id.B2:
                //delete(item);
                EdiTconduccion.setText("B2");
                return true;
            case R.id.B3:
                //delete(item);
                EdiTconduccion.setText("B3");
                return true;
            case R.id.C1:
                //delete(item);
                EdiTconduccion.setText("C1");
                return true;
            case R.id.C2:
                //delete(item);
                EdiTconduccion.setText("C2");
                return true;
            case R.id.C3:
                //delete(item);
                EdiTconduccion.setText("C3");
                return true;
            default:
                return false;
        }
    }


    public void OnClickConduccion(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_conduccion, popup.getMenu());
        popup.setOnMenuItemClickListener(registro_datos_personales2.this);
        popup.show();
    }


}