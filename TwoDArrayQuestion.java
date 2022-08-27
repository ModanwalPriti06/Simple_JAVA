import java.util.*;
public class TwoDArrayQuestion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column value first ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                array[i][j] = sc.nextInt();
                }

            }
        int x=sc.nextInt();
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == x) {
                    System.out.println("("+i+" "+j+")");
                }
            }
        }


    }
}
