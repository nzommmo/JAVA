import java.util.Scanner;
class prism{
public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.println("What is the length of the prism");
int l = scanner.nextInt();
System.out.println("What is the width of the prism");
int w = scanner.nextInt();
System.out.println("What is the height of the prism");
int h = scanner.nextInt();


int surfacearea = 2*((l*w)+(l*h)+(w*h));
int volume = l*w*h;
int capacity = volume /1000;

System.out.println("The surface area of the prism is:"+surfacearea);
System.out.println("The volume of the prism is:"+volume );
System.out.println("The capacity of the prism is:"+capacity);
scanner.close();
}
}