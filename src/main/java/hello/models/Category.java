package hello.models;

import javax.persistence.*;

@Entity
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  @Column(name = "categoryId")
  private Long categoryId;

  @Column(name = "categoryName")
  private String categoryName;

  @Column(name = "imageId")
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
}