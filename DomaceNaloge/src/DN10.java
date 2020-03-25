
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class DN10 {
    
    static Lik[] liki = new Lik[100];
    
    static void preberi(String a) throws Exception{
        Scanner sc = new Scanner(new File(a));
        //String argument = a;
        int stevec = 0;
        
        while(sc.hasNext()){
            String vsebina = sc.nextLine();
            String [] sekano = vsebina.split(":");
            
            
            
//            String splitt = sekano[1];
//            double vrednost1  = Double.parseDouble(splitt);          
//    
//            String split = sekano[2];
//            double vrednost2  = Double.parseDouble(split);
           
            
            if (sekano[0].contains("krog")){   //ustvari objekt krog 
                liki[stevec] = new Krog(Double.parseDouble(sekano[1]));    
             
            }
            else if (sekano[0].contains("pravokotnik")){   //ustvari objekt pravokotnik
                liki[stevec] = new Pravokotnik(Double.parseDouble(sekano[1]), Double.parseDouble(sekano[2]));

            }
            else if (sekano[0].contains("kvadrat")){   //ustvari objekt kvadrat
                liki[stevec] = new Kvadrat(Double.parseDouble(sekano[1]));

            }
            stevec++;
        } 
        sc.close();
    }
    
    static void izracunaj(){
        //metoda bo izračunala skupno površino vseh likov v tabeli
        double povrsina = 0;
        for (int i=0; i<liki.length; i++){
            if (liki[i] != null){
                povrsina += liki[i].povrsina();
                
            }
        }
        System.out.printf("%.2f", povrsina);
    }
    
    
    public static void main(String[] args) throws Exception{
        preberi(args[0]);
        izracunaj();
        
    }
}

interface Lik{  //abstract
    public double povrsina();   //abstract
}


class Krog implements Lik{  //extends
    double r;
    
    public Krog(double r){
        this.r = r;
        
    }
    
    @Override
    public double povrsina() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.PI * r * r);
    }
    
}


class Kvadrat implements Lik{   //extends
    double a;
    
    public Kvadrat(double a){
        this.a = a;
    }

    @Override
    public double povrsina() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (a * a);
    }
    
}


class Pravokotnik implements Lik{   //extends
    double a;
    double b;
    
    public Pravokotnik(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (a * b);
    }
    
}

