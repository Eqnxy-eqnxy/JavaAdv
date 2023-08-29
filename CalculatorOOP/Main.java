package CalculatorOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Выберите действие: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Деление");
        System.out.println("4. Умножение");
        int move = scanner.nextInt();

        Calculator calculator = new Calculator(num1, num2);

        try {
            if (move == 1) System.out.println("Сложение = " + calculator.add(num1, num2));
            else if (move == 2) System.out.println("Вычитание = " + calculator.sub(num1, num2));
            else if (move == 3) System.out.println("Деление = " + calculator.div(num1, num2));
            else if (move == 4) System.out.println("Умножение = " + calculator.mult(num1, num2));
            else System.out.println("Введено неверное действие! Попробуй снова");
        } catch (ArithmeticException e) {
            e.getStackTrace();
        }

    }

}
