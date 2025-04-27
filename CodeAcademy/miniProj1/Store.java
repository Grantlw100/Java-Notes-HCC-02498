public class Store {
  // instance fields
  public String productType;
  public int inventoryCount;
  public double inventoryPrice;


  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  @Override
  public String toString(){
    return "product type: " + productType + " inventory: " + inventoryCount + " price: " + inventoryPrice;
  }
}