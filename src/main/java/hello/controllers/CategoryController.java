package hello.controllers;

import hello.models.Category;
import hello.models.Product;
import hello.repositories.CategoryRepository;
import hello.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@Controller
@RequestMapping("/categories")
public class CategoryController {

  @Autowired
  CategoryRepository categoryRepository;

  @Autowired
  ProductRepository productRepository;

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<Category>> customersList(){
    List<Category> categories = (List<Category>) categoryRepository.findAll();
    return new ResponseEntity<>(categories, HttpStatus.OK);
  }

  @RequestMapping( method = RequestMethod.POST)
  @ResponseBody
  public String saveCategory(@RequestBody Category category) {
    categoryRepository.save(category);
    return category.getCategoryId().toString();
  }


  @RequestMapping(value = "/{id}/products", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<String> addProduct(@PathVariable("id")  String categoryId, @RequestBody Product product) {
    productRepository.save(product);
    Category category = categoryRepository.findOne(Long.parseLong(categoryId));
    product.setCategory(category);
    Set<Product> products = category.getProducts();
    products.add(product);
    category.setProducts(products);
    categoryRepository.save(category);
    return new ResponseEntity<>(HttpStatus.OK);
  }


  @RequestMapping(value = "/{id}/products", method = RequestMethod.GET)
  public ResponseEntity<Set<Product>> getProduct(@PathVariable("id")  String categoryId) {
    Category category = categoryRepository.findOne(Long.parseLong(categoryId));
    return new ResponseEntity<>(category.getProducts(), HttpStatus.OK);
  }

}