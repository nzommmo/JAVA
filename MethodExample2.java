public class MethodExample2{
public static void main(String[]args){
int a = 1;
int b = 6;
int c = minFunction(a,b);
System.out.println("Minimum value = " + c );
}
public static int minFunction(int x , int y){
int min;
if (x > y)
min = y;
else
min = x;
return min;

}
}