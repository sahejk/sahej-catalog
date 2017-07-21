package hello.controllers;

import hello.models.Category;
import hello.repositories.CategoryRepository;
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
public class CategoryController {

  @Autowired
  CategoryRepository categoryRepository;

  @RequestMapping(value = "/categories",method = RequestMethod.GET)
  public ResponseEntity<List<Category>> customersList(){
    List<Category> categories = (List<Category>) categoryRepository.findAll();
    return new ResponseEntity<>(categories, HttpStatus.OK);
  }

  @RequestMapping(value = "/categories", method = RequestMethod.POST)
  @ResponseBody
  public String saveCategory(@RequestBody Category category) {
    categoryRepository.save(category);
    return category.getCategoryId().toString();
  }


}