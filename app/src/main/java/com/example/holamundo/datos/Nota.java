package com.example.holamundo.datos;

import java.util.Calendar;

public class Nota {

    private Calendar fecha;
    private String texto;
    private String categoria;
    private String [] categorias = {"Urgente", "Importante", "Normal"};

    public Nota(String texto, String categoria){

        this.fecha = Calendar.getInstance();
        this.texto = texto;
        //this.categoria = categoria;
        this.categoria = comprobarcat(categoria);

    }

    private String comprobarcat(String cat){

        String aux = "Normal";

        for(int i = 0; i<categorias.length; i++){

            if(cat.equalsIgnoreCase(categorias[i])){

                aux = categorias[i];

            }
        }

        return aux;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = comprobarcat(categoria);
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    public String getFechaToString(){

        return this.fecha.get(Calendar.DAY_OF_MONTH) + "/" +  this.fecha.get(Calendar.MAY) + "/" + this.fecha.get(Calendar.YEAR);

    }

}
