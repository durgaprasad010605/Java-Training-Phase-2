interface Engine{
    void start();
}
class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol engine started");
    }
}
class DieselEngine implements Engine{
    public void start(){
        System.out.println("Diesel engine started");
    }
    public void stop(){
        System.out.println("Diesel engine stopped");
    }
}
public class Test {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        DieselEngine dieselEngine = new DieselEngine();

        petrolEngine.start();
        dieselEngine.start();
        dieselEngine.stop();
    }    
}
