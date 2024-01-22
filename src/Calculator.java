package PracticeTasks.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int result = 0;
        System.out.println("Это примитивный калькулятор простых чисел!");
        System.out.println("Введите \"start\", чтобы использовать");

        Scanner scanner = new Scanner(System.in);

        String start = scanner.next();
        if(start.equals("start")) {
            System.out.println("Начинаем...");
            System.out.println();
        } else {
            return;
        }

        String a = """
                Выберите режим:
                    1. Действия с двумя числами
                    2. Действия с одним числом
                """;
        System.out.println(a);

        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.println("Выберите действие: ");
            String s = """
                Простые действия:
                    + - сложение
                    - - вычитание
                    * - умножение
                    / - деление
                Дополнительные действия:   
                    % - нахождение остатка от деления
                """;
            System.out.println(s);

            String doing = scanner.next();

            doingNUM: switch(doing) {
                case "+" :
                    System.out.println("Вы выбрали сложение.");
                    result = num1 + num2;
                    break doingNUM;
                case "-" :
                    System.out.println("Вы выбрали вычитание.");
                    result = num1 - num2;
                    break doingNUM;
                case "*" :
                    System.out.println("Вы выбрали умножение.");
                    result = num1 * num2;
                    break doingNUM;
                case "/" :
                    System.out.println("Вы выбрали деление.");
                    if(num2 == 0) {
                        System.out.println("На ноль делить нельзя!");
                        break doingNUM;
                    }
                    result = num1 / num2;
                    break doingNUM;
                case "%" :
                    System.out.println("Вы выбрали нахождение остатка от деления.");
                    result = num1 % num2;
                    break doingNUM;
                default :
                    System.out.println("Такого действия нет.");
            }
        } else if (choice == 2) {
            System.out.println("Раздел в разработке...");
            return;
        }

        System.out.println("Результат: " + result);
        System.out.println();
        System.out.println("Конец работы калькулятора.");
    }
}