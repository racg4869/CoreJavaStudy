package CoreJava.ch03;
/**
 * this program display a greeting from the author
 * @version 1.0 2018-01-25
 * @author lipeng
 */
public class Welcome{
  public static void main(String[] args){
    String[] greeting=new String[3];
    greeting[0]="Welcome to Core Java";
    greeting[1]="I am Lipeng";
    greeting[2]="Hope I can learn Java very Well!";

    for(String g :greeting){
      System.out.println(g);
    }
  }
}