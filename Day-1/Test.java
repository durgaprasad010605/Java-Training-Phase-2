interface Engine{
    void start();
}
class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol Engine started");
    }
}

public class Test {
    public static void main(String[] args) {
    Engine e=new PetrolEngine();
    e.start(); 
}
}
