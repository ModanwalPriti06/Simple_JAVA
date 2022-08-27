class AccessDemo{
    private String name;
    //Access Private Specifier set Value here
    public String setValue(String name){
        this.name=name;
        return name;
    }
    //Access Private Specifier get Value here
    public void getValue(){
        System.out.println(name);
    }
}
public class AccessSpecifier{
    public static void main(String[] args){
        AccessDemo obj=new AccessDemo();
        obj.setValue("Priti ");
        obj.getValue();
    }
}