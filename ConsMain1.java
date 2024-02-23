public class ConsMain1{
public static void main(String args[]){

MyClass1 t1 = new MyClass1(10);
MyClass1 t2 = new MyClass1(20);
System.out.println(t1.getX() + " " + t2.getX());
t2.setX(40);//Setting the value of x using the setX method
System.out.println(t1.getX()*t2.getX());
}
}