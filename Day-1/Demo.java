public class Demo {
    Demo(){
        System.out.println("Demo class object created");
    }
    Demo(String name){
        System.out.println("name: "+name);
    }
    public static void main(String[] args) {
        Demo ob=new Demo();
        Demo ob1=new Demo("RDP"); 
    }
}
