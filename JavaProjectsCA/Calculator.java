public class Calculator {

    Calculator(){

    }

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int modulo(int a, int b){
        return a%b;
    }
    

    public static void main(String[] args) {
        
        Calculator myCalculator = new Calculator();

        myCalculator.add(5, 7);

        myCalculator.subtract(45, 11);

    
    }
}
