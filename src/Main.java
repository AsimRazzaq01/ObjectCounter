// set counter to 0
class ObjectCounter{
    private static int myCounter = 0 ;
    //constructer increaser
    public ObjectCounter(){
        myCounter++;
    }
// counter feedback method
    public static int getMyCounter(){
        return myCounter;
    }
}
public class Main {
    public static void main(String[] args) {
//object tests
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();
        ObjectCounter obj5 = new ObjectCounter();
// print object counter static method
        System.out.println("Objects created = " + ObjectCounter.getMyCounter());
    }
}