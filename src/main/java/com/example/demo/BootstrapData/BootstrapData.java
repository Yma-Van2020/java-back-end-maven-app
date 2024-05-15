package com.example.demo.BootstrapData;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootstrapData {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @PostConstruct
    public void loadInitialData() {
        if (customerRepository.count() == 1) {

            Customer customer1 = new Customer();
            customer1.setFirstName("Alice");
            customer1.setLastName("Johnson");
            customer1.setPostal_code("54321");
            customer1.setAddress("123 Main St");
            customer1.setPhone("(555)123-4567");
            customer1.setDivision(divisionRepository.findAll().get(0));
            customer1.setCreateDate(new Date());
            customer1.setLastUpdate(new Date());

            Customer customer2 = new Customer();
            customer2.setFirstName("Bob");
            customer2.setLastName("Smith");
            customer2.setPostal_code("98765");
            customer2.setAddress("456 Elm St");
            customer2.setPhone("(555)987-6543");
            customer2.setDivision(divisionRepository.findAll().get(1));
            customer2.setCreateDate(new Date());
            customer2.setLastUpdate(new Date());

            Customer customer3 = new Customer();
            customer3.setFirstName("Charlie");
            customer3.setLastName("Brown");
            customer3.setPostal_code("13579");
            customer3.setAddress("789 Oak St");
            customer3.setPhone("(555)246-8013");
            customer3.setDivision(divisionRepository.findAll().get(2));
            customer3.setCreateDate(new Date());
            customer3.setLastUpdate(new Date());

            Customer customer4 = new Customer();
            customer4.setFirstName("David");
            customer4.setLastName("Miller");
            customer4.setPostal_code("24680");
            customer4.setAddress("101 Pine St");
            customer4.setPhone("(555)369-1470");
            customer4.setDivision(divisionRepository.findAll().get(3));
            customer4.setCreateDate(new Date());
            customer4.setLastUpdate(new Date());

            Customer customer5 = new Customer();
            customer5.setFirstName("Eva");
            customer5.setLastName("Wilson");
            customer5.setPostal_code("86420");
            customer5.setAddress("202 Cedar St");
            customer5.setPhone("(555)258-0369");
            customer5.setDivision(divisionRepository.findAll().get(4));
            customer5.setCreateDate(new Date());
            customer5.setLastUpdate(new Date());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Sample customers added!");
        } else {
            System.out.println("Sample customers already exist!");
        }
    }
}
