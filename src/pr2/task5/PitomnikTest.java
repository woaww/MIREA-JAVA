package pr2.task5;

import java.util.Scanner;

public class PitomnikTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PitomnikSobak pitomnik = new PitomnikSobak();

        int operation = -1;
        while (operation != 0){
            System.out.println("================ М Е Н Ю ================");
            System.out.println(" 1 - Заполнить питомник");
            System.out.println(" 2 - Добавить собаку");
            System.out.println(" 3 - Вывести списко собак");
            System.out.println("-----------------------------------------");
            System.out.print(" Ответ: ");
            operation = scanner.nextInt();
            System.out.println("=========================================");

            switch(operation){
                case 1:
                    System.out.print("Сколько собак в питомнике ?\nОтвет: ");
                    int size = scanner.nextInt();
                    pitomnik.fillPitomnik(size);
                    break;
                case 2:
                    pitomnik.addDog();
                    break;
                case 3:
                    pitomnik.showPitomnik();
                    break;
            }
        }
    }
}
