public class MarksRandom{
public static void main(String[]args){


System.out.println("CAT1\tCAT2\tTotalCAT\tExam\tAGG\t");
for (int i=1;i<=10;i++){

int cat1 = 2+ (int)Math.ceil(Math.random()*8);
int cat2 = 5+ (int)Math.ceil(Math.random()*15);
int exam = (int)Math.ceil(Math.random()*70);

int totalcat = cat1 + cat2;
int agg = totalcat + exam;

System.out.println(cat1+"\t"+cat2+"\t"+totalcat+"\t"+exam+"\t"+agg);

}


}
}