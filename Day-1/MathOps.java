class Addition{
    int c=10;
    static int a=10;
    static int b=10;
    static void add(){
        Addition ob=new Addition();
        System.out.println("Addition class " + (a+b+ob.c));
    }

}
class Subtraction{
     void subtract(){
        System.out.println("Subtraction class");
    }
}

public class MathOps {
    public static void main(String[] args) {
        Addition.add();
        Subtraction sub = new Subtraction();
        sub.subtract();
    }
}
