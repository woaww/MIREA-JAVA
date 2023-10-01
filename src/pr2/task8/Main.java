package pr2.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int n;
        System.out.println("Из скольки элементов(слов) будет состоять массив ?");
        n = scanner.nextInt();
        String[] array = new String[n];

        scanner.nextLine();

        System.out.println("Последовательно введите элементы массива: ");

        for(int i = 0; i < n; i++){
            array[i] = scanner.nextLine();
        }

        System.out.println("Исходный массив: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < n / 2; i++){
            String tempStr = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = tempStr;
        }

        System.out.println("\n\nНовый массив: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
