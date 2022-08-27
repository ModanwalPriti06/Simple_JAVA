import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}
