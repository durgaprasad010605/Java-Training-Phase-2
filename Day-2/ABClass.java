abstract class Bank{
    int acno;
    static String name;
    static void display(){
        System.out.println("Bank name is: "+name);
    }
    Bank(String s){
        System.out.println("Inside Abstract class "+s);
    }
}
class SBI extends Bank{
    SBI(String s,int num){
       super(s);
    System.out.println("Inside SBI class "+num);
}
}
public class ABClass {
    public static void main(String[] args) {
        SBI b=new SBI("rdp",1);
        Bank.display();
    }  
}
