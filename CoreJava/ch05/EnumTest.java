package CoreJava.ch05;

import java.util.Scanner;

/**
 * Test the Enum 
 * @author lipneg
 * @version 1.0
 */
public class EnumTest{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.println("Please choose a size: {SMALL,MIDDLE,LARGE,EXTRA_LARGE}");
    String input=in.next().toUpperCase();
    Size s=(Size)Enum.valueOf(Size.class, input);
    
    System.out.println("Size:"+s);
    System.out.println("Abbrevation:"+s.getAbbrevation());

    for(Size t:Size.values()){
      System.out.println("Size:"+t+" Abbrevation:"+t.getAbbrevation());
    }
  }
}
enum Size{
  SMALL("S"),MIDDLE("M"),LARGE("L"),EXTRA_LARGE("XL");
  private Size(String abbrevation){
    this.abbrevation=abbrevation;
  }
  public String getAbbrevation(){
    return abbrevation;
  }
  private String abbrevation;
 }
