import java.util.ArrayList;

public class Customer {
    String cpf;
    String name;

    public ArrayList<Car> cars = new ArrayList<>();

    public Customer(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void getCpf() {
        System.out.println(cpf);
    }

    public void getName() {
        System.out.println(name);
    }
}
