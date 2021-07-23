package kapitaz;

import java.util.Scanner;

public class Main {

    public static int numberOne, numberTwo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputUtil inputUtil = new InputUtil();
        Operation operationObj = new Operation();
        CheckInput checkInput = new CheckInput();

        System.out.println("This is simple calculator, it works with simple arabic and roman numbers only,");
        System.out.println("Use number only in 0 to 10");
        System.out.println("For exit type 'EXIT'.");
        System.out.println("Input numbers and operation in a line (a + b): ");

        while (true) {
            System.out.print("Input: ");
            String userInput = scanner.nextLine();
            String exitKey = userInput.toLowerCase();

            if (exitKey.equals("exit")) {
                System.out.println("Good bye!");
                break;
            }

            inputUtil.stringToArray(userInput);
            char operation = inputUtil.operation;

            try {
                if (checkInput.isNumeric(inputUtil.getNumberOne()) || (checkInput.isNumeric(inputUtil.getNumberTwo()))) {
                    int numberOne = Integer.parseInt(inputUtil.getNumberOne());
                    int numberTwo = Integer.parseInt(inputUtil.getNumberTwo());

                    if (numberOne < 11 && numberOne > 0) {
                        if (numberTwo > 0 && numberTwo < 11) {
                            System.out.println(operationObj.result(numberOne, numberTwo, operation));
                        } else {
                            throw new Exception("Second number is not valid");
                        }
                    } else {
                        throw new Exception("First number is not valid");
                    }
                } else if (!checkInput.isNumeric(inputUtil.getNumberOne()) && (!checkInput.isNumeric(inputUtil.getNumberTwo()))) {
                    numberOne = RomanNumeral.romanToArabic(inputUtil.getNumberOne());
                    numberTwo = RomanNumeral.romanToArabic(inputUtil.getNumberTwo());

                    if (numberOne < 11 && numberOne > 0) {
                        if (numberTwo > 0 && numberTwo < 11) {

                            int result = operationObj.result(numberOne, numberTwo, operation);
                            System.out.println(RomanNumeral.arabicToRoman(result));

                        } else {
                            throw new Exception("Second number is not valid");
                        }
                    } else {
                        throw new Exception("First number is not valid");
                    }
                }
            } catch (Exception e) {
                System.out.println("Wrong input data - " + e.getMessage());
                break;
            }
        }
    }
}

