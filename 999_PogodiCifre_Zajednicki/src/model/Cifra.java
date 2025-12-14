/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author milos
 */
public class Cifra implements Serializable {
    private int broj;
    private int red;
    private int kolona;

    public Cifra() {
    }

    public Cifra(int broj, int red, int kolona) {
        this.broj = broj;
        this.red = red;
        this.kolona = kolona;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getKolona() {
        return kolona;
    }

    public void setKolona(int kolona) {
        this.kolona = kolona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cifra other = (Cifra) obj;
        return this.broj == other.broj;
    }
    
}
