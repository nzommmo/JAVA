import java.util.Scanner;
class CustomDuty{
public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.println("What is the value of your imported item");
int value = scanner.nextInt();

double duty = 0.03 * value;
double purchaseTax = 0.02*(value + duty);
double totalpercentage = ((duty+purchaseTax)/value)*100;

System.out.println("The custom duty of your product is:" +duty);
System.out.println("The purchase duty of your product is:"+purchaseTax);
System.out.println("The total percentage taxed is:" +totalpercentage);

scanner.close();



}
}