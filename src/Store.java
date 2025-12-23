import java.util.ArrayList;

public class Store {

    ArrayList<Customer> customers = new ArrayList<>();

    ArrayList<Sale> sales = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added to database.\n");
    }

    public void newSale(Sale sale) {
        sales.add(sale);
        System.out.println("Sale added.\n");
    }
}
