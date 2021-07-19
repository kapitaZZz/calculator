package kapitaz;

import java.util.Scanner;

public class Main {

    public static int numberOne, numberTwo;

    public static void main(String[] args) {

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        InputUtil inputUtil = new InputUtil();
        Operation operationObj = new Operation();
        Translator translator = new Translator();
        CheckInput checkInput = new CheckInput();

        System.out.print("Input numbers and operation in a line (a + b): ");
        String userInput = scanner.nextLine();

        //TODO check input about numbers arabic or roman

        inputUtil.stringToArray(userInput);
        char operation = inputUtil.operation;

        if (checkInput.isNumeric(inputUtil.getNumberOne())) {
            int numberOne = Integer.valueOf(inputUtil.getNumberOne());
            if (checkInput.isNumeric(inputUtil.getNumberTwo())) {
                int numberTwo = Integer.valueOf(inputUtil.getNumberTwo());

                System.out.println(operationObj.result(numberOne, numberTwo, operation));

            } else {
                numberTwo = translator.romanToNumber(inputUtil.getNumberTwo());
                System.out.println(operationObj.result(numberOne, numberTwo, operation));
            }
        } else {
            numberOne = translator.romanToNumber(inputUtil.getNumberOne());
            System.out.println(operationObj.result(numberOne, numberTwo, operation));
        }


    }
}
