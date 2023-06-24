import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create an instance of the Calculator class.

        Calculator calculator = new Calculator();

        // Prompt the user for input and perform calculations using the Calculator object.

        System.out.println("Number 1: ");
        double operandOne = scanner.nextDouble();
        calculator.setOperandOne(operandOne);

        System.out.println("Operator: ");
        String operator = scanner.next();
        calculator.setOperator(operator);

        System.out.println("Number 2: ");
        double operandTwo = scanner.nextDouble();
        calculator.setOperandTwo(operandTwo);

        calculator.performCalculation();

        // Display result.

        System.out.println("Result: " + calculator.getResult());

        scanner.close();

        }
    }
