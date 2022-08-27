class Priti{
    String name;
    String address;
    long mobNo;
    static  int numberOfVisitor=0;
    Priti(String name,String address,long mobNo){
        this.name=name;
        this.address=address;
        this.mobNo=mobNo;
        numberOfVisitor++;
    }

}
public class StaVariable {
    public static void main(String[] args) {
        Priti obj1=new Priti("Gippy","JAunpur",9918247460l);
        Priti obj2=new Priti("Kirti","Sultanpur",9914521365l);
        System.out.println(obj1.name);
        System.out.println(obj1.address);
        System.out.println(obj1.mobNo);
        System.out.println(obj1.numberOfVisitor);
        //System.out.println(obj1.Priti());

    }
}
