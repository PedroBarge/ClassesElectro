import java.util.Scanner;

public class Main {
    static Scanner inputScn = new Scanner(System.in);
    private static Termovent termovent;

    public static void main(String[] args) throws InterruptedException {
        Termovent termovent;
        menuStar();
        int choiceUser = inputScn.nextInt();

        switch (choiceUser) {
            case 1:
                optOven();
                break;
            case 2:
                optTermovent();
                break;
            case 3:
                optToaster();
                break;
            case 0:
                System.out.println("Closing...");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static void menuStar() {
        System.out.println("Welcome");
        System.out.println("1- Oven");
        System.out.println("2- Termovent");
        System.out.println("3- Toaster");
        System.out.println("0- Exit");
        System.out.print("-> ");
    }

    public static void optOven() throws InterruptedException {
        System.out.println("New Oven");
        System.out.println("Please insert the features: ");

        System.out.print("Brand: ");
        String ovenName = inputScn.next();

        System.out.print("Capacity: ");
        int ovenCap = inputScn.nextInt();

        System.out.print("Material: ");
        String ovenMat = inputScn.next();

        System.out.print("Color: ");
        String ovenColor = inputScn.next();

        System.out.print("Is built In (Yes or No): ");
        String ovenBuiltIn = inputScn.next().toLowerCase();
        boolean ovenBuiltInBool;
        if (ovenBuiltIn.equals("yes")) {
            ovenBuiltInBool = true;
        } else ovenBuiltInBool = false;

        System.out.print("Weight: ");
        int ovenWeight = inputScn.nextInt();

        System.out.print("Temperature Max: ");
        int ovenTempMax = inputScn.nextInt();

        Oven oven = new Oven(0, ovenTempMax, 0, ovenWeight, ovenColor, ovenMat, ovenName, ovenCap, ovenBuiltInBool);

        System.out.println("You want to turn on? (y/n)");
        switch(inputScn.next()) {
            case "y":
                oven.turnOn();
                System.out.print("Temperature set: ");
                oven.toRoast(inputScn.nextInt());
                break;
            case "n":
                menuStar();
                break;
        }
    }

    public static void optTermovent() {

        System.out.println("New Termovent");
        System.out.println("Please insert the features: ");

        System.out.print("Brand: ");
        String termoName = inputScn.next();

        System.out.print("Material: ");
        String termoMat = inputScn.next();

        System.out.print("Color: ");
        String termoColor = inputScn.next();

        System.out.print("Weight: ");
        int termoWeight = inputScn.nextInt();

        System.out.print("Temperature Max: ");
        int termoTempMax = inputScn.nextInt();


        termovent = new Termovent(0, termoTempMax, 0, termoWeight, termoColor, termoMat, termoName);

        System.out.println("You want to turn on? (y/n)");
        switch(inputScn.next()) {
            case "y":
                termovent.turnOn();
                choiceTermoVent();
                break;
            case "n":
                menuStar();
                break;
        }
    }

    public static void choiceTermoVent() {

        System.out.println("1 - HEAT");
        System.out.println("2 - COOL");

        switch(inputScn.next()) {
            case "1":
                System.out.print("Temperature set: ");
                termovent.toHeat(inputScn.nextInt());
                break;
            case "2":
                System.out.print("Set an intensity:\n 1 - WEAK \n 2 - MEDIUM \n 3 - STRONG");
                termovent.toCool(inputScn.nextInt());
        }
    }

    public static void optToaster() throws InterruptedException {
        System.out.println("New Termovent");
        System.out.println("Please insert the features: ");

        System.out.print("Brand: ");
        String toastName = inputScn.next();

        System.out.print("Material: ");
        String toastMat = inputScn.next();

        System.out.print("Color: ");
        String toastColor = inputScn.next();

        System.out.print("Weight: ");
        int toastWeight = inputScn.nextInt();


        Toaster toaster = new Toaster(0,0, 0, toastWeight, toastColor, toastMat, toastName);

        System.out.println("You want to turn on? (y/n)");
        switch(inputScn.next()) {
            case "y":
                toaster.turnOn();
                toaster.toToast();
                break;
            case "n":
                menuStar();
                break;
        }
    }
}