import java.util.Scanner;

public class Eggs{

public static void main(String[]args){

Scanner input = new Scanner (System.in);

System.out.print ("How many eggs do you have?");

int Eggs = input.nextInt();

if (Eggs > 500){

int gross = Eggs / 144;

int grossRemainder = Eggs % 144;

int dozen = grossRemainder / 12;

int dozenRemainder = grossRemainder % 12;

int leftover = dozenRemainder;

System.out.print("Your number of eggs is" + gross + "gross", + dozen + "dozen, and" + leftover + "leftover" );
}

}

}