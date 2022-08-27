public class Pyramid {
    public static void main(String[] args){
        int n=5;
        //upper triangle
        for(int i=1;i<=n;i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //half first left of number 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            //after 1 triangle
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
