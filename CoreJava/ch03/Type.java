package CoreJava.ch03;
import java.util.Scanner;
/**
 * a program test the usage of basic type of Java
 * @author lipeng
 * @version 1.0 2018-01-25
 */

public class Type{
  public static void main(String[] args){
    long longMin=0x8000000000000000L,longMax=0x7fffffffffffffffL;
    System.out.println("long Min="+longMin+" Max="+longMax);
    int  intMin =0x80000000,         intMax=0x7fffffff;
    System.out.println("int Min="+intMin+" Max="+intMax);
    short shortMin=-0x8000,shortMax=0x7fff;
    System.out.println("short Min="+shortMin+" Max="+shortMax);
    byte byteMin=(byte)0x80,byteMax=(byte)0x7f;
    System.out.println("byte Min="+byteMin+" Max="+byteMax);
    
    char A='A',B='B';
    String str="我是中国人";
    System.out.println(str);
    float fquater=0.25f;
    double dquater=0.25;

    Scanner in=new Scanner(System.in);
    System.out.println("What's your name?");
    String name=in.nextLine();
    System.out.println("I know,you are "+name);
  }
}