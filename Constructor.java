class StudentData{
    String name;
    int rollno;
    StudentData(String name, int ip2){ //constructor initialize
        this.name=name;
        rollno=ip2;
    }

}

public class Constructor {
    public static void main(String[] args){
        StudentData std1=new StudentData("Bavleen",12);
        StudentData std2=new StudentData("Bavleen",12);
        System.out.println("First student name is "+std1.name);
        System.out.println("First student name is "+std2.name);
    }
}
