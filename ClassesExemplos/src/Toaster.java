import java.util.Scanner;

public class Toaster extends SmallElectro {

    public Toaster(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
    }

    public void toToast() throws InterruptedException {
        System.out.println("Select the timer! 1 to 5");
        int timer = inputScn.nextInt();

        if(!checkPower()) return;
        if(timer > 5) {
            System.out.println("Invalid timer. Select 1 to 5.");
            toToast();
        }

        setTimer(timer);
        for (int i = getTimer(); i > 0; i--) {
            Thread.sleep(900);
            System.out.println("Bread is toasted in " + i);
        }
            System.out.println("Beep! Toasted!");
            Thread.sleep(1000);
            System.out.println("Tling tling tling, Jarvas clean the toaster!");
            System.out.println("Waiting to turn off.");
            waitingToTurnOff();
        }

    public void waitingToTurnOff() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Turn Off");
        System.out.println("2 - Toast again");

        switch (sc.next()) {
            case "1":
                turnOff();
                break;
            case "2":
                toToast();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

}
