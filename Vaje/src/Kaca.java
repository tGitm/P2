import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Tim
 */
public class Kaca {
    
    private static Random rnd;
        /* IGRALNA POVRŠINA */
    private static final int HEIGHT = 20;
    private static final int WIDTH = 32;

    /* KAČA */
    private static final int SQUARE_WIDTH = 30; // širina kvadratka, ki bo sestavni del kače
    private static int[][] kaca; // seznam x in y koordinat kače
    private static int xGlava;
    private static int yGlava;
    private static int dolzina;

    /* HRANA */
    private static int xHrana;
    private static int yHrana;

    /* PARAMETRI IGRE */
    private static boolean playing = true;
    private static int delay = 10; // čas med posameznima frameoma

    /* SMERI GIBANJA KAČE */
    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;

    private static int smer = RIGHT; // trenutna smer gibanja kače

    private static int tocke = 0;

    /* KODE SMERNIH TIPK */
    private static final int LEFT_BUTTON = 37;
    private static final int UP_BUTTON = 38;
    private static final int RIGHT_BUTTON = 39;
    private static final int DOWN_BUTTON = 40;

    public static void main(String[] args) {
        // ustvari igro
        initGame();

        int i = 0; // števec framov
        while (playing) {
            spremeniSmer();

            if (++i % 10 == 0) {
                // kačo izrišemo vsak deseti frame zaradi lažjega nadzora nad kačo
                premakni();
                show();
            }

            // med vsakim frameom počakamo določeno število milisekund
            StdDraw.pause(delay);
        }
    }
    
    static void initGame(){
        StdDraw.setCanvasSize(WIDTH*SQUARE_WIDTH, HEIGHT*SQUARE_WIDTH);
        StdDraw.setXscale(-1*SQUARE_WIDTH,SQUARE_WIDTH*WIDTH);
        StdDraw.setYscale(-1*SQUARE_WIDTH, SQUARE_WIDTH*HEIGHT);
        
        xGlava = WIDTH/2;
        yGlava = HEIGHT/2;
        dolzina = 3;
        
        kaca = new int[WIDTH*HEIGHT][2];
        kaca[0][0] = xGlava;    //1. element 1. vrstice
        kaca[0][1] = yGlava;    //2. element 1. vrstice
        
        kaca[1][0] = xGlava -1;    //1 v levo
        kaca[1][1] = yGlava;    
        
        kaca[2][0] = xGlava -2;    //2 v levo
        kaca[2][1] = yGlava;  
        
        rnd = new Random();
        nastaviHrano();
        
    }
    
    private static void spremeniSmer() {
        if (StdDraw.isKeyPressed(LEFT_BUTTON)){
            smer = LEFT;
        }
        else if(StdDraw.isKeyPressed(RIGHT_BUTTON)){
            smer = RIGHT;
        }
        else if (StdDraw.isKeyPressed(UP_BUTTON)){
            smer = UP;
        }
        else if (StdDraw.isKeyPressed(DOWN_BUTTON)){
            smer = DOWN;
        }
    }

    private static boolean vKaci(int x, int y){
        for (int i=0; i<=kaca.length;i++){
            if (kaca[i][0] == kaca[1][0])
                return true;
            
            else return false;
        }
        return false;
    }
    
    private static void premakni() {
        switch(smer){
            case UP: yGlava ++; break;
            case DOWN: yGlava --; break;
            case LEFT: xGlava --; break;
            case RIGHT: xGlava ++;  //na zadnjem elementu ne rabim breaka;
        }
        
        if (xGlava >= WIDTH || xGlava < 0 || yGlava >= HEIGHT || yGlava < 0 || vKaci(xGlava, yGlava)){
            playing = false;
            
        }else{
            for (int i=dolzina; i>0; i--){
                kaca[i][0] = kaca[i-1][0];
                kaca[i][1] = kaca[i-1][1];
            }
            kaca[0][0] = xGlava;
            kaca[0][1] = yGlava;

        }
    }

    private static void show() {
        StdDraw.setPenColor(Color.gray);
        StdDraw.filledSquare(kaca[0][0]*SQUARE_WIDTH, kaca[0][1]*SQUARE_WIDTH, SQUARE_WIDTH/2 -1);
        StdDraw.setPenColor(Color.white);
        StdDraw.filledSquare(kaca[dolzina][0]*SQUARE_WIDTH, kaca[dolzina][1]*SQUARE_WIDTH, SQUARE_WIDTH/2);
     
    }

    private static void nastaviHrano() {
        xHrana = rnd.nextInt(WIDTH);
        yHrana = rnd.nextInt(HEIGHT);
        
        StdDraw.setPenColor(Color.red);
        StdDraw.filledCircle(xHrana*SQUARE_WIDTH, yHrana*SQUARE_WIDTH, SQUARE_WIDTH/2 -1);
    }
    

}
