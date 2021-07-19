package kapitaz;

public class Operation {

    // класс для работы над числами

    public static int result;

    public int result(int one, int two, char operation) {
        // вычисление результата после ввода данных от пользователя

        switch (operation) {
            case '+':
                result = one + two;
                break;
            case '-':
                result = one - two;
                break;
            case '*':
                result = one * two;
                break;
            case '/':
                result = one / two;
                break;
            default:
                System.out.println("Unknown operation");
        }
        return result;
    }
}
