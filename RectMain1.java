import java.util.Scanner;
class Rectangle {
int width; 
int length;
// A constructor to initialize the class data members
Rectangle() {
width= 10;
length= 15;
}

//Parameterized constructor
Rectangle(int w,int l) {
width = w;
length = l;
}

public void setWidth(int w){
width = w;
}
public void setLength(int l){
length = l;
}







public int area(){ return width*length;}
}



public class RectMain1{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Width");
int wid = scan.nextInt();
System.out.println("Enter the length");
int len = scan.nextInt();
Rectangle rect = new Rectangle (wid,len);
printRectangle(rect);// calling the method and passing into it the object

}//End of main

// A method that prints rectangle details
public static void printRectangle(Rectangle R){
System.out.println("The Width of the Rectangle is " + R.getWidth());
System.out.println("The Length of the Rectangle is " + R.getLength());
System.out.println("The area of the new rectangle is " + R.area());
}
}//End of class RectMain1