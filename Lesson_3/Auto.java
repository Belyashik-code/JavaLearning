package Lesson_3;

interface Fast {
    public void TurnSpoilerOn();
}

interface TurnOnESP {
    public void Start_ESP();
}
public abstract class Auto<T>{
    public int doors;
    public int speed;
    private T number;

    public abstract void start();

    public Auto(T number, int doors, int speed) {
        this.number = number;
        this.doors = doors;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("There are " + doors + " doors" + "\n" + "Speed of auto is " + speed);
    }
}

class Audi extends Auto implements Fast {

    public int engineVolume;

    public static int ncap_stars = 4;

    public Audi(int doors, int speed, int startVolume) {
        super("bg777bg", doors, speed);
        engineVolume = startVolume;
    }

    public void start() {
        System.out.print("Машина заведена");
    }

    public void setVolume(int newValue) {
        engineVolume = newValue;
    }

    public static void Vruum() {
        System.out.println("Vroooooom!!!");
    }

    public void TurnSpoilerOn() {
        System.out.println("Spoiler turned on!");
    }

    @Override
    public String toString() {
        return (super.toString() + "\nEngine volume is "
                + engineVolume);
    }
}

class Volvo extends Auto implements TurnOnESP{
    public int kilometrazh_sum;
    public static int ncap_stars = 5;


    public Volvo (int doors, int speed, int kilometrazh) {
        super("bg456bg", doors, speed);
        kilometrazh_sum = kilometrazh;
    }

    public static void Signal(int times) {
        for (int i = 0; i < times; i++) {
            String existing_string= "BeepBe";
            for(int n = 0; n < i; n++) {
                existing_string += 'e';
            }
            System.out.println(existing_string+"p");
        }
    }
    public void Start_ESP() {
        System.out.println("ESP is working now!");
    }
    public void Stop_Engine() {
        System.out.print("Машина заглушена");
    }

    @Override
    public void start() {
        System.out.print("Машина заведена");
    }

    @Override
    public String toString() {
        return (super.toString() + "\nStripes number on car is " + kilometrazh_sum);
    }
}