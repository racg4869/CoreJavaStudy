package CoreJava.ch03;
import java.util.Scanner;
/**
 * a program use do-while and interface to caculate
 * when you can retire
 * @author lipeng
 * @version 1.0
 * @since 1.0
 */
public class Retirement2{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);

    System.out.println("How much money do you want to retire?");
    double goal =in.nextDouble();

    System.out.println("How much money do you contribute every year?");
    double payment= in.nextDouble();

    System.out.print("What's the interest rate in %:");
    double interestrate=in.nextDouble()/100;

    double balance=0.0;
    int year=0;
    
    String input;
    do{
      balance+=payment;
      double interest=balance*interestrate;
      balance+=interest;
      year++;

      System.out.printf("After %d years ,your balance is %f.",year,balance);

      System.out.print("Ready to retire?[Y/N]:");
      input=in.next();
    }while(input.equals("N"));
  }
}