package SimiAlex.com.github.customermanagement.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SimiAlex.com.github.customermanagement.dto.Customer;
import SimiAlex.com.github.customermanagement.repositories.CustomerRepository;

@Service
public class CustomerService 
{
    // fields
    private CustomerRepository cr; 

    // constructor
    @Autowired
    public CustomerService(CustomerRepository cr)
    {
        this.cr = cr;
    }

    //methods
    public Customer findById(Integer id)
    {
        Optional<Customer> customerOptional = cr.findById(id);
        
        return customerOptional.get();
    }
}
