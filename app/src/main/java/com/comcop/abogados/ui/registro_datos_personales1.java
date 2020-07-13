package com.comcop.abogados.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.comcop.abogados.R;
import java.util.Calendar;

import javax.xml.transform.Result;

public class registro_datos_personales1 extends AppCompatActivity {
    EditText EditNacimiento;
    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni;
    static final int DATE_ID = 0;
    Calendar C = Calendar.getInstance();

    RadioGroup radioGroup;
    RadioButton radioButton;

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Registro de la fecha de nacimiento
         */
        setContentView(R.layout.activity_registro_datos_personales1);
        sMonthIni = C.get(Calendar.MONTH);
        sDayIni = C.get(Calendar.DAY_OF_MONTH);
        sYearIni = C.get(Calendar.YEAR);
        EditNacimiento = (EditText) findViewById(R.id.EditNacimiento);

        EditNacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialog(DATE_ID);
            }
        });

        /**
         * Registro del sexo.
         */

        radioGroup =findViewById(R.id.RadioGroupSexo);
        Button buttonSiguiente = findViewById(R.id.Siguiente1);
        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
            }
        });

        /**
         * Ingresar una imagen desde la galeria.
         */

        imagen = (ImageView) findViewById(R.id.imggaleria);

    }

    private void checkButton(){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton =  findViewById(radioId);
        Toast.makeText(this,"Selección de +"+radioButton.getText(),Toast.LENGTH_SHORT).show();
    }

    private void colocar_fecha() {
        EditNacimiento.setText((mMonthIni + 1) + "-" + mDayIni + "-" + mYearIni+" ");
    }


    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;
                    colocar_fecha();
                }
            };


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_ID:
                return new DatePickerDialog(this, mDateSetListener, sYearIni, sMonthIni, sDayIni);
        }
        return null;
    }

    public void OnClick(View view) {
        cargarImagen();
    }

    private void cargarImagen() {
        Toast.makeText(getApplicationContext(),"Se slecciono :", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la aplicación"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK){
            Uri miPath=data.getData();
            imagen.setImageURI(miPath);
        }
    }
}
