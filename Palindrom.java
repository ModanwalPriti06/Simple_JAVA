// 1221, 99,151
import java.util.*;
public class Palindrom {
    public static void  main(String[] args){
        int number;
        int temp;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        temp=number;
        int reverse=0;
        while(number>0){
            int remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;

        }
        if(temp==reverse){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
