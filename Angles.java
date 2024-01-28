import java.util.Scanner;
class Angles{
public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of angle S");
int s = scanner.nextInt();
System.out.println("Enter the value of angle Z");
int z = scanner.nextInt();

int x = 180 - z;
int y = 180-(s+x);

System.out.println("The value of angle X is:"+x);
System.out.println("The value of angle Y is:"+y);
}
}