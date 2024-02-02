import java.util.Scanner;
class IfExample{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.println("Input your age");
int age = scanner.nextInt();

if(age > 18){
System.out.println("Age is greater than 18");
}else{
System.out.println("You are still children");
}
scanner.close();


}
}