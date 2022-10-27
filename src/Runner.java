import java.util.Scanner;

public class Runner {
    public static void main(String[]arg){

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an expression wih *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        double num1 = Double.parseDouble(expression.substring(0, expression.indexOf(" ")));
        double num2 = Double.parseDouble(expression.substring(expression.indexOf(" ")+3));
        String symbol = expression.substring(expression.indexOf(" ")+1, expression.indexOf(" ")+2);


        Calculator calc = new Calculator(num1, num2);

        if(symbol.equals("+")){
            System.out.println("The answer is: "+calc.display(calc.add(num1, num2)));
        }
        if(symbol.equals("-")){
            System.out.println("The answer is: "+calc.display(calc.subtract(num1, num2)));
        }
        if(symbol.equals("*")){
            System.out.println("The answer is: "+calc.display(calc.multiply(num1, num2)));
        }
        if(symbol.equals("/")){
            System.out.println("The answer is: "+calc.display(calc.divide(num1, num2)));
        }
        if(symbol.equals("%")){
            System.out.println("The answer is: "+calc.display(calc.mod(num1, num2)));
        }
        if(symbol.equals("^")){
            System.out.println("The answer is: "+calc.display(calc.powerOf(num1, num2)));
        }


    }
}
