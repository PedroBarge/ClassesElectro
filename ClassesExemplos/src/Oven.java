import java.util.Scanner;

public class Oven extends SmallElectro {

    private final int capacity;
    boolean builtIn;

    public Oven(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand, int capacity, boolean builtIn) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
        this.capacity = capacity;
        this.builtIn = builtIn;
    }

    //------------------------------------------------------------------//

    public void toRoast(int temperature) throws InterruptedException {
        if(!checkPower()) return;
        setTempNow(temperature);
        checkTemperature();
        setTimer(3);
        for (int i = getTimer(); i > 0; i--) {
            Thread.sleep(900);
            System.out.println("Food will be ready in "+i);
        }
        System.out.println("Beep! Cooked!");
        setTempNow(0);
        toClean();
        System.out.println("Waiting to turn off.");
        waitingToTurnOff();
    }

    public int getCapacity() {
        return capacity;
    }

    public void waitingToTurnOff() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Turn Off");
        System.out.println("2 - Cook again");

        switch (sc.next()) {
            case "1":
                turnOff();
                break;
            case "2":
                System.out.print("Temperature set: ");
                toRoast(inputScn.nextInt());
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void toClean() throws InterruptedException {
        if (getTempNow() == 0) {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(300);
                System.out.println("Cleaning..");
            }
        }
    }
}
