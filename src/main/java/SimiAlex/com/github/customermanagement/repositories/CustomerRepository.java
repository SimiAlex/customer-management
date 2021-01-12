package SimiAlex.com.github.customermanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import SimiAlex.com.github.customermanagement.dto.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>
{
    
}
