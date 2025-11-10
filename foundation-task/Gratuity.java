import java.util.Scanner;
public class GratuityRate {
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the subtotal: ");

double subtotal = input.nextDouble();

System.out.print("Enter the gratuity: ");

double gratuity = input.nextDouble();

gratuity = (gratuity / 100) * subtotal;

subtotal = gratuity + subtotal;

System.out.println("the gratuity is $" + gratuity + "and total is $"+ subtotal);
}

}