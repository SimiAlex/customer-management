package SimiAlex.com.github.customermanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SimiAlex.com.github.customermanagement.dto.Customer;
import SimiAlex.com.github.customermanagement.services.CustomerService;

@Controller
public class CustomerController 
{
    //fields
    private CustomerService cs;

    //constructor
    @Autowired
    public CustomerController(CustomerService cs)
    {
        this.cs = cs;
    }

    //methods
    @RequestMapping(value = {"/getCustomer"}, method = RequestMethod.GET)
    public String getCustomerById(Model model, @RequestParam("id") int customerId)
    {
        Customer customer = cs.findById(customerId);
        model.addAttribute("customer", customer);
        return "get-customer";
    }

}
