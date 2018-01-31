package CoreJava.ch03;
import java.util.Scanner;
import java.math.BigInteger;
/**
 * a program use big integer to caculate C_n^k
 * @author lipeng
 * @version 1.0 2017-02-26
 */
public class BigLotteryOdds{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    System.out.print("How many Numbers do you want to draw?");
    int k=in.nextInt();

    System.out.print("What is the highest number?");
    int n=in.nextInt();

    BigInteger lo=BigInteger.valueOf(1);
    for(int i=0;i<k;i++){
      lo=lo.multiply(BigInteger.valueOf(n-i)).divide(BigInteger.valueOf(i+1));
    }

    System.out.println("You are 1 in "+lo+"! Good Luck.");
  }
}