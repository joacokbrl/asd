/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zologico;

/**
 *
 * @author joacokbrl
 */
public class Habitats {
    private int codigoA;
    private String caluroso;
    private String frio;
    private String templado;
    private String humedo;

    public Habitats() {
        this.codigoA = codigoA;
        this.caluroso = caluroso;
        this.frio = frio;
        this.templado = templado;
        this.humedo = humedo;
    }

    public Habitats(int codigoA, String caluroso, String frio, String templado, String humedo) {
        this.codigoA = codigoA;
        this.caluroso = caluroso;
        this.frio = frio;
        this.templado = templado;
        this.humedo = humedo;
    }

    public int getcodigoA() {
        return codigoA;
    }

    public void setcodigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    public String getCaluroso() {
        return caluroso;
    }

    public void setCaluroso(String caluroso) {
        this.caluroso = caluroso;
    }

    public String getFrio() {
        return frio;
    }

    public void setFrio(String frio) {
        this.frio = frio;
    }

    public String getTemplado() {
        return templado;
    }

    public void setTemplado(String templado) {
        this.templado = templado;
    }

    public String getHumedo() {
        return humedo;
    }

    public void setHumedo(String humedo) {
        this.humedo = humedo;
    }
    
    public String toString(){
        return "Codigo: " + this.codigoA + "Caluroso: " + this.caluroso + "Frio: " + this.frio + "Templado" + this.templado + "Humedo: " + this.humedo;
    }
    
}
