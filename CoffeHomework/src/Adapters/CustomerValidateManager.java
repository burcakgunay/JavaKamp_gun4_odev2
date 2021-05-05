package Adapters;

import Abstracts.CustomerValidationService;
import Entities.Customer;

public class CustomerValidateManager implements CustomerValidationService {

    @Override
    public boolean isRealCustomer(Customer customer) {
        return false;
    }
}