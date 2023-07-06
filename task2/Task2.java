package task2;

import java.util.Scanner;

public class Task2 {
    private static final String GET_INPUT_MSG = "Введите имя:";
    private static final String NAME = "Вячеслав";
    public static final  String HELLO_MSG = "Привет, " + NAME;
    public static final  String WRONG_NAME_MSG = "Нет такого имени";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GET_INPUT_MSG);
        System.out.println(
                scanner.nextLine().equals(NAME) ? HELLO_MSG : WRONG_NAME_MSG
        );
    }
}
