public class BitWiseOperator {
    public static void main(String[] args) {
        int result= 9 & 8;
        System.out.println("Bitwise and operator "+result);
        int result1=9 | 8;
        System.out.println("OR operator "+result1);
        int result3= 23<<2;
        System.out.println("shift left "+result3);
        int result4= 23>>2;
        System.out.println("shift right "+result4);
        int result5= ~5;
        System.out.println(result5);

    }
}

