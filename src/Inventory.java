import java.util.ArrayList;

public class Inventory {
    static ArrayList<Car> inventory = new ArrayList<>();

    public void addCarInventory(Car car) {
        inventory.add(car);
        System.out.println("Car added to inventory.\n");
    }

    public void removeCarInventory(Car car) {
        inventory.remove(car);
        System.out.println("Car removed from inventory.\n");
    }

    public void showInventory(ArrayList<Car> inventory) {
        System.out.println("[  Current inventory  ]\n");
        System.out.printf("%-11s %-15s %-5s %10s\n", "Make", "Model", "Year", "Price (R$)");
        System.out.printf("%-11s %-15s %-5s %10s\n", "", "", "", "");
        for(Car car : inventory) {
            // System.out.println(car.make + " " + car.model + " " +  car.year + " Price: R$ " + " " + car.price);
            System.out.printf("%-11s %-15s %-5d %10.2f\n", car.make, car.model, car.year, car.price);
        }
        System.out.println();
    }
}
