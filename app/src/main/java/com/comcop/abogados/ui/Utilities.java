package com.comcop.abogados.ui;

public class Utilities {

    public static final String tblTour = "tour";
    public static final String tblVentanas = "ventanas";  // btn  txv
    public static final String tblConfiguracion = "configuracion";

    //Configuraciones
    public static final String idconfig = "id";
    public static final String deltadeTiempo = "dt";


    public static final String idTour = "id";
    public static final String iddueno = "duenno";
    public static final String privacidad = "privacidad";
    public static final String fin = "tfin";
    public static final String inicio = "tinicio";
    public static final String nventanas = "nventanas";

    //{"idsub":"miid", "padre":"id", "x1": "c,x,y,z,t,v,m",  "x2": "c,x,y,z,t,v,m",
    // "x3": "c,x,y,z,t,v,m" ,"x4": "c,x,y,z,t,v,m" , "x5": "c,x,y,z,t,v,m" ,  "x6": "c,x,y,z,t,v,m"}
    public static final String idVentana = "id";
    public static final String tour = "tour";
    public static final String c0 = "corazon0";
    public static final String x0 = "x0";
    public static final String y0 = "y0";
    public static final String z0 = "z0";
    public static final String v0 = "velocidad0";
    public static final String t0 = "tiempo0";
    public static final String m0 = "medida0";

    public static final String c1 = "corazon1";
    public static final String x1 = "x1";
    public static final String y1 = "y1";
    public static final String z1 = "z1";
    public static final String v1 = "velocidad1";
    public static final String t1 = "tiempo1";
    public static final String m1 = "medida1";

    public static final String c2 = "corazon2";
    public static final String x2 = "x2";
    public static final String y2 = "y2";
    public static final String z2 = "z2";
    public static final String v2 = "velocidad2";
    public static final String t2 = "tiempo2";
    public static final String m2 = "medida2";

    public static final String c3 = "corazon3";
    public static final String x3 = "x3";
    public static final String y3 = "y3";
    public static final String z3 = "z3";
    public static final String v3 = "velocidad3";
    public static final String t3 = "tiempo3";
    public static final String m3 = "medida3";

    public static final String c4 = "corazon4";
    public static final String x4 = "x4";
    public static final String y4 = "y4";
    public static final String z4 = "z4";
    public static final String v4 = "velocidad4";
    public static final String t4 = "tiempo4";
    public static final String m4 = "medida4";

    public static final String c5 = "corazon5";
    public static final String x5 = "x5";
    public static final String y5 = "y5";
    public static final String z5 = "z5";
    public static final String v5 = "velocidad5";
    public static final String t5 = "tiempo5";
    public static final String m5 = "medida5";

    public static String idMuestra = "id";
    public static final String tblmuestra = "muestras";
    public static final String Corazon = "c";
    public static final String latitud = "x";
    public static final String longitud = "y";
    public static final String altura = "z";
    public static final String tiempo = "t";
    public static final String tipoMu = "m";
    public static final String velocidad = "v";


    public static final String param1 = "tempGHTspl511n12477";
    public static final String param2 = "almkdfjdjjjsdsffee83";
    public static final String cache1 = "dasdhjhthlkkjsdksdkj";//Usado
    public static final String cache3 = "dadsaadghtheiifodk8e930184";
    public static final String cahche2 = "tempGHTsshfjfd2477";
    public static final String parma1 = "tempiGHTspl511124771";//usado
    public static final String parma2 = "alkdfjhdjjjsdsffee83";//usado
    public static final String caceh1 = "dasdhjhthkkjsdkgsdkj";
    public static final String caceh3 = "dadsaadghtheiifod8ef930184";
    public static final String cahceh2 = "tempGHTsshfefd2477";
    public static final String paarm1 = "tempdGHTspl51112477";
    public static final String paarm2 = "alkdfjdjcjjsdsffee83";
    public static final String cahce1 = "dasdhjhthkkjsbdksdkj";//Usado
    public static final String cahce3 = "dadsaadghtheiifod8e930a184";//usado
    public static final String cahce4 = "dadsaadghtheiifod8e930a194";//usado
    //
    //  {*idsub*:*miid*, *padre*:*''felipe''*, *x1*: *c,x,y,z,t,v*,  *x2*: *c,x,y,z,t,v*,  *x3*: *c,x,y,z,t,v* ,*x4*: *c,x,y,z,t,v* , *x5*: *c,x,y,z,t,v* ,  *x6*: *c,x,y,z,t,v*}
    public static final String createTable3 = "CREATE TABLE " + tblConfiguracion + " (" + idconfig + " INTEGER PRIMARY KEY," +
            deltadeTiempo + " TEXT, " + param1 + " TEXT, " + parma2 + " TEXT, " + caceh1 + " TEXT, " + caceh3 + " TEXT, " + cahceh2 + " TEXT," +
            " " + parma1 + " TEXT, " + param2 + " TEXT, " + cache1 + " TEXT, " + cahche2 + " TEXT, " + cache3 + " TEXT, " + cahce4 + " " +
            " TEXT, " + paarm1 + " TEXT, " + paarm2 + " TEXT, " + cahce1 + " TEXT, " + cahce3 + " TEXT)";
    public static final String createTable0 = "CREATE TABLE " + tblmuestra + " (" + idMuestra + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Corazon + " TEXT ," + latitud + " TEXT ," + longitud + " TEXT ," + altura + " TEXT ," + tiempo + " TEXT ," + tipoMu + " TEXT ," + velocidad + " TEXT)";

    public static final String createTable1 = "CREATE TABLE " + tblTour + " (" + idTour + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            iddueno + " TEXT ," + privacidad + " TEXT ," + inicio + " TEXT," + fin + " TEXT)";

    public static final String createTable2 = "CREATE TABLE " + tblVentanas + " (" + idVentana + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            tour + " TEXT ," + c0 + " TEXT ," + x0 + " TEXT," + y0 + " TEXT ," + z0 + " TEXT , " + v0 + " TEXT, " + t0 + " TEXT , " + m0 + " TEXT, " + c1 +
            " TEXT ," + x1 + " TEXT," + y1 + " TEXT ," + z1 +
            " TEXT ," + v1 + " TEXT ," + t1 + " TEXT , " + m1 + " TEXT, " + c2 + " TEXT ," + x2 + " TEXT," + y2 + " TEXT ," + z2 + " TEXT ," + v2 + " TEXT ,"
            + t2 + " TEXT , " + m2 + " TEXT, " + c3 + " TEXT ," + x3 + " TEXT," + y3 + " TEXT ," + z3 +
            " TEXT ," + v3 + " TEXT ," + t3 + " TEXT , " + m3 + " TEXT, " + c4 + " TEXT ," + x4 + " TEXT ," + y4 + " TEXT ," + z4 + " TEXT ," + v4 + " TEXT ,"
            + t4 + " TEXT , " + m4 + " TEXT, " + c5 + " TEXT ," + x5 + " TEXT," + y5 + " TEXT ," + z5 +
            " TEXT ," + v5 + " TEXT, " + t5 + " TEXT , " + m5 + " TEXT)";


}