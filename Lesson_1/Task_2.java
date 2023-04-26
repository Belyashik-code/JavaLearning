package Lesson_1;

public class Task_2 {
    public static void main(String[] args) {
        int[] array;
        array = new int[50];
        int a=0;
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 0 && Sum(i) % 10 == 0) {
                //System.out.println("Число" + i);
                array[a] = i;
                a++;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(array[i]);
        }
    }

    public static int Sum (int d) {
        int sum = 0;
        for(int i = 1; i <= d; i++) {
            if (d % i == 0 && i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
