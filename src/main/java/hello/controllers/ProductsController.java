package hello.controllers;

import hello.models.Product;
import hello.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ProductsController {

  @Autowired
  ProductRepository productRepository;

  @RequestMapping(value = "/products",method = RequestMethod.GET)
  public ResponseEntity<List<Product>> customersList(){
    List<Product> products = (List<Product>) productRepository.findAll();
    return new ResponseEntity<>(products, HttpStatus.OK);
  }

  @RequestMapping(value = "/products", method = RequestMethod.POST)
  @ResponseBody
  public String saveProduct(@RequestBody Product product) {
    productRepository.save(product);
    return product.getProductId().toString();
  }


}