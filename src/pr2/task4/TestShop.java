package pr2.task4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();
        String name;

        int operation = -1;
        while(operation != 0){
            System.out.println("=============== М Е Н Ю ===============");
            System.out.println(" 1 - Вывести список всех компютеров");
            System.out.println(" 2 - Заполнить каталог");
            System.out.println(" 3 - Добавить компьютер");
            System.out.println(" 4 - Найти компьютер по назаванию");
            System.out.println(" 5 - Удалить компьютер по назаванию");
            System.out.println(" 0 - Выход из программы");
            System.out.println("---------------------------------------");
            System.out.print(" Ответ: ");
            operation = scanner.nextInt();
            System.out.println("---------------------------------------\n");

            switch(operation){
                case 1:
                    shop.showKatalog();
                    break;
                case 2:
                    System.out.println("Из скольки компьютеорв будет состоять каталог ?");
                    int size = scanner.nextInt();
                    shop.fillKatalog(size);
                    break;
                case 3:
                    shop.addComputer();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Введите название компьютера: ");
                    name = scanner.nextLine();
                    shop.searchComputerByName(name).showComputer();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Введите название компьютера: ");
                    name = scanner.nextLine();
                    shop.delComputerByName(name);
                    break;
            }
        }
    }
}
