import java.util.Scanner;
public class Dice {
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 1-6");

int firstDie = input.nextInt();

System.out.print("Enter another number between 1-6");

int secondDie = input.nextInt();

int total = firstDie + secondDie;

if(firstDie < 1 && firstDie > 6){
System.out.print("out of range");
}
else{
System.out.printf("First die is:" + %d%n, Second die is: %d%n, the total roll is %n",firstDie,secondDie,total);
}

}

}