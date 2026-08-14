class Age{
    private int value;
    void setAge(int age){
        this.value=age;
    }
    int getAge(){
        return value;
    }
}
public class VoteSys {
public static void main(String[] args) {
    Age a=new Age();
    a.setAge(20);
    if(a.getAge()>=18){
        System.out.println("Eligible for vote");
    }
    else{
        System.out.println("Not Eligible for vote");
    }    
}
}
