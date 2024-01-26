import java.util.Scanner;
class currency{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter Amout in kenya shillings");
int kshs = scanner.nextInt();
// convert into uganda shillings

double ush = kshs* 24;

// convert ush to dollar
double dollar = ush / 1950;
System.out.println("The amount in dollars is \t"+dollar);
scanner.close();






}
}