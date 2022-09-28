public class Main {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        int sum=calculator.Sum(5,5);
        int deduct=calculator.Deduct(5,5);
        int multiply=calculator.Multiply(5,5);
        int divide=calculator.Divide(5,5);
        System.out.println(sum+" "+deduct+" "+multiply+" "+divide);

    }
}