
package kviz4;

public class Kviz4_2 {
    
    static void poisciInIzpisiBarve(String imeDatoteke){
        java.util.ArrayList<String> tabela = new java.util.ArrayList<String>();
        try{
            java.util.Scanner sc = new java.util.Scanner(new java.io.File(imeDatoteke));
            while (sc.hasNextLine()) {
                String vrstica = sc.nextLine();
                String [] splitted = vrstica.split(" ");
                for (String s : splitted) {
                    s=s.replace(";","");
                    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("^#([A-Fa-f0-9]{6})$");
                    java.util.regex.Matcher matcher = pattern.matcher(s);
                    if (matcher.find()){
                        tabela.add(matcher.group(1));
                    }
                }

            }

        }

        catch(java.io.FileNotFoundException e){}

        for (String s : tabela) {
            s="#"+s;
            if(s.equals("#fafafa")) continue;
            int r = Integer.valueOf( s.substring( 1, 3 ), 16 );
            int g = Integer.valueOf( s.substring( 3, 5 ), 16 );
            int b = Integer.valueOf( s.substring( 5, 7 ), 16 );
            double R = r/255.0;
            double G = g/255.0;
            double B = b/255.0;

            double M = Math.max(Math.max(R,G),B);
            double m = Math.min(Math.min(R,G),B);
            double C = M-m;

            double hoe = 0;
            if(C == 0) hoe = 0;
            else if(M == R) hoe = (G-B)/C % 6;
            else if(M == G) hoe = (B-R)/C + 2;
            else if(M == B) hoe = (R-G)/C + 4;

            double H = 60*hoe;
            if(H<0) H+= 360;

            double L = (M+m)/2;
            double S;
            if(L == 1) S = 0;
            else S = C*100/(1.0-Math.abs(2.0*L-1.0));

            System.out.println(s+" -> rgb("+r+", "+g+", "+b+") -> hsl("+Math.round(H)+", "+Math.round(S)+", "+Math.round(L*100)+")");
        }
    }
    
    
}
