package pr3.MathRandom.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double[] generateArrayByMathRandom(int size){
        double[] arr = new double[size];
        for (int i = 0; i < size; i++){
            arr[i] = Math.random();
        }
        return arr;
    }

    public static double[] generateArrayByRandomClass(int size){
        double[] arr = new double[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    public static void printArr(double[] arr){
        for (double num : arr){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = sc.nextInt();

        double[] ArrMathRandom = generateArrayByMathRandom(size);
        double[] ArrRandomClass = generateArrayByRandomClass(size);

        System.out.println("Массив, созданный с использованием метода random() класса Math: ");
        printArr(ArrMathRandom);
        Arrays.sort(ArrMathRandom);
        System.out.println("Отсортированный массив: ");
        printArr(ArrMathRandom);
        System.out.println("==================================================================");
        System.out.println("Массив, созданный с использованием класса Random: ");
        printArr(ArrRandomClass);
        Arrays.sort(ArrRandomClass);
        System.out.println("Отсортированный массив: ");
        printArr(ArrRandomClass);
    }
}
