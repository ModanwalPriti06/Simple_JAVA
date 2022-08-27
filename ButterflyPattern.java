public class ButterflyPattern {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            //first part left side star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //first part space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //first part left side star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for(int i=5;i>=1;i--){
            //first part left side star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //first part space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //first part left side star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
