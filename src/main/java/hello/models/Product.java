package hello.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long productId;

  private String productName;

  private String productCode;

  private Double productDescription;

  private Double points;

  private Double pointsPlusMoney;

  public Long getProductId() {
    return productId;
  }

}