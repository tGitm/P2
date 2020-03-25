/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje11;

/**
 *
 * @author Tim
 */
public class Drzava {
    private String kratica;
    private String glavnoMesto;
    private int steviloPrebivalcev;
    
    public Drzava(String kratica, String glavnoMesto, int steviloPrebivalcev){
        this.kratica = kratica;
        this.glavnoMesto = glavnoMesto;
        this.steviloPrebivalcev = steviloPrebivalcev;
    
    }
    
    public String toString(){
        return String .format("Drzava");
    }

    public void setKratica(String kratica) {
        this.kratica = kratica;
    }

    public void setGlavnoMesto(String glavnoMesto) {
        this.glavnoMesto = glavnoMesto;
    }

    public void setSteviloPrebivalcev(int steviloPrebivalcev) {
        this.steviloPrebivalcev = steviloPrebivalcev;
    }

    public String getKratica() {
        return kratica;
    }

    public String getGlavnoMesto() {
        return glavnoMesto;
    }

    public int getSteviloPrebivalcev() {
        return steviloPrebivalcev;
    }
    
}
