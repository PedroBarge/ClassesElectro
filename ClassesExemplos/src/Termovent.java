import java.util.Scanner;

public class Termovent extends SmallElectro {
    double temp;
    boolean onTheWall;
    int intensity;

    public Termovent(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
    }


    public void toHeat(int temperature) {
        if(!checkPower()) return;
        setTempNow(temperature);
        checkTemperature();
        System.out.println("Turned on with "+getTempNow()+"ºC");
        System.out.println("Waiting to turn off.");
        waitingToTurnOff();
    }

    public void toCool(int intensity) {
        setIntensity(intensity);
        System.out.println("Termovent is on "+getIntensity()+ " intensity.");
        System.out.println("Waiting to turn off.");
        waitingToTurnOff();
    }

    public void waitingToTurnOff() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - COOL");
        System.out.println("2 - HEAT");
        System.out.println("3 - Turn off");

        switch (sc.next()) {
            case "1":
                System.out.print("Set an intensity:\n 1 - WEAK \n 2 - MEDIUM \n 3 - STRONG\n");
                System.out.print("Select an option: ");
                toCool(sc.nextInt());
                break;
            case "2":
                System.out.print("Temperature set: ");
                toHeat(inputScn.nextInt());
                break;
            case "3":
                turnOff();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }


    public void showTemp() {
        getTempNow();
    }
}
