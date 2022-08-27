class Static1{
    static int age=10;  //
    public static void priti(){
        System.out.println("Priti Modanwal");
    }
}
public class StaticMethod {
    public static void main(String[] args){
        //access with the help of class name
        Static1.priti();
        //access with the help of object
        Static1 obj=new Static1();
        System.out.println(Static1.age);
        obj.priti();

    }

}
