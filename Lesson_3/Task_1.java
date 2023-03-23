package Lesson_3;


public class Task_1 {
    public static void main(String args[]) {
        Audi.Vruum();
        Audi A4 = new Audi(3, 100, 4);
        A4.setVolume(2);
        A4.applyBrake(5);
        Volvo.Signal(5);
        Volvo S60 = new Volvo(4, 100, 45505);
        System.out.println(Audi.ncap_stars);
        System.out.println(Volvo.ncap_stars);
        System.out.println(A4);
        System.out.println(S60);
    }
}
