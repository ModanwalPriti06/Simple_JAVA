public class TwoDArray {
    public static void main(String[] args){
        //Two D Array 2*3
        int[][] items={
                {
                   10,
                        20,
                        30
                },
                {
                    40,
                        50,
                        60
                }
        };
        for(int[] row:items){
            for(int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }

    }
}
