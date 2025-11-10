import java.util.Scanner;
public class Kilometres{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter miles: ");

mileDouble = input.nextDouble();

double Kilometres = mileDouble * 1.6;

System.out.printf("your mile is" + Kilometres);
}

}