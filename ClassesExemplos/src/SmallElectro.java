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
        System.out.println("Turning ON!!!");
        this.power = true;
    }

    public void turnOff() {
        System.out.println("Turning OFF!!!");
        this.power = false;
    }

    public void checkTemperature() {
        if (tempNow > tempMax) {
            System.out.println("Please set temperature again. Max is "+tempMax);
            System.out.print("Temperature set: ");
            setTempNow(inputScn.nextInt());
            System.out.println("Temperature is now "+tempNow);

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
