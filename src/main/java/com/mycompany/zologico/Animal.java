/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zologico;

/**
 *
 * @author joacokbrl
 */
public class Animal {
    private int codigoJ;
    private String tipo;
    private String nombre;

    public Animal() {
        this.codigoJ = 0;
        this.tipo = "";
        this.nombre = "";
    }

    public Animal(int codigoJ, String tipo, String nombre) {
        this.codigoJ = codigoJ;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public int getcodigoJ() {
        return codigoJ;
    }

    public void setcodigoJ(int codigoJ) {
        this.codigoJ = codigoJ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Codigo: " + this.codigoJ + "Tipo: " + this.tipo + "nombre: " + this.nombre;
    }
    
}
