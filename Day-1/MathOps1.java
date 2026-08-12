class Addition{
   
    static void add(int num1,int num2){
        System.out.println("Addition class "+(num1+num2));
    }

}
class Subtraction{
     void subtract(){
        System.out.println("Subtraction class");
    }
}
class Multi{
    static int multiply(int num1,int num2){
        return num1*num2;
    }
}
class Division{
    int divide(int num1,int num2){
        return num1/num2;
    }
}

public class MathOps1 {
    public static void main(String[] args) {
        Addition.add(10,20);
        Subtraction sub = new Subtraction();
        sub.subtract();
        int result = Multi.multiply(10, 30);
        System.out.println("Multiplication class " + result);
        Division div = new Division();
        int result1 = div.divide(100, 10);
        System.out.println("Division class " + result1);
    }
}
