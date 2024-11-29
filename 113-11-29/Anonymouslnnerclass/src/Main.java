public class Main {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        };
        Greeting greeting2=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        };
        greeting1.sayHello();
        greeting2.sayHello();
    }

}
