package Lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ваше число: ");
        int x = sc.nextInt();
        System.out.println("Ваше число после преобразований: " + slice(x));
    }

    public static String slice(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return slice(n / 10) + " " + n % 10;
        }
    }
}