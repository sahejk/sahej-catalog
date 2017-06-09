package hello.controllers;

import hello.models.Customer;
import hello.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class CustomersController {

  @Autowired
  CustomerRepository customerRepository;

  @RequestMapping(value = "/customers",method = RequestMethod.GET)
  public ResponseEntity<List<Customer>> customersList(){
    List<Customer> customers = (List<Customer>) customerRepository.findAll();
    return new ResponseEntity<>(customers, HttpStatus.OK);
  }
}