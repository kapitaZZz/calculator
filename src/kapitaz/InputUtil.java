package kapitaz;

public class InputUtil {
    // класс для обработки строки ввода от пользователя

    private String numberOne;
    private String numberTwo;

    public char operation;

    public void stringToArray(String lineInput) {
        // выделяет из строки ввода числа и одерацию над числами

        String input = lineInput;

        String[] inElements = input.split("\\s");
        numberOne = String.valueOf(inElements[0]);
        numberTwo = String.valueOf(inElements[2]);

//        numberOne = Integer.valueOf(inElements[0]);
//        numberTwo = Integer.valueOf(inElements[2]);
        char[] operationVar = inElements[1].toCharArray();
        operation = operationVar[0];


    }

    public String getNumberOne() {
        return numberOne;
    }

    public String getNumberTwo() {
        return numberTwo;
    }

//    public char getOperation() {
//        return operation;
//    }


}
