import java.util.Scanner;
public class InitialVelocity{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter initialVelocity in metres/second: ");
double velocity = input.nextDouble();

System.out.print("Enter time span: ");
double timeSpan = input.nextDouble();

System.out.print("Enter acceleration in meters/second2: ");
double acceleration = input.nextDouble();

double distanceCovered = ((velocity * timeSpan) + 0.5 * (acceleration * (timeSpan * timeSpan) ) );

System.out.println("The distance covered is" + distanceCovered);
}

}