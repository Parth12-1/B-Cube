package u05_Connect4;



public class Levels {


    public Integer[][] level1(){
        Integer[][] send =  new Integer[25][25];
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                send[i][j] = 0;
            }
        }




        send[9][11] = 4;
        send[9][10] = 3;
        send[9][9] = 3;
        send[9][8] = 3;
        send[9][7] = 3;
        send[9][6] = 3;
        send[9][5] = 3;
        send[9][4] = 3;
        send[9][3] = 3;

        return send;
    }

    public Integer[][] level2(){
        Integer[][] send =  new Integer[25][25];
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                send[i][j] = 0;
            }
        }
        //start is [9][2]
        send[10][2] = 3;
        send[10][3] = 3;
        send[9][3] = 3;
        send[9][4] = 3;
        send[8][4] = 3;
        send[7][4] = 3;
        send[7][3] = 3;
        send[7][2] = 3;
        send[7][1] = 3;
        send[7][0] = 3;
        send[8][0] = 3;
        send[9][0] = 3;
        send[10][0] = 3;
        send[11][0] = 3;
        send[12][0] = 3;
        send[12][1] = 3;
        send[12][2] = 3;
        send[12][3] = 3;
        send[13][3] = 3;
        send[13][4] = 3;
        send[13][5] = 3;
        send[13][6] = 3;
        send[13][7] = 3;
        send[13][8] = 3;
        send[13][9] = 3;
        send[12][9] = 3;
        send[11][9] = 3;
        send[11][10] = 3;
        send[10][10] = 3;;
        send[9][10] = 4;



        return send;
    }

    public Integer[][] level3(){
        Integer[][] send =  new Integer[25][25];
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                send[i][j] = 0;
            }
        }

        send[4][15] = 3;
        send[5][15] = 3;
        send[6][15] = 3;
        send[6][14] = 3;
        send[6][13] = 3;
        send[6][12] = 3;
        send[7][12] = 3;
        send[8][12] = 3;
        send[9][12] = 3;
        send[9][13] = 3;
        send[9][14] = 3;
        send[8][14] = 3;
        send[8][15] = 3;
        send[9][15] = 3;
        send[10][15] = 3;
        send[11][15] = 3;
        send[11][14] = 3;
        send[11][13] = 3;
        send[11][12] = 3;
        send[11][11] = 3;
        send[10][11] = 3;
        send[10][10] = 3;
        send[10][9] = 3;
        send[10][8] = 3;
        send[11][8] = 3;
        send[12][8] = 3;
        send[12][7] = 3;
        send[11][7] = 3;
        send[11][6] = 3;
        send[11][5] = 3;
        send[12][5] = 3;
        send[13][5] = 3;
        send[13][6] = 3;
        send[14][6] = 3;
        send[15][6] = 3;
        send[16][6] = 3;
        send[16][7] = 3;
        send[16][8] = 3;
        send[15][8] = 3;
        send[14][8] = 3;
        send[14][9] = 3;
        send[15][9] = 3;
        send[15][10] = 3;
        send[14][10] = 3;
        send[14][11] = 3;
        send[14][12] = 3;
        send[15][12] = 3;
        send[16][12] = 3;
        send[17][12] = 3;
        send[18][12] = 3;
        send[18][11] = 3;
        send[18][10] = 3;
        send[18][9] = 3;
        send[18][8] = 3;
        send[18][7] = 3;
        send[18][6] = 3;
        send[18][5] = 3;
        send[18][4] = 3;
        send[17][4] = 3;
        send[16][4] = 3;
        send[15][4] = 3;
        send[14][4] = 3;
        send[14][3] = 3;
        send[13][3] = 3;
        send[12][3] = 3;
        send[12][2] = 3;
        send[12][1] = 3;
        send[11][1] = 3;
        send[10][1] = 3;
        send[9][1] = 3;
        send[9][2] = 3;
        send[9][3] = 3;
        send[9][4] = 3;
        send[9][5] = 3;
        send[9][6] = 3;
        send[9][7] = 3;
        send[8][7] = 3;
        send[6][7] = 3;
        send[5][7] = 3;
        send[5][6] = 3;
        send[5][5] = 3;
        send[5][4] = 3;
        send[5][3] = 3;
        send[6][3] = 3;
        send[7][3] = 3;
        send[7][4] = 3;
        send[7][5] = 4;
        send[7][7] = 3;


        return send;
    }

    public Integer[][] win(){
        //send[0][0] = 3;
        //send[0][19] = 3;
        //send[19][19] = 3;
        //send[19][0]=3;
        Integer[][] send =  new Integer[25][25];
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                send[i][j] = 0;
            }
        }

        send[2][14] = 4;
        send[2][13] = 4;
        send[3][12] = 4;
        send[4][11] = 4;
        send[4][10] = 4;
        send[5][9] = 4;
        send[6][8] = 4;
        send[6][7] = 4;
        send[7][7] = 4;
        send[8][8] = 4;
        send[9][9] = 4;
        send[10][10] = 4;
        send[11][9] = 4;
        send[12][8] = 4;
        send[13][7] = 4;
        send[14][7] = 4;
        send[14][8] = 4;
        send[15][9] = 4;
        send[16][10] = 4;
        send[16][11] = 4;
        send[17][12] = 4;
        send[18][13] = 4;
        send[18][14] = 4;




        return send;
    }

    public Integer[][] loss(){
        Integer[][] send =  new Integer[25][25];
        for (int i = 0; i<25; i++){
            for (int j = 0; j<25; j++){
                send[i][j] = 0;
            }
        }

        send[7][14] = 2;
        send[7][13] = 2;
        send[7][12] = 2;
        send[7][11] = 2;
        send[7][10] = 2;
        send[7][9] = 2;
        send[7][8] = 2;
        send[7][7] = 2;
        send[7][6] = 2;
        send[8][6] = 2;
        send[9][6] = 2;
        send[10][6] = 2;
        send[11][6] = 2;
        send[12][6] = 2;


        return send;
    }


}
