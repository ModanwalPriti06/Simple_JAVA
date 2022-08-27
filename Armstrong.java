import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        int GCD=1;
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int min= num1>num2 ? num2: num1;
        while(min>2){
            if(num1%min==0 && num2%min==0){
                GCD=min;
                break;
            }
            min--;
        }
        System.out.println("GCD("+num1+","+num2+")="+min);

    }
}

/** Euclid's Algorithm :if two number a,b
 * GCD(a,b)=GCD(b,a%b)
 * GCD(a,0)=a
 */