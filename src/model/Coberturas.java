/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Pauessa
 */
public class Coberturas implements Serializable{
    private boolean oftamologia;
    private boolean dental;
    private boolean fecundacionInVitro;

    public Coberturas() {
    }

    public Coberturas(boolean oftamologia, boolean dental, boolean fecundacionInVitro) {
        this.oftamologia = oftamologia;
        this.dental = dental;
        this.fecundacionInVitro = fecundacionInVitro;
    }

    public boolean isOftamologia() {
        return oftamologia;
    }

    public void setOftamologia(boolean oftamologia) {
        this.oftamologia = oftamologia;
    }

    public boolean isDental() {
        return dental;
    }

    public void setDental(boolean dental) {
        this.dental = dental;
    }

    public boolean isFecundacionInVitro() {
        return fecundacionInVitro;
    }

    public void setFecundacionInVitro(boolean fecundacionInVitro) {
        this.fecundacionInVitro = fecundacionInVitro;
    }
    
   
    
    
}
