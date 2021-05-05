import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Burçak Zeliha","GÜNAY",2000,"12345678912");
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(customer);
        StarbucksCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucks.save(customer);
        starbucks.coffeeOrder(customer);
        starbucks.coffeeOrder(customer);
        starbucks.coffeeOrder(customer);

    }
}