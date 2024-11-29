public class Calculator {
    class Operation {
        public int add (int a, int b){
            return a+b;
        }
        public int subtract (int a, int b) {
            return a-b;
        }
        public int multiply (int a, int b){
            return a*b;
        }
        public int divide (int a, int b){
            return a/b;
        }

    }
    public void performOperations(int a,String operation,int b){
        Operation operationtion = new Operation();
        operation = new Operation();
        switch (operation){
            case"+"->System.out.println(operationtion.add(a,b));
            case"-"->System.out.println(operationtion.subtract(a,b));
            case"*"->System.out.println(operationtion.multiply(a,b));
            case"/"->System.out.println(operationtion.divide(a,b));

        }
    }

}
