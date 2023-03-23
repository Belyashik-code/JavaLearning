package Lesson_1;


public class Task_4{
    public static void main(String[] args) {

        int [] first = { 1, 2, 3, 4, 5, 6 };
        int [] second = { 1, 2, 3};
        difference(first, second);

    }

    static void difference(int [] a, int [] b) {
        for (int k : a) {
            int j;
            for (j = 0; j < b.length; j++) {
                if (k == b[j]) {
                    break;
                }
            }
            if (j == b.length) {
                System.out.print(k + " ");
            }
        }
    }
}