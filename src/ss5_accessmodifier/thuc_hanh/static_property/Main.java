package ss5_accessmodifier.thuc_hanh.static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("lamboghini","V12");
        System.out.println("Car "+Car.numberOfCars);
        System.out.println(car1.getName()+" "+car1.getEngine());
        Car car2 = new Car("ferrari","V10");
        System.out.println("Car "+Car.numberOfCars);
        System.out.println(car2.getName()+" "+car2.getEngine());
    }
}
