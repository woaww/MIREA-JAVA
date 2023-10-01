package pr3.MathRandom.task4;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int[] generateRandArr(int n){
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(n + 1);
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] extractEvenNumbers(int[] arr){
        int cnt = 0;
        for (int num : arr){
            if (num % 2 == 0){
                cnt++;
            }
        }

        int[] evenArr = new int[cnt];
        if (cnt > 0){
            int index = 0;
            for (int num : arr){
                if (num % 2 == 0){
                    evenArr[index] = num;
                    index++;
                }
            }

        }
        else{
            System.out.println("Четных элементов в массиве нет :((");
        }
        return evenArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!sc.hasNextInt()) {
                System.out.print("Повторите попытку: ");
                sc.next();
            }
            n = sc.nextInt();
        }
        int[] randArr = generateRandArr(n);
        System.out.println("Сгенерированный массив: ");
        printArr(randArr);

        int[] evenArr = extractEvenNumbers(randArr);
        System.out.println("Массив из четных элементов исходного массива: ");
        printArr(evenArr);

    }
}
