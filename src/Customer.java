import java.util.ArrayList;

public class Customer {
    private String cpf;
    private String name;

    private ArrayList<Car> cars = new ArrayList<>();

    public Customer(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
