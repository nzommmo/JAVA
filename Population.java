import java.util.Scanner;
class Population{
public static void main(String args[]){
int tp= 14000000;
double f = 0.55*tp;
double m = 0.45*tp;
double em = 0.45*m;
double ef = 0.25*f;
double uf = f - ef;
double te = em+ ef;

System.out.println("The male population of the country is \t"+m);
System.out.println("The female unempoyed population of the country is \t"+uf);
System.out.println("The total employed population of the country is \t"+te);




}
}



