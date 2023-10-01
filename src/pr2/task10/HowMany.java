package pr2.task10;

import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сроку: ");
        String string = scanner.nextLine();

        String[] words = string.split("\\s+");

        int cnt = words.length;

        System.out.println("В строке содержится " + cnt +  " слов(а) :))");
    }

}
