package task1;

import java.util.Scanner;

public class Task1 {
    public static final int NUMBER_FOR_COMPARE = 7;
    public static final  String GET_INPUT_MSG = "Введите целое число или exit для выхода из программы:";
    public static final  String HELLO_MSG = "Привет";
    public static final  String ERROR_MSG = "Неправильный ввод";
    public static final  String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        do {
            System.out.println(GET_INPUT_MSG);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(EXIT_COMMAND)) {
                isExit = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    if (number > NUMBER_FOR_COMPARE) {
                        System.out.println(HELLO_MSG);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(ERROR_MSG);
                }
            }
        }
        while (!isExit);
        scanner.close();
    }
}
