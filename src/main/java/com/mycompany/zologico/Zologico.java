/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zologico;

/**
 *
 * @author joacokbrl
 */
public class Zologico {

    private int codigo;
    private Animal animales;
    private Habitats habitats;
    private Comida comida;

    public Zologico() {
        this.codigo = 0;
        this.animales = new Animal();
        this.habitats = new Habitats();
        this.comida = new Comida();
    }

    public Zologico(int codigo, String animales, String habitats, String comida, int codigoJ, String tipo, String nombre, int codigoA, String caluroso, String frio, String templado, String humedo, int codigoQ, String tipoL) {
        this.codigo = codigo;
        this.animales = new Animal(codigoJ, tipo, nombre);
        this.habitats = new Habitats(codigoA, caluroso, frio, templado, humedo);
        this.comida = new Comida(codigoQ, tipo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAnimales() {
        return animales.getNombre();
    }

    public void setAnimales(String animales) {
        this.animales.setNombre(animales);
    }

    public String getHabitats() {
        return habitats.getCaluroso();
    }

    public void setHabitats(String habitats) {
        this.habitats.setCaluroso(habitats);
    }

    public String getComida() {
        return comida.getTipoL();
    }

    public void setComida(String comida) {
        this.comida.setTipoL(comida);
    }
    
    public String toString(){
        return "Codigo: " + this.codigo + "animales: " + this.animales + "Habitats: " + this.habitats + "comida: " + this.comida;
    }
}
