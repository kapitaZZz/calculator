package kapitaz;

import java.util.Scanner;

public class Main {

    public static int numberOne, numberTwo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputUtil inputUtil = new InputUtil();
        Operation operationObj = new Operation();
        CheckInput checkInput = new CheckInput();

        System.out.print("Input numbers and operation in a line (a + b): ");

        String userInput = scanner.nextLine();
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
            e.printStackTrace();
        }

    }

}

