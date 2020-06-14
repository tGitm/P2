package Kvizi;

import java.util.HashMap;

public class Morse {
    public static void main(String[] args) {
        System.out.println(vMorse("SOS"));
    }

    public static String vMorse(String niz) {
        java.util.HashMap<Character, String> morseZnaki = new java.util.HashMap<Character, String>();
        morseZnaki.put('A', ".-");
        morseZnaki.put('B', "-...");
        morseZnaki.put('C', "-.-.");
        morseZnaki.put('D', "-..");
        morseZnaki.put('E', ".");
        morseZnaki.put('F', "..-.");
        morseZnaki.put('G', "--.");
        morseZnaki.put('H', "....");
        morseZnaki.put('I', "..");
        morseZnaki.put('J', ".---");
        morseZnaki.put('K', "-.-");
        morseZnaki.put('L', ".-..");
        morseZnaki.put('M', "--");
        morseZnaki.put('N', "-.");
        morseZnaki.put('O', "---");
        morseZnaki.put('P', ".--.");
        morseZnaki.put('Q', "--.-");
        morseZnaki.put('R', ".-.");
        morseZnaki.put('S', "...");
        morseZnaki.put('Š', "----");
        morseZnaki.put('T', "-");
        morseZnaki.put('U', "..-");
        morseZnaki.put('V', "...-");
        morseZnaki.put('W', ".--");
        morseZnaki.put('X', "-..-");
        morseZnaki.put('Y', "-.--");
        morseZnaki.put('Z', "--..");
        morseZnaki.put('1', ".----");
        morseZnaki.put('2', "..---");
        morseZnaki.put('3', "...--");
        morseZnaki.put('4', "....-");
        morseZnaki.put('5', ".....");
        morseZnaki.put('6', "-....");
        morseZnaki.put('7', "--...");
        morseZnaki.put('8', "---..");
        morseZnaki.put('9', "----.");
        morseZnaki.put('0', "-----");
        morseZnaki.put('.', ".-.-.-");
        morseZnaki.put('-', "-....-");
        morseZnaki.put('?', "..--..");
        morseZnaki.put(',', "--..--");
        morseZnaki.put('\'', ".----.");
        morseZnaki.put('"', ".--..--.");
        morseZnaki.put(':', "---...");
        morseZnaki.put('(', "-.--.-");
        morseZnaki.put('@', ".--.-.");
        morseZnaki.put(' ', "");

        StringBuilder vCrke = new StringBuilder();
        for (int i = 0; i < niz.length(); i++) {
            //dobim niz in ga pretvorim v upper case, potem stringu appendam ta pretvorjem znak iz morsejeve abecede
            char enZnak = niz.charAt(i);
            char toUpper = Character.toUpperCase(enZnak);
            vCrke.append(morseZnaki.get(toUpper));
            vCrke.append(" ");
        }
        String izpis = vCrke.toString();
        return izpis;
    }
}
