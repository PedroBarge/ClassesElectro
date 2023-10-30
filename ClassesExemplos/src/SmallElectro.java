import java.util.Scanner;

public class SmallElectro {
    private int timer;
    private int tempMax;
    private int tempNow;
    private int weigth;
    private String color;
    private String material;
    private String brand;
    private boolean power;
    //------------------------------------------------------------------//
    Scanner inputScn;

    public SmallElectro(int timer, int tempMax, int tempNow, int weigth, String color, String material, String brand) {
        this.timer = timer;
        this.tempMax = tempMax;
        this.tempNow = tempNow;
        this.weigth = weigth;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.power = false;
        inputScn = new Scanner(System.in);
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public int getTempMax() {
        return tempMax;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTempNow() {
        return tempNow;
    }

    public void setTempNow(int tempNow) {
        this.tempNow = tempNow;
    }

    //------------------------------------------------------------------//
    public void turnOn() {
        System.out.println("Turning ON!!!");
        this.power = true;
    }

    public void turnOff() {
        System.out.println("Turning OFF!!!");
        this.power = false;
    }

    public void overheat() {
        if (tempNow > tempMax) {
            System.out.println("AI AI !!BOOOOOMMMMM!!!!");
            turnOff();
        }
    }

    public void timerOn() {
        System.out.println("W");
    }

    public void timerOff() {
        System.out.println("F");
    }

    public boolean checkPower() {
        return power;
    }
}
