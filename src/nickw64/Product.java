package nickw64;
/*
 *This class is for building products
 * @author: Nicholis Wright
 * */
public class Product implements Item {
  private int Id;
  public ItemType Type;
  private String Manufacturer;
  private String Name;

  /*
   * Default constructor for Product
   * @author: Nicholis Wright
   *@param
   * */
  Product() {
    setId(1);
    setType(ItemType.AUDIO);
    setManufacturer("unknown");
    setName("unknown");
  }

  /*
   * 3 param constructor for Product (overloaded)
   * @author: Nicholis Wright
   * @param String name: name of product
   * @param String manufacturer: name of manufacturer
   * @param Itemtype type: type of product
   * */
  Product(String name, String manufacturer, ItemType type) {
    setName(name);
    setManufacturer(manufacturer);
    setType(type);
  }

  /*
   * toString method compiles a product statement
   *@author: Nicholis Wright
   *@param none
   * */
  public String toString() {
    return "Name: "
        + getName()
        + "\n"
        + "Manufacturer: "
        + getManufacturer()
        + "\n"
        + "Type: "
        + getType()
        + "\n";
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
  public void setId(int id) {
    this.Id = id;
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
  public ItemType getType() {
    return Type;
  }
}

/*
 * This class builds a "widget" like a test product
 * @author: Nicholis Wright
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
