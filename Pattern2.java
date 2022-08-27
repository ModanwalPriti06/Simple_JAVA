import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input= sc.nextInt();

        int sum=0;
        for(int i=1;i<=input;i++){
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("sum is "+sum);

    }
}
