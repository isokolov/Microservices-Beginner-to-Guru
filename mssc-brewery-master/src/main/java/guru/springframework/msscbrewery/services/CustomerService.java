package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {


    public CustomerDTO getCustomerById(UUID customerId);
}
