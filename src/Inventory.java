import java.util.ArrayList;

public class Inventory {
    private static ArrayList<Car> inventory = new ArrayList<>();

    public void addCarInventory(Car car) {
        inventory.add(car);
    }

    public void removeCarInventory(Car car) {
        inventory.remove(car);
    }

    public void showInventory(ArrayList<Car> inventory) {
        System.out.println("[  Current inventory  ]\n");
        System.out.printf("%-11s %-15s %-5s %10s\n", "Make", "Model", "Year", "Price (R$)");
        System.out.printf("%-11s %-15s %-5s %10s\n", "", "", "", "");
        for(Car car : inventory) {
            System.out.printf("%-11s %-15s %-5d %10.2f\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
        }
        System.out.println();
    }

    public static ArrayList<Car> getInventory() {
        return inventory;
    }
}
