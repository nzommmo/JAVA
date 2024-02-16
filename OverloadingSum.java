public class OverloadingSum{
public static void main(String[] args) {
int a = 11;
int b = 6;
int c = 10;
double d = 7.3;
double e = 9.4;
double f = 4.5;
int result1 = sum(a, b);
int result2 = sum (a,b,c);
double result3 = sum(d,e);
double result4 =sum (d,e,f);
System.out.println("Sum of 2 integers= " + result1);
System.out.println("Sum of 3 integers= " + result2);
}

public static int sum(int x, int y) {
int sum = x + y;
return sum;
}
/*
public static double min(double n1, double n2) {
double min;
if (n1 > n2)
min = n2;
else
min = n1;
return min;
}*/
}