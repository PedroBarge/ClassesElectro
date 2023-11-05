import java.util.Scanner;

public class Main {

    static Scanner inputScn = new Scanner(System.in);
    private static Termovent termovent;

    public static void main(String[] args) throws InterruptedException {

        Termovent termovent;
        menuStar();


        String choiceUser = inputScn.next();

        switch (choiceUser) {
            case "1":
                optOven();
                break;
            case "2":
                optTermovent();
                break;
            case "3":
                optToaster();
                break;
            case "0":
                System.out.println("Closing...");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

        public static void menuStar () {
        System.out.println("\033[0;31m" + " 💡 Welcome to MediaMarkt Test@Mindera 💡 " + "\u001b[0m\n");
        System.out.println("\033[0;97m"+"1-" + " Oven");
        System.out.println("\033[0;97m"+"2-" + " Termovent");
        System.out.println("\033[0;97m"+"3-" + " Toaster");
        System.out.println("0-" + " Exit" + "\u001b[0m\n");
        System.out.print("\033[0;31m" + "-> " + "\u001b[0m\n");
    }


    public static void optOven() throws InterruptedException {
        System.out.println("\033[0;97m" +  "New Oven"+ "\u001b[0m\n");
        System.out.println("\033[0;97m" +"Please insert the features: "+ "\u001b[0m\n");

        System.out.print("\033[1;36m" + "Brand: "+ "\u001b[0m\n");
        String ovenName = inputScn.next();

        System.out.print("\033[1;36m" +"Capacity: "+ "\u001b[0m\n");
        int ovenCap = inputScn.nextInt();

        System.out.print("\033[1;36m" +"Material: "+ "\u001b[0m\n");
        String ovenMat = inputScn.next();

        System.out.print("\033[1;36m" +"Color: "+ "\u001b[0m\n");
        String ovenColor = inputScn.next();

        System.out.print("\033[1;36m" +"Is built In (Yes or No): "+ "\u001b[0m\n");
        String ovenBuiltIn = inputScn.next().toLowerCase();
        boolean ovenBuiltInBool;
        if (ovenBuiltIn.equals("\033[1;36m" +"yes"+ "\u001b[0m\n")) {
            ovenBuiltInBool = true;
        } else ovenBuiltInBool = false;

        System.out.print("\033[1;36m" +"Weight: "+ "\u001b[0m\n");
        int ovenWeight = inputScn.nextInt();

        System.out.print("\033[1;36m" +"Temperature Max: "+ "\u001b[0m\n");
        int ovenTempMax = inputScn.nextInt();

        Oven oven = new Oven(0, ovenTempMax, 0, ovenWeight, ovenColor, ovenMat, ovenName, ovenCap, ovenBuiltInBool);

        System.out.println("\033[1;97m" +"You want to turn on? (y/n)"+ "\u001b[0m\n");
        switch(inputScn.next()) {
            case "y":
                oven.turnOn();
                System.out.print("\033[1;36m" + "Temperature set: "+ "\u001b[0m\n");
                oven.toRoast(inputScn.nextInt());
                break;
            case "n":
                menuStar();
                break;
        }
    }

    public static void optTermovent() {

        System.out.println("\033[0;97m" +"New Termovent"+ "\u001b[0m\n");
        System.out.println("\033[0;97m" +"Please insert the features: ");

        System.out.print("\033[1;36m" +"Brand: "+ "\u001b[0m\n");
        String termoName = inputScn.next();

        System.out.print("\033[1;36m" +"Material: "+ "\u001b[0m\n");
        String termoMat = inputScn.next();

        System.out.print("\033[1;36m" +"Color: "+ "\u001b[0m\n");
        String termoColor = inputScn.next();

        System.out.print("\033[1;36m" +"Weight: "+ "\u001b[0m\n");
        int termoWeight = inputScn.nextInt();

        System.out.print("\033[1;36m" +"Temperature Max: "+ "\u001b[0m\n");
        int termoTempMax = inputScn.nextInt();


        termovent = new Termovent(0, termoTempMax, 0, termoWeight, termoColor, termoMat, termoName);

        System.out.println("\033[1;36m" +"You want to turn on? (y/n)"+ "\u001b[0m\n");
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

        System.out.println("\033[0;31m" + "1 - HEAT"+ "\u001b[0m" + " 🔥");
        System.out.println("\033[0;34m" + "2 - COOL"+ "\u001b[0m" + " ❄️");

        switch(inputScn.next()) {
            case "1":
                System.out.print("\033[1;36m" +"Temperature set: "+ "\u001b[0m\n");
                termovent.toHeat(inputScn.nextInt());
                break;
            case "2":
                System.out.print("\033[1;36m" +"Set an intensity:\n 1 - WEAK \n 2 - MEDIUM \n 3 - STRONG"+ "\u001b[0m\n");
                termovent.toCool(inputScn.nextInt());
        }
    }

    public static void optToaster() throws InterruptedException {
        System.out.println("\033[0;97m" +"New Termovent"+ "\u001b[0m\n");
        System.out.println("\033[0;97m" +"Please insert the features: "+ "\u001b[0m\n");

        System.out.print("\033[1;36m" +"Brand: "+ "\u001b[0m\n");
        String toastName = inputScn.next();

        System.out.print("\033[1;36m" +"Material: "+ "\u001b[0m\n");
        String toastMat = inputScn.next();

        System.out.print("\033[1;36m" +"Color: "+ "\u001b[0m\n");
        String toastColor = inputScn.next();

        System.out.print("\033[1;36m" +"Weight: "+ "\u001b[0m\n");
        int toastWeight = inputScn.nextInt();


        Toaster toaster = new Toaster(0,0, 0, toastWeight, toastColor, toastMat, toastName);

        System.out.println("\033[1;36m" +"You want to turn on? (y/n)"+ "\u001b[0m\n");
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