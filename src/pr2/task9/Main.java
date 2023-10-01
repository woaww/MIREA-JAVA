package pr2.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    public static List<String> Deck(){
        List<String> deck = new ArrayList<>();

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] masti = {"\u2665", "\u2666", "\u2663", "\u2660"};

        for(String mast : masti){
            for (String rank : ranks){
                deck.add(rank + mast);
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<String> deck){
        Collections.shuffle(deck);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int playersNum;
        System.out.print("Введите количество игроков: ");
        playersNum = scanner.nextInt();

        List<String> deck = Deck();
        shuffleDeck(deck);

        for(int i = 0; i < playersNum; i++){
            System.out.println("Карты игрока №" + (i + 1) + ": ");
            for (int j = 0; j < 5; j++){
                String card = deck.get((i * 5) + j);
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }
}
