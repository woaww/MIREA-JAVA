package pr2.task4;

import java.util.Scanner;

public class Shop {
    int size;
    Computer[] katalog;

    public Shop(){};
    public void fillKatalog(int size){
        katalog = new Computer[size];
        for(int i = 0; i < size; i++){
            System.out.println("Компьютер №" + (i + 1));
            Computer computer = new Computer();
            computer.fillComputer();
            katalog[i] = computer;
        }

        System.out.println("Каталог заполнен :)");

        this.size = size;
    }
    public void showKatalog(){
        for (int i = 0; i < size; i++){
            System.out.println(katalog[i].showComputer());
        }
    }
    public void addComputer(){
        Computer[] newKatalog = new Computer[size + 1];
        for (int i = 0; i < size; i++){
            newKatalog[i] = katalog[i];
        }
        Computer newComputer = new Computer();
        newComputer.fillComputer();
        newKatalog[size] = newComputer;
        katalog = newKatalog;

        size++;
    }

    public Computer searchComputerByName(String name){
        for (int i = 0; i < katalog.length; i++){
            if (katalog[i].name.equals(name)){
                return katalog[i];
            }
        }
        System.out.println("Компьютера с таким названием нет :(");
        return null;
    }

    public void delComputerByName(String name){
        Computer[] newKatalog = new Computer[katalog.length - 1];
        for (int i = 0; i < size; i ++){
            if (katalog[i].name.equals(name)){
                for(int j = 0; j < i; i++){
                    newKatalog[j] = katalog[j];
                }
                for (int k = i; k < katalog.length - 1; k++){
                    newKatalog[k] = katalog[k + 1];
                }
            }
        }
        System.out.println("Компьютер удален - V");
        katalog = newKatalog;
        size--;
    }
}
