/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zologico;

/**
 *
 * @author joacokbrl
 */
public class Comida {
    private int codigoQ;
    private String tipoL;

    public Comida() {
        this.codigoQ = 0;
        this.tipoL = "";
    }

    public Comida(int codigoQ, String tipoL) {
        this.codigoQ = codigoQ;
        this.tipoL = tipoL;
    }

    public int getcodigoQ() {
        return codigoQ;
    }

    public void setcodigoQ(int codigoQ) {
        this.codigoQ = codigoQ;
    }

    public String getTipoL() {
        return tipoL;
    }

    public void setTipoL(String tipoL) {
        this.tipoL = tipoL;
    }
    
    public String toString(){
        return "codigo: " + this.codigoQ + "Tipo: " + this.tipoL;
                
    }
}
