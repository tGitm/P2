/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaje12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tim
 */
class Png {
    private File file;
    private static final String SIGNATURE = "89504e470d0a1a0a";
    private static final String IHDR = "49484452";
    private String type = "";
    
    public Png(File file){
        this.file = file;
    }
    
    public void readPng() {
            FileInputStream fis;
            DataInputStream dis;
            
            
        try {
           fis = new FileInputStream(file);
           dis = new DataInputStream(fis);
           
           long l = dis.readLong();
           
           int a = dis.readInt();
           int b = dis.readInt();
           
            if (int.toHexString(a+b).equals(IHDR)){
            //ne dela vredi
                type = "PNG";
            }
            else{
                type = "JPG";
            }
           
           s
           
           if (Long.toHexString(l).equals(SIGNATURE)){
               type = "PNG";
           }
           
        } catch (FileNotFoundException ex) {
           Logger.getLogger(Png.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (IOException ex) {
            Logger.getLogger(Png.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String toString(){
        return "Datoteka je tipa " + type;
    }
}

public class BranjeSlike {
    
    ArrayList<Png> seznam;
    
    public BranjeSlike() {
    this.seznam = new ArrayList<>();
}
    
    public void preberiDir(File file){
        if (file.isFile()){
            Png p = new Png(file);
            p.readPng();
            this.seznam.add(p);
        }
        else if (file.isDirectory()){
            for (File f: file.listFiles()){
                this.preberiDir(f);
            }
        }
        else{
            
        }
    }
    
    public static void main(String[] args){
        if (args.length <= 0){
            System.out.println("Premalo parametrov, končujem!");
            return ;
        }
        
        Png png = new Png(new File(args[0]));
        png.readPng();
        
        BranjeSlike picture = new BranjeSlike();
        
        for (int i=0; i<args.length; i++){
            picture.preberiDir(new File(args[i]));
        }
        
        //System.out.println(png);
    }
}