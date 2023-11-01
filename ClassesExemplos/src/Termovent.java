public class Termovent extends SmallElectro {
    double temp;
    boolean onTheWall;
    int airForce;

    public Termovent(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand) {
        super(timer, tempMax, tempNow, weigth, color, material, brand);
    }


    public void toHeat() {
        System.out.println("Heating..");
    }

    public void toCool() {
        System.out.println("Cooling...");
    }

    public void showTemp() {
        getTempNow();
    }
}
