package initalizationBlocks;

public class InitBlocks {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car wheels: "+car.getWheels()+", count: "+Car.getCarCount());
    }
}
