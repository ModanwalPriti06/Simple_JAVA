public class MultiArray {
    public static void main(String[] args){
        int[][] items=new int[3][];
        items[0]=new int[]{2,5,8};
        items[1]=new int[]{1,2};
        items[2]=new int[]{9,6,3,7};

        //Printing the array
        for(int column=0;column<3;column++){
            System.out.print(items[0][column]);
        } System.out.println();

        for(int column=0;column<2;column++){
            System.out.print(items[1][column]);
        }
        System.out.println();
        for(int column=0;column<4;column++){
            System.out.print(items[2][column]);
        }
        System.out.println();
    }
}
