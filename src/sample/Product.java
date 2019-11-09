package sample;
/*
 *This class is for building products
 * @author: Nicholis Wright
 *@param
 * */
public class Product implements Item {
  private int Id;
  private ItemType Type;
  private String Manufacturer;
  private String Name;

  /*
   * Default constructor for Product
   * @author: Nicholis Wright
   *@param
   * */
  Product() {
    this.Id = 1;
    this.Type = ItemType.AUDIO;
    this.Manufacturer = "unknown";
    this.Name = "unknown";
  }

  /*
   * 3 param constructor for Product (overloaded)
   * @author: Nicholis Wright
   * @param String name: name of product
   * @param String manufacturer: name of manufacturer
   * @param Itemtype type: type of product
   * */
  Product(String name, String manufacturer, ItemType type) {
    this.Name = name;
    this.Manufacturer = manufacturer;
    this.Type = type;
  }

  /*
   * toString method compiles a product statement
   *@author: Nicholis Wright
   *@param none
   * */
  public String toString() {
    return "Name: " + Name + "\n" + "Manufacturer: " + Manufacturer + "\n" + "Type: " + Type + "\n";
  }

  /*
   * Gets id of product
   * @author: Nicholis Wright
   * @return Id: id of product
   * */
  public int getId() {
    return Id;
  }

  /*
   * This method sets id of product.
   * @author: Nicholis Wright
   * @param int Id: id code of product
   * */
  public void setId(int Id) {
    this.Id = Id;
  }

  /*
   * This returns the manufacturer name.
   * @author: Nicholis Wright
   * @return Manufacturer: return manufacturer name
   * */
  public String getManufacturer() {
    return Manufacturer;
  }

  /*
   * This sets the manufacturer name.
   * @author: Nicholis Wright
   * @param String manufacturer: name of manufacturer passed in.
   * */
  public void setManufacturer(String manufacturer) {
    Manufacturer = manufacturer;
  }

  /*
   * This returns the name of a product.
   * @author: Nicholis Wright
   * @return Name: returns product name
   * */
  public String getName() {
    return Name;
  }

  /*
   * This sets a name for the product.
   * @author: Nicholis Wright
   * @param String name: passed in name of product to set.
   * */
  public void setName(String name) {
    Name = name;
  }

  /*
   * This method sets the item type
   * @author: Nicholis Wright
   * @param ItemType type: assigns the passed info to the new type.
   * */
  public void setType(ItemType type) {
    Type = type;
  }

  /*
   * This method returns the item type of a product
   * @author: Nicholis Wright
   * @return Type: returns type of product
   * */
  ItemType getType() {
    return Type;
  }
}

/*
 * This class builds a "widget" like a test product
 * @author: Nicholis Wright
 * @param-none
 * */
class Widget extends Product {

  /*
   * This Constructor builds a 4 param object and calls constructor of superClass.
   * @author: Nicholis Wright
   * @call super(name,manufacturer,type): call super constructor
   * */
  Widget(String name, String manufacturer, ItemType type) {
    super(name, manufacturer, type);
  }
}
