package Lesson_5;

import java.util.Scanner;

public class Task_3 {
    @FunctionalInterface
    public interface Disc {
        double calculate(double a,double b, double c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_a = sc.nextInt();
        int input_b = sc.nextInt();
        int input_c = sc.nextInt();
        Disc eq;
        eq = (double a, double b, double c) -> {
            double d = b * b - 4 * a * c;
            return d;
        };
        System.out.println(eq.calculate(input_a,input_b,input_c));
    }

}
