package Project.SimpleCalculator;

public class Calculator {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 2;

        char operator = '+';

        String result = switch (operator) {
            case '+':
                yield Integer.toString((number1 + number2));
            case '-':
                yield Integer.toString((number1 - number2));
            case '/':
                yield Integer.toString((number1 / number2));
            case '*':
                yield Integer.toString((number1 * number2));

            default:
                yield "Not valid Operator";
        };
        System.out.println(result);
    }

}
