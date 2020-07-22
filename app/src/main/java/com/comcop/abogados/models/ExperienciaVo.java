package com.comcop.abogados.models;

public class ExperienciaVo {
    private String Empresa;
    private String Cargo;
    private String Funciones;
    private String Fecha;

    public ExperienciaVo(String empresa, String cargo, String funciones, String fecha) {
        Empresa = empresa;
        Cargo = cargo;
        Funciones = funciones;
        Fecha = fecha;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getFunciones() {
        return Funciones;
    }

    public void setFunciones(String funciones) {
        Funciones = funciones;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}
