public class MissingValue {
    public static void main(String[] args){
        int[] a={1,2,3,5,6,7,8,9,10};
        int sumOf=(10*11)/2;
        int actualSum=0;
        for(int value:a){
            actualSum += value;
        }
        System.out.print(sumOf-actualSum);
    }
}
