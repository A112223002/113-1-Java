public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.println("直升機");
        super.fly();
    }
}
