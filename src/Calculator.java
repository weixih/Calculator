public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double multiply(double num1,double num2){
        return num1*num2;
    }

    public double divide(double num1,double num2){
        return num1/num2;
    }

    public double subtract(double num1,double num2){
        return num1-num2;
    }

    public double add(double num1,double num2){
        return num1+num2;
    }

    public double mod(double num1,double num2){
        return num1%num2;
    }

    public double powerOf(double num1,double num2){
        return Math.pow(num1, num2);
    }

    public String display(double number){
        String display = String.valueOf(number);
        if(number%1==0){
            display = display.substring(0, display.indexOf("."));
        }
        return display;
    }
}
