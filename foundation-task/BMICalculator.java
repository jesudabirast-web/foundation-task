import java.util.Scanner;

public class BMICalculator{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pound: ");
double weight = input.nextDouble();

System.out.print("Enter height in inches: ");
double height = input.nextDouble();

double BMI = (weight * 703) / (height * height);
        
System.out.println("BMI is : " + BMI);
}

}
