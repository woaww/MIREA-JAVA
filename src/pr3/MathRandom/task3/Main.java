package pr3.MathRandom.task3;

import java.util.Random;

public class Main {
    public static int[] generateRandArrFrom10To99(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(99 - 10 + 1) + 10;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static boolean isIncreasing(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] randArr = generateRandArrFrom10To99(4);

        System.out.println("Сгенерированный массив: ");
        printArr(randArr);

        if(isIncreasing(randArr)) {
            System.out.println("Массив является строго возрастающей последовательностью :))");
        }
        else{
            System.out.println("Массив не является строго возрастающей последовательностью :((");
        }
    }
}
