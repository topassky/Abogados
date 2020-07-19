package com.comcop.abogados.ui.hojaVida;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.comcop.abogados.R;


import java.io.File;
import java.util.Calendar;

public class registro_datos_personales1 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private static final String CARPETA_PRINCIPAL="misImagenesApp/";
    private static final String CARPETA_IMAGEN="imagenes";
    private static final String DIRECTORIO_IMAGEN=CARPETA_PRINCIPAL+CARPETA_IMAGEN;
    private String path;
    File fileImagen;
    Bitmap bitmap;

    private static final int COD_SELECCIONA = 10;
    private static final int COD_FOTO = 20;
    private int mYearIni, mMonthIni, mDayIni, sYearIni, sMonthIni, sDayIni;
    static final int DATE_ID = 0;
    Calendar C = Calendar.getInstance();

    EditText EditNacimiento,EditSexo;
    RadioGroup radioGroup;
    RadioButton radioButton;
    ImageView imagen;
    //public int num_tabla=1;

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

       // radioGroup =findViewById(R.id.RadioGroupSexo);
        //Button buttonSiguiente = findViewById(R.id.Siguiente1);
        //buttonSiguiente.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        checkButton();
        //    }
        //});

        /**
         * Ingresar una imagen desde la galeria.
         */

        imagen = (ImageView) findViewById(R.id.imggaleria);

        /**
         * Registro del boton se sexo
         */

        EditSexo = (EditText) findViewById(R.id.EditSexo);
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
        switch (view.getId()){
            case R.id.subirImage:
                cargarImagen();
                break;
            case R.id.SubirFoto:
                subirFotografia();
                break;
        }

    }

    private void subirFotografia() {
        File miFile = new File(Environment.getExternalStorageDirectory(),DIRECTORIO_IMAGEN);
        boolean isCreate=miFile.exists();
        if(isCreate==false){
            isCreate=miFile.mkdirs();
        }
        if(isCreate==true){
            Long consecutivo=System.currentTimeMillis()/1000;
            String nombre =consecutivo.toString()+".jpg";

            path =Environment.getExternalStorageDirectory()+File.separator+DIRECTORIO_IMAGEN
                    +File.separator+nombre;
            fileImagen=new File(path);
            Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            intent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(fileImagen));
            startActivityForResult(intent,COD_FOTO);
        }
    }

    private void cargarImagen() {
        //Toast.makeText(getApplicationContext(),"Se slecciono :", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la aplicación"),COD_SELECCIONA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case COD_SELECCIONA:
                Uri miPath=data.getData();
                imagen.setImageURI(miPath);
             break;

            case COD_FOTO:
                MediaScannerConnection.scanFile(this, new String[]{path}, null,
                        new MediaScannerConnection.OnScanCompletedListener() {
                            @Override
                            public void onScanCompleted(String s, Uri uri) {
                                Log.i("Path",""+path);
                            }
                        });
                bitmap= BitmapFactory.decodeFile(path);
                imagen.setImageBitmap(bitmap);
                break;


        }

    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_en_activity, popup.getMenu());
        popup.setOnMenuItemClickListener(registro_datos_personales1.this);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.Hombre:
                //archive(item);
                //Toast.makeText(getApplicationContext(),"Hombre :", Toast.LENGTH_SHORT).show();
                EditSexo.setText("Hombre");
                return true;
            case R.id.Mujer:
                //delete(item);
                EditSexo.setText("Mujer");
                return true;
            case R.id.Otro:
                //delete(item);
                EditSexo.setText("¿Cuál?");
                return true;
            default:
                return false;
        }
    }

    public void OnClickSiguiente(View view) {
        switch (view.getId()){
            case R.id.Siguiente1:

                Intent intent = new Intent(registro_datos_personales1.this, registro_datos_personales2.class);
                startActivity(intent);

                break;
            case R.id.Anteorior:

                break;
        }


    }
}
