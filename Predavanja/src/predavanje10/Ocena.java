/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje10;

/**
 *
 * @author Tim
 */
class Student {
    private String ime;
    int[] ocene;
    int stOcen;
    private String status;
    
    Student(String ime){
        this.ime = ime;
        
        stOcen = 0;
        ocene = new int[100];
        status = "?";
    }
    
    
    public void dodajOceno(int ocena){
        this.ocene[stOcen++] = ocena;
    }
    
    
    public String getStatus(){
        if (stOcen == 0) return "?";
        
        int sum = 0;
        for (int i = 0; i < stOcen; i++){
            sum += ocene[i];
        }
        
        return (sum / stOcen >= 9) ? "Odličen" : "Dober";
    }
    
    
    public String toString(){
        return String.format("%s, status: %s");
    }
    
}


public class Ocena{
    
    public static void main(String[] args){
        Student s1 = new Student("Jože");
        s1.dodajOceno(10);
        s1.dodajOceno(9);
        s1.dodajOceno(8);
        s1.dodajOceno(10);
        System.out.println(s1.getStatus());
//        s1.ocene[0] = 10;
//        s1.ocene[1] = 10;
//        s1.ocene[2] = 10;
//        s1.ocene[3] = 8;
//        s1.stOcen = 4;
//        s1.status = "Odličen";
        System.out.println(s1.toString());
        
        Student s2 = new Student("Viktor");
        s2.dodajOceno(9);
        // s2.ocene[0] = 10;
        //s2.status = "Odličen";
        System.out.println(s2);
    }
}

