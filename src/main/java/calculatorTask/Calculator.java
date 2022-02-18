package calculatorTask;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        num2 = scanner.nextInt();
        System.out.println("Введите оператор вычесления (+, -, *, /): ");
        symbol = scanner.next().charAt(0);

        try {
            switch (symbol){
                case '+' : result = num1 + num2;
                    break;
                case  '-' : result = num1 - num2;
                    break;
                case '*' : result = num1 * num2;
                    break;
                case  '/' : result = num1 / num2;
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Результат вычесления: " + num1 + " " + symbol + " " + num2 + " = " + result);
        }


    }
}
