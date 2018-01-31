package CoreJava.ch03;
import java.util.Scanner;
/**
 * this program use while to see when you can retire
 * @author lipeng
 * @version 1.0
 * @since 1.0
 */

 public class Retirement{
   public static void main(String[] args){
    Scanner in=new Scanner(System.in); 
    System.out.println("How much money do you want to retire?");
    double goal=in.nextDouble();

    System.out.println("How much money will you contribute every year?");
    double payment=in.nextDouble();

    System.out.print("Interest Rate in %:");
    double interestrate=in.nextDouble();

    double balance=0;
    int year=0;
    while(balance<goal){
      balance+=payment;
      double interest=balance*interestrate/100;
      balance +=interest;
      year++;
    }
    System.out.printf("You can retire in %d years!\n",year);
   }
 }