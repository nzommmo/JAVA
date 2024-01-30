import java.util.Scanner;
class EvenOdd{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.println("Input a number:");
int number = scanner.nextInt();

if(number % 2 ==0){
System.out.println(+number +" " +"is an even number");

}else{
System.out.println(+number +" "+ "is an odd number");
}


}
}