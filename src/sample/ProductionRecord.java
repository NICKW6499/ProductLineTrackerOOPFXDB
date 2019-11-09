package sample;

import java.util.Date;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

/*
 *Production record class contains methods and constructors
 * to enable production recording
 * @author: Nicholis Wright
 * extends product to gain access to product vars
 * */
public class ProductionRecord extends Product {
  private int productionNumber;
  private int productID;
  private String serialNumber;
  private Date dateProduced;

  /*
   * Default constructor for production records
   * @author: Nicholis Wright
   * @param -none
   * */
  ProductionRecord() {
    this.productionNumber = 1;
    this.productID = 1;
    this.serialNumber = "1";
    setProdDate(new Date());
  }

  /*
   *constructor using a product id
   * @author: Nicholis Wright
   * @param int productID: used to get info of a specific product
   * */
  public ProductionRecord(int productID) {
    setProductionNum(0);
    setSerialNum("0");
    setProdDate(new Date());
  }

  /*
   * Constructor using a product and count to make unique serial numbers
   * @author: Nicholis Wright
   * @param Product product: passes in a product to use unique info for a serial number
   * @param int count: control the "count" of a specific type of product
   * */
  public ProductionRecord(Product product, int count) {

    setProdDate(new Date());

    this.productionNumber = getProductionNum();
    this.productID = product.getId();

    String idNumber = String.format("%05d", count);

    this.serialNumber =
        product.getManufacturer().substring(0, 3) + product.getType().getCodes() + idNumber;
  }

  /*
   * Constructor for 4 parameters
   * @author: Nicholis Wright
   * @param int ProductionNumber: product number
   * @param int productID: product ID
   * @param String serialNumber: serial number
   * */
  public ProductionRecord(
      int productionNumber, int productID, String serialNumber, Date dateProduced) {
    this.productionNumber = productionNumber;
    this.productID = productID;
    this.serialNumber = serialNumber;
    this.dateProduced = dateProduced;
  }

  /*
   * toString method compiles info into a product statement
   * @author: Nicholis Wright
   * @param: none
   * */
  @Override
  public String toString() {

    return "Prod. Num: "
        + productionNumber
        + " Product ID: "
        + productID
        + " Serial Num: "
        + serialNumber
        + " Date: "
        + dateProduced;
  }

  /*
   *Retrieves dateProduced var
   * @author: Nicholis Wright
   * @return dateProduced: returns current date.
   * */
  public Date getProdDate() {
    return dateProduced;
  }
  /*
   * assign a value to dateProduced
   * @author: Nicholis Wright
   * @param Date date: passes in current date
   * */
  private void setProdDate(Date date) {
    this.dateProduced = date;
  }

  /*
   * assign value to serialNumber
   * @author: Nicholis Wright
   * @param String serialNumber: passes in serialNumber for class var.
   * */
  private void setSerialNum(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /*
   * return serialNumber
   * @author: Nicholis Wright
   * @return serialNumber: return value of serialNumber.
   * */
  public String getSerialNum() {
    return serialNumber;
  }

  /*
   * assign value to productID
   * @author: Nicholis Wright
   * @param int productID: assigns argument to productID var.
   * */
  public void setProductID(int productID) {
    this.productID = productID;
  }

  /*
   * return product ID
   * @author: Nicholis Wright
   * @return productID: return value of productID.
   * */
  public int getProductID() {
    return productID;
  }

  /*
   * return product number
   * @author: Nicholis Wright
   * @return productionNumber: return value of productionNumber.
   * */
  private int getProductionNum() {
    return productionNumber;
  }

  /*
   * assign production number
   * @author: Nicholis Wright
   * @param int productionNumber: assign parameter to class var.
   * */
  private void setProductionNum(int productionNumber) {
    this.productionNumber = productionNumber;
  }
}
