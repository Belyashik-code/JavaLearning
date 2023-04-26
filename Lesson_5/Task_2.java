package Lesson_5;

import java.util.Scanner;

public class Task_2 {
    @FunctionalInterface
    public interface BooleanInterface {
        boolean calculate(int num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        BooleanInterface r = num -> num % 13 == 0;
        boolean result = r.calculate(input);
        System.out.println(result);
    }

}
