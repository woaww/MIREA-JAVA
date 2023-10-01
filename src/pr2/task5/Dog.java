package pr2.task5;

import java.util.Scanner;
public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(){};
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString() {
        return "Кличка: " + name + "\nВозраст: " + age;
    }
    public void fillDog(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кличка: ");
        name = scanner.nextLine();
        System.out.print("Возраст: ");
        age = scanner.nextInt();
    }
    public int humanAge(){
        return age * 7;
    }
}
