import java.util.Scanner;
class kenya{
public static void main(String args []){

// question 4
/*int tp= 14000000;
double f = 0.55*tp;
double m = 0.45*tp;
double em = 0.45*m;
double ef = 0.25*f;
double uf = f - ef;
double te = em+ ef;

System.out.println("The male population of the country is \t"+m);
System.out.println("The female unempoyed population of the country is \t"+uf);
System.out.println("The total employed population of the country is \t"+te);
*/

//question 6
/*
Scanner scanner = new Scanner(System.in);

System.out.println("Enter mass: ");
int mass = scanner.nextInt();
System.out.println("Enter Density: ");
int density = scanner.nextInt();

int volume = mass * density;
System.out.println("the volume is \t"+volume);
scanner.close();
*/

//question 7


Scanner scanner = new Scanner(System.in);
System.out.println("Enter Amout in kenya shillings");
int kshs = scanner.nextInt();
// convert into uganda shillings

int ush = kshs* 24;

// convert ush to dollar
double dollar = ush / 1950;
System.out.println("The amount in dollars is \t"+dollar);
scanner.close();



}
}