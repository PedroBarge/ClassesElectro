import java.util.Scanner;

public class Toaster extends SmallElectro {

    public Toaster(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
    }

    public void toToast() throws InterruptedException {
        System.out.println("\033[1;36m" +"Select the timer! 1 to 5"+ "\u001b[0m" + " 🕑");
        int timer = inputScn.nextInt();

        if(!checkPower()) return;
        if(timer > 5) {
            System.out.println("\033[0;31m" +"Invalid timer. Select 1 to 5."+ "\u001b[0m"+ " 🕑");
            toToast();
        }

        setTimer(timer);
        for (int i = getTimer(); i > 0; i--) {
            Thread.sleep(900);
            System.out.println("\033[0;33m" +"Bread is toasted in " + i+ "\u001b[0m");
        }
        System.out.println("\033[0;33m" +"Beep! Beep! Toasted!"+ "\u001b[0m");
        Thread.sleep(1000);
        System.out.println("\033[0;33m" +"Tling tling tling, Jarvas clean the toaster!"+ "\u001b[0m\n");
        System.out.println("\033[0;31m" +"Waiting to turn off."+ "\u001b[0m\n");
        waitingToTurnOff();
    }

    public void waitingToTurnOff() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[0;31m" +"1 - Turn Off "+ "\u001b[0m");
        System.out.println("\033[0;33m" +"2 - Toast again "+ "\u001b[0m");

        switch (sc.next()) {
            case "1":
                turnOff();
                break;
            case "2":
                toToast();
                break;
            default:
                System.out.println("\033[0;31m" +"Invalid option."+ "\u001b[0m\n");
        }
    }

}
