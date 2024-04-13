//Base Class
class Product{
String ProductName;
String ProductManufacturer;
int Price;
//Class Product constructor to initialize data members
Product(String productname,String productmanufacturer,int price){
ProductName = productname;
ProductManufacturer = productmanufacturer;
Price = price;
}//end of Product Constructor
//Method to display the info
public void displayInfo(){
//System.out.println(ProductName,ProductManufacturer,Price);
}//end of displayInfo method
}//end of Super class Product

//Subclass
class Electronics extends Product{
int quantity;
//constructor for Class Electronics
Electronics(String productname,String productmanufacturer,int price,int quantity){
super (productname,productmanufacturer,price);
this.quantity = quantity;
}
//override method
public void displayInfo(){
//System.out.println(ProductName,ProductManufacturer,Price,quantity);

}
}

public class Products{
public static void main(String [] args){
//Creating an Electronics object
Electronics electronics= new Electronics ("Kettle","Ramtons",2000,6);
System.out.println(electronics.ProductName);
}//end of main method
}//end of main class
