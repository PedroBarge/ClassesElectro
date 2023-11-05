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
        System.out.println("\033[0;32m" + "Turned on with "+getTempNow()+"ºC"+ "\u001b[0m\n");
        System.out.println("\033[0;31m" +"Waiting to turn off."+ "\u001b[0m\n");
        waitingToTurnOff();
    }

    public void toCool(int intensity) {
        setIntensity(intensity);
        System.out.println("\033[1;36m" +"Termovent is on "+getIntensity()+ " intensity."+ "\u001b[0m\n");
        System.out.println("\033[0;31m" +"Waiting to turn off."+ "\u001b[0m\n");
        waitingToTurnOff();
    }

    public void waitingToTurnOff() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[0;34m" +"1 - COOL"+ "\u001b[0m" + " ❄️");
        System.out.println("\033[0;31m" +"2 - HEAT"+ "\u001b[0m" + " 🔥");
        System.out.println("\033[0;31m" +"3 - Turn off"+ "\u001b[0m\n");

        switch (sc.next()) {
            case "1":
                System.out.print("\033[0;32m" +"Set an intensity:\n 1 - WEAK \n 2 - MEDIUM \n 3 - STRONG\n");
                System.out.print("\033[1;36m" +"Select an option: "+ "\u001b[0m\n");
                toCool(sc.nextInt());
                break;
            case "2":
                System.out.print("\033[1;36m" +"Temperature set: "+ "\u001b[0m\n");
                toHeat(inputScn.nextInt());
                break;
            case "3":
                turnOff();
                break;
            default:
                System.out.println("\033[0;31m" +"Invalid option."+ "\u001b[0m\n");
        }
    }


    public void showTemp() {
        getTempNow();
    }
}
