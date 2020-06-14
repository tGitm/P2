package Predavanja;

import java.io.*;

public class FisDisBiti {
    public static void main(String[] args) {
        copy2("viri/m32.png", "viri/medo1.png");
    }

    static void copy(String imeVhoda, String imeIzhoda) {
        try {
            FileInputStream fis = new FileInputStream(new File(imeVhoda));
            FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

            while(fis.available() > 0) {
                fos.write(fis.read());
            }

            fos.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Napaka: " + e.toString());
        }

    }

    static void copy1(String imeVhoda, String imeIzhoda) {
        try {
            FileInputStream  fis = new FileInputStream(new File(imeVhoda));
            FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

            byte [] buffer = new byte[1024];
            int prebrano; // koliko bajtov smo prebrali z zadnjnim branjem
            do {
                prebrano = fis.read(buffer); // preberem blok bajtov (največ 1024)

                if (prebrano > 0) {
                    fos.write(buffer, 0, prebrano);
                }

            } while (prebrano > 0);

            fos.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Napaka: " + e.toString());
        }

    }

    static void copy2(String imeVhoda, String imeIzhoda) {
        try {
            FileInputStream  fis = new FileInputStream(new File(imeVhoda));
            FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

            // dodamo dodatno shranjevanje (bufferiranje) podatkov
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte [] buffer = new byte[1024];
            int prebrano; // koliko bajtov smo prebrali z zadnjnim branjem
            do {
                prebrano = bis.read(buffer); // preberem blok bajtov (največ 1024)

                if (prebrano > 0) {
                    bos.write(buffer, 0, prebrano);
                }

            } while (prebrano > 0);

            bos.close();
            bis.close();
        } catch (Exception e) {
            System.out.println("Napaka: " + e.toString());
        }

    }

}
