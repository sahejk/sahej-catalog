package hello.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long categoryId;

  private String categoryName;

  private Double imageId;

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Double getImageId() {
    return imageId;
  }

  public void setImageId(Double imageId) {
    this.imageId = imageId;
  }

  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "category",fetch = FetchType.LAZY, targetEntity = Product.class)
  private Set<Product> products;

  public Set<Product> getProducts() {
    return products;
  }

  public void setProducts(Set<Product> products) {
    this.products = products;
  }
}