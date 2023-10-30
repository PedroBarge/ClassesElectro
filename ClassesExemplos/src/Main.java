public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven(60,350,0,40,"White","Aluminium","Teka", 70, true);
        oven.turnOn();
        oven.toRoast();
    }
}