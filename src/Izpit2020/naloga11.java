package Izpit2020;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class naloga11 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File(args[0]));
        String bes = "";
        ArrayList<String> tab = new ArrayList<>();
        //String [] tab;
        //String [] split;

        int counter = 0;
        while (sc.hasNext()) {
            bes = sc.next();
            bes.toLowerCase();
            //tab.add(bes.split(""));

            int finalC = 0;
            int temp = 0;
            String najbolj = null;
            for (String s1 : tab) {
                temp = 0;
                for (String s2 : tab) {
                    if (tab.contains(s2)) {
                        temp++;
                    }
                }
                if (temp > finalC) {
                    finalC = temp;
                    najbolj = s1;
                }
            }


        }
    }

}
