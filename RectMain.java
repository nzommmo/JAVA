import java.util.Scanner;
class Rectangle {
int width; int length;
// A constructor to initialize the class data members
Rectangle() {
width = 10;
length = 15;
}
//Parameterized constructor
Rectangle (int w ,int l) {
width = w;
length=l;
}
public int area(){
return width * length;
}

}

// class RectMain to implement the Rectangle class 
public class RectMain{
public static void main(String args []){

Scanner scan = new Scanner(System.in);
Rectangle r1 = new Rectangle();// Creating an object r1 using constructor without parameters
System.out.println("The area of the rectangle is " + r1.area());
System.out.println("Enter the width");
int wid = scan.nextInt();
System.out.println("Enter the length");
int len = scan.nextInt();
Rectangle r2 = new Rectangle(wid,len);
System.out.println("The area of the new rectangle is " + r2.area());


}//End of Main

}//End of public class RectMain