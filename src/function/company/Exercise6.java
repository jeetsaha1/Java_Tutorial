package function.company;
import java.util.Scanner;

/*
            Exercise 6: You have to create a custom calculator with following operations:

            1. + -> Addition
            2. - -> Subtraction
            3. * -> Multiplication
            4. / -> Division

            which throws the following exceptions:

            1. Invalid input Exception ex: 8 & 9
            2. Cannot divide by 0 Exception
            3. Max Input Exception if any of the inputs is greater than 100000
            4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

// Creating the Exception ...
class InvalidInputExpression extends Exception{
    public InvalidInputExpression(String error) {
        System.out.println(error);
    }
}



public class Exercise6 {

    public static class CustomCalculator{
        public void CustomCalculator(float a, float b, String s) throws InvalidInputExpression {
            switch (s) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> {
                    if(b == 0) throw new ArithmeticException(("Can't divide by zero"));
                    System.out.println(a / b);
                }
                default -> throw new InvalidInputExpression("Error");
            };
        }
    }




    public static void main(String[] args) throws InvalidInputExpression {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the Second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter the sign: ");
        String s = sc.next();

        try{
            CustomCalculator Calc = new CustomCalculator();
            Calc.CustomCalculator(a,b,s);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
    }
}
