import java.util.Scanner;
class Options{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
System.out.println("Input your CAT 1 marks");
int cat1 = scanner.nextInt();
System.out.println("Input your CAT 2 marks");
int cat2 = scanner.nextInt();
System.out.println("Input your Exam marks");
int Exammark = scanner.nextInt();
System.out.println("Choose one of the following options");
System.out.println("1:Calculate your total marks");
System.out.println("2:Calculate your average marks");

int totalmarks = cat1 + cat2 + Exammark;
int average = totalmarks/3;

int option = scanner.nextInt();

scanner.close();
switch(option){
case 1:System.out.println(totalmarks);break;
case 2:System.out.println(average);break;
default:System.out.println("Invalid option");

}

}
}