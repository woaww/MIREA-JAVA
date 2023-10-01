package pr2.task1;

import pr2.task1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Author author = new Author();
        System.out.print("ФИО: ");
        String name = scanner.nextLine();
        author.setName(name);
        System.out.print("e-mail: ");
        String email = scanner.nextLine();
        author.setEmail(email);
        System.out.print("Пол: ");
        char gender = scanner.next().charAt(0);
        author.setGender(gender);

        System.out.println(author.toString());
    }
}
