import java.util.Scanner;
public class Examplevoid {
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
System.out.println("Input your Rank Points");
double Rank = scanner.nextDouble();

RankPoints(Rank);



scanner.close();
}

public static void RankPoints(double points) {
if (points >= 202.5){
System.out.println("Rank:A1");
}
else if (points >= 122.4){
System.out.println("Rank:A2");
}
else {
System.out.println("Rank:A3");
}


}
}