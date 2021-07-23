package kapitaz;

public class Operation {

    // класс для работы над числами

    private static int result;

    public int result(int one, int two, char operation) {
        // вычисление результата после ввода данных от пользователя

        switch (operation) {
            case '+' -> result = one + two;
            case '-' -> result = one - two;
            case '*' -> result = one * two;
            case '/' -> result = one / two;
            default -> System.out.println("Unknown operation");
        }
        return result;
    }

}
