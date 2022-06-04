package no.malde.topbite.model;

import java.util.Objects;

public class Item {

  private String name;
  private float price;
  private String imageFileName;


  public Item(String name,float price){
    this.setName(name);
    this.setPrice(price);
  }

  public Item(String name,float price, String imageFileName){
    this.setName(name);
    this.setPrice(price);
    this.setImageFileName(imageFileName);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(name == null || name.isEmpty()){
      throw new IllegalArgumentException("Item name can not be empty or null");
    }
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    if(price < 0 || price > 50000f){
      throw new IllegalArgumentException("Price should be between 0 and 50 000.");
    }
    this.price = price;
  }

  public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    if(imageFileName == null || imageFileName.isEmpty()){
      throw new IllegalArgumentException("Item name can not be empty or null");
    }
    this.imageFileName = imageFileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Float.compare(item.price, price) == 0 &&
        Objects.equals(name, item.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString() {
    return name+","+price+","+imageFileName;
  }
}
