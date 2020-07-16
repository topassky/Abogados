package com.comcop.abogados.ui;

import android.app.Application;
import android.util.Log;

import java.util.Calendar;
import java.util.Date;

public class globales extends Application {
    public static final int INICIO=1;
    private boolean reloj;
    private long inicio;
    private long tiempo;
    boolean level=false;

    private int ventanas;
    public int getventanas() {
        return ventanas;
    }
    public void setventanas(int ventanas) {
        this.ventanas = ventanas;
    }

    /////////////////////////////////////////RELOJ////////////////////////////////////////////////77

    public void setreloj(boolean estado){
        this.reloj = estado;
        if (estado==true){
            Date actual= Calendar.getInstance().getTime();
            this.inicio=actual.getTime();
        }
    }

    public String getreloj()  {
        if (this.reloj==true)
        {   long actual=Calendar.getInstance().getTime().getTime()-this.inicio;
            Log.d("logReloj","Escala del tiempo: " +actual);
            if (actual > tiempo){
                this.inicio=actual;
                level=!(level);
            }
            return "{\"level\":\""+level+"\",\"estado\":\"true\"}";
        }
        else {
            return "{\"level\":\"0\",\"estado\":\"false\"}"; //{level : 0/1 , estado: prendiso o apagado}
        }}                                                   //   leveo 0___________ y 1------------

    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////77





}
