import java.util.Arrays;
public class TwoPointer2 {
    public static void main(String[] args) {
        int[] num = {15, 6, 18, 16, 10, 3};
        int target=25;
        Arrays.sort(num);
        for (int k = 0; k < num.length - 2; k++) {
            int i = k+1;
            int j = num.length - 1;
            while (i < j) {
                int sum=num[i]+num[j]+num[k];
                if(sum==target){
                    System.out.println("sum of three nu of array is = equal target "+num[i]+" "+num[j]+" "+num[k]);
                    i++;
                    j--;
                }
                else  if(sum<target){
                    i++;
                }
                else{
                    j--;
                }

            }
        }
    }
}
