package Lesson_1;


import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int passengers = 0;
        int weight = 0;
        while (weight < 450 && passengers < 6) {
            if(w.hasNextInt()) {
                int nxt = w.nextInt();
                if ((weight + nxt) <= 450) {
                    weight += nxt;
                    passengers += 1;
                    System.out.println("В лифте: " + passengers + ".Свободного веса:" + (450 - weight) + ".");
                } else {
                    System.out.println("Данный пассажир не может войти в лифт! Превышен лимит общего веса");
                    break;
                }

            }
        }
        if (passengers == 6&&weight!=450) {
            System.out.println("Больше никто не может войти в лифт! Достигнут лимит количества человек");
        } else if (weight==450&&passengers!=6) {
            System.out.println("Больше никто не может войти в лифт! Достигнут лимит общего веса");
        } else if (passengers==6&&weight==450) {
            System.out.println("Больше никто не может войти в лифт! Достигнут лимит общего веса и количества человек");
        }
    }
}

