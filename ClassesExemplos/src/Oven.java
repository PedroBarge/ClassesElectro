public class Oven extends SmallElectro {

    private final int capacity;
    boolean builtIn;

    public Oven(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand, int capacity, boolean builtIn) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
        this.capacity = capacity;
        this.builtIn = builtIn;
    }

    //------------------------------------------------------------------//

    public void toRoast() {
        if(!checkPower()) return;
        System.out.print("Set temperature: ");
        setTempNow(inputScn.nextInt());
        overheat();
        if(!checkPower()) return;
        setTimer(3);
        for (int i = 0; i < getTimer(); i++) {
            System.out.println("Cooking...");
        }
        System.out.println("Beep! Cooked!");
        setTempNow(0);
        toClean();
        System.out.println("Waiting to turn off.");
    }

    public int getCapacity() {
        return capacity;
    }

    public void toClean() {
        if (getTempNow() == 0) {
            System.out.println("Cleaning mode activated.");
        }
    }

    public void showTemp() {
        getTempNow();
    }
}
