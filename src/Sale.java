import java.util.Date;

public class Sale {
    private String buyersName;
    private String buyersCpf;

    private Car car;

    private Date date;

    public Sale(String buyersName, String buyersCpf, Car car, Date date) {
        this.buyersName = buyersName;
        this.buyersCpf = buyersCpf;
        this.car = car;
        this.date = date;
    }

    public String getBuyersName() {
        return buyersName;
    }

    public String getBuyersCpf() {
        return buyersCpf;
    }

    public Car getSaleCar() {
        return car;
    }

    public Date getDate() {
        return date;
    }
}
