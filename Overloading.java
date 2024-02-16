public class Overloading{
public static void main(String[]args){
int a = 11;
int b = 6;
double c = 7.3;
double d = 9.4;
int results1 = min(a, b);
double result2 = min(c,d);
System.out.println("Minimum Value = " + results1);
System.out.println("Minimum Value = " + result2);
}

public static int min (int x, int y){
int min;
if (x>y)
min = y;
else
min = x;
return min;
}
public static double min( double x , double y){
double min;
if (x>y)
min = y;
else
min = x;
return min;
}
}
