import java.util.*;


class main {
    public static int [] Blank(int [][] initial){
        int coordinates [] = new int[2];
        for(int i=0;i< initial.length;i++){
            for(int j=0;j< initial.length;j++){
                if(initial[i][j]==0){
                    int x=i;
                    int y= j;
                    coordinates[0]=x;
                    coordinates[1]=y;
                }
            }
        }
    return coordinates;}
    public static void main(String[] args) {

        Random rd = new Random();
        int[][] initial = {{1, 2, 3}, {4, 5, 6}, {7, 8,0}};
        for (int i = initial.length - 1; i > 0; i--) {
            for (int j = initial[i].length - 1; j > 0; j--) {
                int m = rd.nextInt(i + 1);
                int n = rd.nextInt(j + 1);

                int temp = initial[i][j];
                initial[i][j] = initial[m][n];
                initial[m][n] = temp;
            }
        }
        for(int i=0;i< initial.length;i++){
            for(int j=0;j<initial.length;j++){
                System.out.print(initial[i][j]);
            }
            System.out.print("\n");
        }


        int[][] goal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int coordinates []= Blank(initial);
        int x= coordinates[0];
        int y=coordinates[1];

        // White tile coordinate


        Puzzle puzzle = new Puzzle();
        if (puzzle.isSolvable(initial)) {
            puzzle.solve(initial, goal, x, y);
        }else {
            System.out.println("The given initial is impossible to solve");
        }
    }}

