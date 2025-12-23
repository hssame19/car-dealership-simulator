import java.util.ArrayList;

public class Store {

    private ArrayList<Customer> customers = new ArrayList<>();

    private ArrayList<Sale> sales = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void newSale(Sale sale) {
        sales.add(sale);
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
