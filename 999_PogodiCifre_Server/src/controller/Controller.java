/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.Cifra;

/**
 *
 * @author milos
 */
public class Controller {
    private static Controller instance;
    private List<Admin>admini=new ArrayList<>();
    private List<Cifra>cifre=new ArrayList<>();

    public List<Cifra> getCifre() {
        return cifre;
    }

    public void setCifre(List<Cifra> cifre) {
        this.cifre = cifre;
    }

    
    
    public List<Admin> getAdmini() {
        return admini;
    }

    public void setAdmini(List<Admin> admini) {
        this.admini = admini;
    }

    
    public static Controller getInstance() {
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }

    private Controller() {
        Admin a1=new Admin("Pera", "Peric", "pera@gmail.com", "123456");
        Admin a2=new Admin("Mara", "Maric", "mara@gmail.com", "654321");
        admini.add(a1);
        admini.add(a2);
    }

    public Cifra proveriCifru(Cifra cifra) {
        for(Cifra c:cifre){
            if(c.getRed()==cifra.getRed()&&c.getKolona()==cifra.getKolona()){
                return c;
            }
        }
        return cifra;
    }
    
}
