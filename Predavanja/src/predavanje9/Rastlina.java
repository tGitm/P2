
package predavanje9;

/**
 *
 * @author Tim
 */
public class Rastlina {
    // statičen atribut - ima enako vrednost v vseh objektih (ker je to atribut razreda)
  static int ID = 0;  // največja oznaka rastline
  
  // atributi razreda Rastlina; ker spodnji atributi niso statični, 
  // bo vsak objekt razreda Rastlina imel svojega 
  String oznaka;      // oznaka rasline
  int    starost;     // starost (v mesecih)
  int    velikost;    // visina (v centimetrih)
  int mojaID;         // enolična oznaka objekta
  
  // privzeta vrednost za mesecno rast
  int rastMladaRastlina = 3;  // prve pol let
  int rastStaraRastlina = 1;  // kasneje
  
  int mesecnaRast() {
    if (this.starost <= 6)
      return this.rastMladaRastlina;
    else
      return this.rastStaraRastlina;
  }
  
  void novMesec() {
    this.starost  = this.starost + 1;               // rastlina se postara za 1 mesec
    this.velikost = this.velikost + mesecnaRast();  // rastlina zraste za ... cm
  }

  void nastviOznako(String oznaka) {
    this.oznaka = oznaka;
  }
  
  void izpisiPodatke() {
    System.out.printf("%c %s, starost: %d, velikost: ", 'ꕤ', oznaka, starost);
    for (int i = 0; i <= velikost / 10; i++) {
      System.out.print(".");
    }
    System.out.println();
  }
  
  static void izpisiNavodilaZaObrezovanje() {
    System.out.println("Rastline se obrezuje spomlad....");
  }
}
