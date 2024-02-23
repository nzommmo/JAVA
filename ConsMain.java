public class ConsMain {
public static void main (String args[]) {
MyClass t1 = new MyClass();
MyClass t2 = new MyClass();
System.out.println(t1.getX() + " " + t2.getX());
t2.setX(34);// Setting the value of x using the setX method
System.out.println(t1.getX()*t2.getX());
}



}
