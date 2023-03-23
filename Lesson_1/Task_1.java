package Lesson_1;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[3];
        int a = n;
        for(int i=0;i<3;i=i+1){
            arr[i]=n%10;
            n=n/10;
        }
        if (a > 500) {
            System.out.println("Result:" + arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println("Result:" + arr[2] + arr[0] + arr[1]);
        }
    }
}