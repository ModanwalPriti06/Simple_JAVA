import java.util.ArrayList;
import java.util.Arrays;
import javafx.util.Pair;
public class TwoPointer1 {
    public static void main(String[] args) {
        int[] num = {20, -12, 64, 12, -20, 69};
        Arrays.sort(num);
        ArrayList<Pair<Integer,Integer>> result=new ArrayList<>();
        int start=0;
        int end=num.length-1;
        while(start<end){
            if(num[start]+num[end]==0){
                result.add(new Pair<>(num[start],num[end]));
                System.out.println(result.get(start));
                //System.out.println(result.get(end));
                start++;
                end--;
            }
            else if(num[start]+num[end]<0){
                start++;
            }
            else {
                end--;
            }
        }


    }
}
