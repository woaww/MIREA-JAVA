package pr1;

import java.util.Scanner;

public class Main{

    public static void task3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Из скольки элементов будет состоять массив ?");
        System.out.print("Ответ: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Последовательно введите " + size + " элементов массива: ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0 ; i < size; i++){
            sum += array[i];
        }

        double avarage = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + avarage);

    }

    public static void task4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Из скольки элементов будет состоять массив ?");
        System.out.print("Ответ: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Последовательно введите " + size + " элементов массива: ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while(i < size);

        int sumWhile = 0;
        i = 0;
        while (i < size){
            sumWhile += array[i];
            i++;
        }

        int max = array[0];
        int min = array[0];

        i = 1;
        while (i < size){
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
            i++;
        }

        System.out.println("Сумма элементов массива: " + sumDoWhile + "(Do-While), " + sumWhile + "(While) ");
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }

    public static void task5(String[] args){
        System.out.println("Аргументы командной строки: ");

        for (int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }

    public static void task6(){
        System.out.println("Первые 10 чисел гармонического ряда: ");

        double el = 0.0;
        for (int i = 1; i < 11; i ++){
            el += 1.0 / i;
            System.out.printf("%.3f; ", el);
        }
        System.out.println();
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int fact = fact(num);
        System.out.println("Факториал числа " + num + " = " + fact);
    }

    public static int fact(int num) {
        if (num < 0){
            System.out.println("??? (Вы ввели отрицательное число :(  )");
        }
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taskNum;
        do {
            System.out.println("====================М Е Н Ю ====================");
            System.out.println("             ПРАКТИЧЕСКАЯ РАБОТА №1");
            System.out.println("Выберите номер задания (3 - 7)");
            System.out.println("0 - Выход из программы");
            System.out.println("------------------------------------------------");
            System.out.print("Ответ: ");
            taskNum = scanner.nextInt();
            System.out.println("================================================");

            switch (taskNum) {
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5(args);
                    break;
                case 6:
                    task6();
                case 7:
                    task7();
                default:
                    break;
            }
        } while(taskNum != 0);
    }
}
