package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static final String GET_INPUT_MSG = "Введите массив целых чисел через пробел:";
    private static final String WRONG_INPUT_MSG = "Неправильный ввод";
    private static final int DIVIDER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GET_INPUT_MSG);
        try {
            Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .filter(n -> n % DIVIDER == 0)
                    .forEach(n -> System.out.print(n + " "));
        } catch (NumberFormatException e) {
            System.out.println(WRONG_INPUT_MSG);
        }

    }
}
