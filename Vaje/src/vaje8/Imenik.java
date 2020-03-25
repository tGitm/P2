    package vaje8;

    import java.io.File;
    import java.util.Scanner;
    
    /**
     *
     * @author Tim
     */
    
    final class Oseba{
        public String ime, priimek;
        String naslov;
        String mesto;
        String posta;
        String telefon;        
        

        public Oseba(String ime, String priimek, String naslov, String mesto, String posta, String telefon) throws Exception{
            this.ime = ime;
            this.priimek = priimek;
            this.naslov = naslov;
            this.mesto = mesto;
            this.posta = posta;
            this.telefon = telefon;
        }
        
        public String toString(){
            String prebran = (ime + "," + priimek + "," + naslov + "," + mesto + "," + posta + "," + telefon);
            return prebran;
        }
    }

    public class Imenik{
         public Oseba[] preberiOsebe(String vir) throws Exception{
            Scanner sc = new Scanner(new File("vir"));
            Oseba[] tabela = new Oseba[100];
            
            int stevec = 0;
            while (sc.hasNext()){
                String prebrano = sc.nextLine();
                String[] splittano = prebrano.split(", ");
                
                //Oseba os = new Oseba[stevec];
                stevec++;
            }
            sc.close();
            
            return Oseba;
        }
         
        public Oseba isciOseboPoImenu(String ime, Oseba[] tabelaOseb){
            
          
        } 

        public static void main(String[] args){
            String vir = "imenik.txt";
        }

       
    }

