package u05_Connect4;



import java.awt.event.KeyEvent;

public class Main{

        static int level = 0;
        static boolean boardchange = true;
        static Integer[][] map;

    public static void main(String[] arg) {
        StdDraw.setScale(0, 1000);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(500, 500, 400, 400);

        if (boardchange == true) {
            level = 1;
            map = drawMap(1);
        }


        map[9][2] = 1; // Player
        //KeyPress();
        update();

        boolean valid = false;

        while (true) {
            while (valid) {
                valid = boardMove(valid);
            }
            if (valid == false && (!StdDraw.isKeyPressed(KeyEvent.VK_UP) && !StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && !StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && !StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) ){
                valid = true;
            }
        }
    }

    public static boolean boardMove(boolean valid){
        if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
            loop:
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (map[i][j] == 1) { //
                        //System.out.println(i + ", " + j + " Right");
                        if (map[i + 1][j] == 3) { // Path
                            //System.out.println("INNNNNERRRRR Right ");
                            map[i][j] = 2;
                            map[i+1][j] = 1;
                            valid = false;
                            break loop;
                        }
                        else if (map[i+1][j] == 4){
                            System.out.println("GOAL REACHED");
                            levelChange();
                        }
                        else{
                            endGameL();
                        }
                    }
                }
            }
        }
        else if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
            loop:
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (map[i][j] == 1) { //
                        //System.out.println(i + ", " + j + " LEFT");
                        if (map[i - 1][j] == 3) { // Path
                            //System.out.println("INNNNNERRRRR LEFT ");
                            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                            map[i][j] = 2;
                            map[i-1][j] = 1;
                            valid = false;
                            break loop;
                        }
                        else if (map[i-1][j] == 4){
                            System.out.println("GOAL REACHED");
                            levelChange();
                        }
                        else{
                            endGameL();
                        }
                    }
                }
            }
        }
        else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
            loop:
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (map[i][j] == 1) { //
                        //System.out.println(i + ", " + j + " UP");
                        if (map[i][j + 1] == 3) { // Path

                            //System.out.println("INNNNNERRRRR UP");
                            map[i][j] = 2;
                            map[i][j+1] = 1;
                            valid = false;
                            break loop;
                        }
                        else if (map[i][j + 1] == 4){
                            System.out.println("GOAL REACHED");
                            levelChange();
                        }
                        else{
                            endGameL();
                        }
                    }
                }
            }
        }
        else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
            loop:
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (map[i][j] == 1) { //
                        //System.out.println(i + ", " + j + " DOWN");
                        if (map[i][j - 1] == 3) { // Path
                            //System.out.println("INNNNNERRRRR Down");
                            map[i][j] = 2;
                            map[i][j-1] = 1;
                            valid = false;
                            break loop;
                        }
                        else if (map[i][j - 1] == 4){
                            System.out.println("GOAL REACHED");
                            levelChange();
                            //changeLevel();
                        }
                        else{
                            endGameL();
                        }
                    }
                }
            }
        }
        update();
        return valid;
    }

    public static void levelChange(){
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                map[i][j] = 4;
            }
        }
        update();
        StdDraw.pause((int)(1000)); // Pauses to show the user beat the level
        if (level == 1){
            map = drawMap(2);
            level = 2;
            map[9][2] = 1; // Player
        }
        else if (level == 2){
            map = drawMap(3);
            level = 3;
            map[3][15] = 1; // Player
        }
        else if (level == 3){
            map = drawMap(4);
            level = 4;
            //map[3][15] = 1;
        }
    }

    private static void endGameL(){
        map = new Levels().loss();
        level = 5;
        update();
        update();
        StdDraw.pause((int)(1000)); // Pauses to show the user beat the level
        level = 1;
        map = drawMap(1);
        map[9][2] = 1; // Player
        //KeyPress();
        update();
    }



    public static Integer[][] drawMap(int x){
        if(x == 3){
            return new Levels().level3();
        }
        else if (x == 2){
            return new Levels().level2();
        }

        else if (x == 4){
            return new Levels().win();
        }
        else{
            return new Levels().level1();
        }
    }



    public static void update(){
        for (int i = 0; i<20; i++){
            for (int j = 0; j<20; j++){
                if (map[i][j] == 1){ //
                    StdDraw.setPenColor(StdDraw.BOOK_BLUE); // Player
                    StdDraw.filledSquare((i+3)*40,(j+3)*40,20);
                }
                else if (map[i][j] == 2){ // Already Stepped on
                    StdDraw.setPenColor(StdDraw.BOOK_RED);
                    StdDraw.filledSquare((i+3)*40,(j+3)*40,20);
                }
                else if (map[i][j] == 3){ // Path
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.filledSquare((i+3)*40,(j+3)*40,20);
                }
                else if (map[i][j] == 4){ // GOAL
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledSquare((i+3)*40,(j+3)*40,20);
                }
                else{
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare((i+3)*40,(j+3)*40,20);
                }
            }
        }
        StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
        StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
    }
}