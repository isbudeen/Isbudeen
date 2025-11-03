import java.util.Scanner;

public class SwitchOperations {
    Scanner sc = new Scanner(System.in);
    String ope;
    int num1, num2, sum;

    public void casemtch() {
        System.out.println("Enter the Operation");
        ope = sc.next();
        switch (ope) {
            case "+":
                System.out.println("Enter the number1");
                num1 = sc.nextInt();
                System.out.println("Enter the number2");
                num2 = sc.nextInt();
                sum = num1 + num2;
                System.out.println("Sum of 2 numbers" + sum);
                break;
            case "-":
                System.out.println("Enter the number1");
                num1 = sc.nextInt();
                System.out.println("Enter the number2");
                num2 = sc.nextInt();
                sum = num1 - num2;
                System.out.println("Subtraction of 2 numbers" + sum);
                break;
            case "*":
                System.out.println("Enter the number1");
                num1 = sc.nextInt();
                System.out.println("Enter the number2");
                num2 = sc.nextInt();
                sum = num1 * num2;
                System.out.println("Multiplication of 2 numbers" + sum);
                break;
            case "/":
                System.out.println("Enter the number1");
                num1 = sc.nextInt();
                System.out.println("Enter the number2");
                num2 = sc.nextInt();
                sum = num1 / num2;
                System.out.println("Division of 2 numbers" + sum);
                break;
            case "%":
                System.out.println("Enter the number1");
                num1 = sc.nextInt();
                System.out.println("Enter the number2");
                num2 = sc.nextInt();
                sum = num1 % num2;
                System.out.println("Modulation of 2 numbers" + sum);
                break;
            default:
                System.out.println("Enter the legal operator");
        }
    }

    public static void main(String[] args) {
        SwitchOperations cs = new SwitchOperations();
        cs.casemtch();
    }
}

