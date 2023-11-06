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
            System.out.println("\033[0;33m" + "Food will be ready in "+i + "\u001b[0m" );
        }
        System.out.println("\033[0;33m" + "Beep! Cooked!" + "\u001b[0m");
        setTempNow(0);
        toClean();
        System.out.println("\033[0;31m" +"Waiting to turn off." + "\u001b[0m\n" );
        waitingToTurnOff();
    }

    public void waitingToTurnOff() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[0;31m" +"1 - Turn Off"+ "\u001b[0m\n");
        System.out.println("\033[0;33m" + "2 - Cook again"+ "\u001b[0m\n");

        switch (sc.next()) {
            case "1":
                turnOff();
                break;
            case "2":
                System.out.print("\033[1;36m" +"Temperature set: "+ "\u001b[0m\n");
                toRoast(inputScn.nextInt());
                break;
            default:
                System.out.println("\033[0;31m" +"Invalid option."+ "\u001b[0m\n");
        }
    }

    public void toClean() throws InterruptedException {
        if (getTempNow() == 0) {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(300);
                System.out.println("\033[0;33m" +"Cleaning.."+ "\u001b[0m");
            }
        }
    }
}
