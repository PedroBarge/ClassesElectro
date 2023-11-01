import java.util.Scanner;

public class Main {
    static Scanner inputScn = new Scanner(System.in);

    public static void main(String[] args) {
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

    public static void optOven() {
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

        System.out.print("Set timer: ");
        int ovenTimer = inputScn.nextInt();

        System.out.print("Set temperature now: ");
        int ovenTempNow = inputScn.nextInt();

        Oven oven = new Oven(ovenTimer, ovenTempMax, ovenTempNow, ovenWeight, ovenColor, ovenMat, ovenName, ovenCap, ovenBuiltInBool);
        oven.turnOn();
        oven.toRoast();
        oven.toClean();

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

        System.out.print("Set timer: ");
        int termoTimer = inputScn.nextInt();

        System.out.print("Set temperature now: ");
        int termoTempNow = inputScn.nextInt();

        Termovent termovent = new Termovent(termoTimer, termoTempMax, termoTempNow, termoWeight, termoColor, termoMat, termoName);
        termovent.toHeat();
        termovent.toCool();
    }

    public static void optToaster() {
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

        System.out.print("Temperature Max: ");
        int toastTempMax = inputScn.nextInt();

        System.out.print("Set timer: ");
        int toastTimer = inputScn.nextInt();

        System.out.print("Set temperature now: ");
        int toastTempNow = inputScn.nextInt();

        Toaster toaster = new Toaster(toastTimer, toastTempMax, toastTempNow, toastWeight, toastColor, toastMat, toastName);
        toaster.toToast();
    }
}