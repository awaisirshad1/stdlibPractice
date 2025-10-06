package java21.initalizationBlocks;

public class Car {
    int wheels;
    static int carCount;

    static {
        carCount = 10;
    }

    {
        wheels = 1;
    }

    public int getWheels(){
        return wheels;
    }

    public static int getCarCount(){
        return carCount;
    }
}
