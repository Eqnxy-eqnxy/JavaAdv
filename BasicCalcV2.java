/**
 * Калькулятор и массив
 * @author Roman
 * @version 1.0
 */

import java.util.Scanner;

public class BasicCalcV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер для запуска программы: (1-калькулятор, 2-разбор массива)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите первое число:");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число:");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию: + / - / : / *");
            String op = scanner.next();

            double res1 = num1 + num2;
            double res2 = num1 - num2;
            double res3 = num1 / num2;
            double res4 = num1 * num2;


            switch (op) {
                case "+":
                    System.out.printf("Результат сложения двух чисел %f и %f равен %.4f", num1, num2, res1);
                    break;
                case "-":
                    System.out.printf("Результат вычитания двух чисел %f и %f равен %.4f", num1, num2, res2);
                    break;
                case ":":
                case "/":
                    System.out.printf("Результат деления двух чисел %f и %f равен %.4f", num1, num2, res3);
                    break;
                default:
                    System.out.printf("Результат умножения двух чисел %f и %f равен %.4f", num1, num2, res4);
                    break;
            }

        } else if (choice == 2) {
            System.out.println("Длинна масива: (укажите число)");
            int count = scanner.nextInt();
            String[] words = new String[count];

            System.out.println("Введите слова: ");
            for (int i = 0; i < count; i++) {
                words[i] = scanner.next();
            }
            int maxLength = 0;
            String maxWord = "";
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    maxWord = word;
                }
            }

            System.out.println("Самое длинное слово: " + maxWord);

        } else {

            System.out.println("Попробуйте еще раз!");
        }

    }


}
