package practice.ch5;

public class Exercise5_11 {
    public static void main(String[] args) {
        int[][] score = {
            {100,100,100},
            {20,20,20},
            {30,30,30},
            {40,40,40},
            {50,50,50}
        };
    int[][] result = new int[score.length+1][score[0].length];

    for(int i=0; i<score.length; i++){
        for(int j=0; j<score[i].length; j++){
                
            }
        }

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result.length; j++){
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    }//main
    
}
