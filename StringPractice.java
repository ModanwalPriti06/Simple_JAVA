public class StringPractice {
    public static void main(String[] args) {
        String name=new String(); //Empty String
        System.out.println(name);

        String name1=new String("Priti Modanwal");
        System.out.println(name1);
        System.out.println(name1.length());

        char[] myName={'p','r','i','t','i'};
        String name2=new String(myName);
        System.out.println(name2);

        char[] target=new char[8];
        name1.getChars(0,8,target,0);
        System.out.println(target);

        char[] nameArray=name2.toCharArray();
        for(char c:nameArray){
            System.out.println(c+" ");
        }

        System.out.println("Preeti".equals("priti"));
        System.out.println("Preeti".equals("Preeti"));
        System.out.println("Preeti".equalsIgnoreCase("Priti"));
        System.out.println(name1.indexOf('t'));


    }
}
