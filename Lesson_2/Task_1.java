package Lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите центр по Х");
        int center_x = sc.nextInt();
        System.out.print("Введите центр по Y");
        int center_y = sc.nextInt();
        System.out.print("Введите радиус");
        int r = sc.nextInt();
        System.out.print("Введите координату точки по Х");
        int x = sc.nextInt();
        System.out.print("Введите координату точки по Y");
        int y = sc.nextInt();

        System.out.print(inTheCircle (center_x,center_y,x,y,r));
    }

    public static boolean inTheCircle(int center_x, int center_y, int x, int y, int r ) {
        return ((x - center_x) * (x - center_x) + (y - center_y) * (y - center_y)) <= r * r;
    }
}