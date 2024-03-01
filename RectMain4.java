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

public class RectMain4{
public static void main(String[]args){
//Scanner scan = new Scanner (System.in);
//Rectangle rect = getRectangle();
//printRectangle(rect);
System.out.println("Width\tlength\tarea\tperimeter\t");


Rectangle[]rect = new Rectangle[10];

//Populating the Array
for(int i=0;i<rect.length;i++){
rect[i] = getRectangle();
}//end of Populating loop

//processing
for(int j=0;j<rect.length;j++){
printRectangle(rect[j]);

}//End of Processing Loop
}
public static Rectangle getRectangle(){
Rectangle R = new Rectangle();
R.width = (int)Math.ceil(Math.random()*20);
R.length = (int)Math.ceil(Math.random()*10);
return R;
}
/*public static void printRectangle(Rectangle R){
System.out.println("Width \t length \t area \t perimeter\t");
System.out.println("The Length of the Rectangle is" +R.getLength());
System.out.println("The area of the new Rectangle is" +R.area());
}*/
public static void printRectangle(Rectangle R){
System.out.println(R.getWidth() + "\t" + R.getLength() + "\t" + R.area() + "\t" + R.perimeter());

}//End of class
}//End of main
