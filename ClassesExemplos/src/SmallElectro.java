import java.util.Scanner;

public class SmallElectro {
    private int timer;
    private int tempMax;
    private int tempNow;
    private int intensity;
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

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getIntensity() {
        if(intensity == 1) {
            return "WEAK";
        } else if(intensity == 2) {
            return "MEDIUM";
        } else if(intensity == 3) {
            return "STRONG";
        }
        return null;
    }

    public int getTempNow() {
        return tempNow;
    }

    public void setTempNow(int tempNow) {
        this.tempNow = tempNow;
    }

    //------------------------------------------------------------------//
    public void turnOn() {
        System.out.println("\033[0;32m" +"Turning ON!!!"+ "\u001b[0m\n");
        this.power = true;
    }

    public void turnOff() {
        System.out.println("\033[0;31m" +"Turning OFF!!!"+ "\u001b[0m\n");
        this.power = false;
    }

    public void checkTemperature() {
        if (tempNow > tempMax) {
            System.out.println("\033[1;36m" +"Please set temperature again. Max is "+tempMax+ "\u001b[0m\n");
            System.out.print("\033[1;36m" +"Temperature set: "+ "\u001b[0m\n");
            setTempNow(inputScn.nextInt());
            System.out.println("\033[1;36m" +"Temperature is now "+tempNow+ "\u001b[0m\n");

            if(tempNow > tempMax) {
                checkTemperature();
            }
        }
    }

    public int getTempMax() {
        return tempMax;
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
