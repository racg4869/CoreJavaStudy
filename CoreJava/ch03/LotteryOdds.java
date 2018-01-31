package CoreJava.ch03;
import java.util.*;
/**
 * a program to caculate the C_n^k
 * @author lipeng
 * @version 1.0 2018-02-26
 * @since 1.0
 */

 public class LotteryOdds{
   public static void main(String[] args){
     Scanner in=new Scanner(System.in);

     System.out.print("How many numbers you need to draw? ");
     int k=in.nextInt();

     System.out.print("What is the highest number you can draw? ");
     int n=in.nextInt();

     int lo=1;
     for(int i=0;i<k;i++){
      lo=lo*(n-i)/(i+1); //不必担心会出现除不尽，每步都能除尽
     }

     System.out.printf("You are i in %d !Good Luck.",lo);
   }
 }