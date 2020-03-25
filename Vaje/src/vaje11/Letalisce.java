/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaje11;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Tim
 */
class Letalisce {
    private String koda;
    private String mesto;
    private String drzava;
    private Set<String> prihodi = new TreeSet();
    private Set<String> odhodi = new TreeSet();
    
    public Letalisce(String koda, String mesto, String drzava){
        this.koda = koda;
        this.mesto = mesto;
        this.drzava = drzava;
        this.prihodi = new TreeSet<>();
        this.odhodi = new TreeSet<>();
        
    }

    public Set<String> getPrihodi() {
        return prihodi;
    }

    public Set<String> getOdhodi() {
        return odhodi;
    }

    public void setPrihodi(Set<String> prihodi) {
        this.prihodi = prihodi;
    }

    public void setOdhodi(Set<String> odhodi) {
        this.odhodi = odhodi;
    }
    
    
    public String toString(){
       return String.format("%s: %s, %s", koda, mesto, drzava);
        
    }
    
    public void setKoda(String koda) {
        this.koda = koda;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getKoda() {
        return koda;
    }

    public String getMesto() {
        return mesto;
    }

    public String getDrzava() {
        return drzava;
    }
}


class MrezaLetov {
    private TreeMap<String, Letalisce> destinacije;
    
    public MrezaLetov(){
        this.destinacije = new TreeMap<>();
    }

    public TreeMap<String, Letalisce> getDestinacije() {
        return destinacije;
    }

    public void setDestinacije(TreeMap<String, Letalisce> destinacije) {
        this.destinacije = destinacije;
    }
    
    public void preberiLetalisca(File f) throws Exception{
        Scanner sc = new Scanner(f);
        String prebrano = " ";
        
        while(sc.hasNextLine()){
            prebrano = sc.nextLine();
            String [] tab = prebrano.split(" ");
            String kratica = tab[0];
            String glMesto = tab[1];
            String drzava = tab[2];
            
            Letalisce l = new Letalisce(kratica, glMesto, drzava);
            destinacije.put(kratica, l);
   
        }
        sc.close();
    }
    
    public void izpisi(){
        for (Letalisce u : destinacije.values()){
            System.out.println(u);
        }
        
    }
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("viri/letalisca.txt"));
        String prebrano = " ";
        
        while(sc.hasNextLine()){
            prebrano = sc.nextLine();
            String mreza = new MrezaLetov();
        }
    }
    
    
}

