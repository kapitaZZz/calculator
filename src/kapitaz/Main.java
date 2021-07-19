package kapitaz;

import java.util.Scanner;

public class Main {

    public static int numberOne, numberTwo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputUtil inputUtil = new InputUtil();
        Operation operationObj = new Operation();
        Translator translator = new Translator();
        CheckInput checkInput = new CheckInput();

        System.out.print("Input numbers and operation in a line (a + b): ");
        String userInput = scanner.nextLine();

        inputUtil.stringToArray(userInput);
        char operation = inputUtil.operation;

        if (checkInput.isNumeric(inputUtil.getNumberOne())) {
            int numberOne = Integer.parseInt(inputUtil.getNumberOne());
            if (checkInput.isNumeric(inputUtil.getNumberTwo())) {
                int numberTwo = Integer.parseInt(inputUtil.getNumberTwo());

                System.out.println(operationObj.result(numberOne, numberTwo, operation));

            } else {
                numberTwo = translator.romanToNumber(inputUtil.getNumberTwo());
                System.out.println(operationObj.result(numberOne, numberTwo, operation));
            }
        } else {
            numberOne = translator.romanToNumber(inputUtil.getNumberOne());

            if (checkInput.isNumeric(inputUtil.getNumberTwo())) {
                int numberTwo = Integer.parseInt(inputUtil.getNumberTwo());
                System.out.println(operationObj.result(numberOne, numberTwo, operation));

            } else {
                numberTwo = translator.romanToNumber(inputUtil.getNumberTwo());
                System.out.println(operationObj.result(numberOne, numberTwo, operation));
            }
        }


    }
}
