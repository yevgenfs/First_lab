package ua.lviv.IoT.fish;

import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FishProducts extends FishSearchAndSort {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Enumerated(EnumType.STRING)
  private KindOfFish kindOfFish;
  private int price;
  @Enumerated(EnumType.STRING)
  private Import imports;
  private boolean keepingStorageConditon;
  private String fromWhichCountry;
  @Enumerated(EnumType.STRING)
  private QualityOfFish qualityOfFish;  
  private String nameOfFish;
  private double weight;
  
  public FishProducts() {}
  
  public FishProducts(KindOfFish kindOfFish, int price, Import imports,
      boolean keepingStorageConditon,String fromWhichCountry, QualityOfFish qualityOfFish,
      String name, double weight) {
    this.kindOfFish = kindOfFish;
    this.price = price;
    this.imports = imports;
    this.keepingStorageConditon = keepingStorageConditon;
    this.fromWhichCountry = fromWhichCountry;
    this.qualityOfFish = qualityOfFish;
    this.nameOfFish = name;
    this.weight = weight;
  }

  public String toString() {
    return "FishProducts [kindOfFish=" + kindOfFish + ", price=" + price + ", imports=" + imports
       + ", keepingStorageConditon=" + keepingStorageConditon + ", fromWhichCountry=" 
      + fromWhichCountry
       + ", qualityOfFish=" + qualityOfFish + ", nameOfwfsh=" + nameOfFish + ", weight=" + weight 
       + "]";
  }
  
  public String toCSv() {
    return kindOfFish + "," + price + "," + imports + "," + keepingStorageConditon
      + "," + fromWhichCountry + "," + qualityOfFish + "," + nameOfFish + "," + weight; 
  }
  
  public String  getHeaders() {
    return "KindOfFish" + "," + "price" + "," + "imports" + "," + "keepingStorageConditon"
        + "," + "fromWhichCountry" + "," + "qualityOfFish" + "," + "nameOfFish" + "," + "weight"; 
  }


  public KindOfFish getKindOfFish() {
    return kindOfFish;
  }

  public void setKindOfFish(KindOfFish kindOfFish) {
    this.kindOfFish = kindOfFish;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Import getImports() {
    return imports;
  }

  public void setImports(Import imports) {
    this.imports = imports;
  }

  public boolean isKeepingStorageConditon() {
    return keepingStorageConditon;
  }

  public void setKeepingStorageConditon(boolean keepingStorageConditon) {
    this.keepingStorageConditon = keepingStorageConditon;
  }

  public String getFromWhichCountry() {
    return fromWhichCountry;
  }

  public void setFromWhichCountry(String fromWhichCountry) {
    this.fromWhichCountry = fromWhichCountry;
  }

  public QualityOfFish getQualityOfFish() {
    return qualityOfFish;
  }

  public void setQualityOfFish(QualityOfFish qualityOfFish) {
    this.qualityOfFish = qualityOfFish;
  }

  public String getNameOfFish() {
    return nameOfFish;
  }

  public void setNameOfFish(String nameOfwfsh) {
    this.nameOfFish = nameOfwfsh;
  }

  public double getWeight() {
    return weight;
  }
  

  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
