package com.comcop.abogados.models;

public class Utilidades {

    public static final int  SERVICIOS = 1;
    public static final int PROFESIONES = 2;
    public static int visualizacion = SERVICIOS;


    public static String idMuestra = "id";
    public static final String tblmuestra = "hojaVida";
    public static final String nombreUsuario = "usuario";
    public static final String fechainicio = "fechaInico";
    public static final String fechafinal = "fechaFinal";
    public static final String empresa = "Empresa";
    public static final String nombrejefe = "nombreJefe";
    public static final String teljefe = "telJefe";


    public static final String createTable0 = "CREATE TABLE " + tblmuestra + " (" + idMuestra + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            nombreUsuario + " TEXT ," + fechainicio + " TEXT ," + fechafinal + " TEXT ," + empresa + " TEXT ," + nombrejefe +
            " TEXT ," + teljefe + " TEXT)";
}
