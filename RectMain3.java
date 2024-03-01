import java.util.Scanner;
class Rectangle{
int width;
int length;

Rectangle(){
width = 10;
length = 15;
}
Rectangle(int w, int l){

width = w;
length = l;}

//To set width
public void setWidth(int w){
width = w;
}
//To set length
public void setLength(int l){

}

//To get width
public int getWidth(){
return width;}
//To get length
public int getLength(){
return length;
}
public int area(){
return width * length;}

public int perimeter(){
return 2*(length + width);
}

}//end of class

public class RectMain3 {
public static void main(String [] args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter the width");
int wid = scan.nextInt();
System.out.println("Enter the length");
int len = scan.nextInt();
Rectangle rect = new Rectangle(wid,len);
printRectangle(rect);

}
public static void printRectangle(Rectangle R){
System.out.println("The width of the rectangle is " +R.getWidth());
System.out.println("The length of the rectangle is " +R.getLength());
System.out.println("The area of the new rectangle is " +R.area());
}
}//End of main
