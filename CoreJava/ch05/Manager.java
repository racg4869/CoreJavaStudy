package CoreJava.ch05;

import java.util.GregorianCalendar;
import java.util.Date;
/**
 * 
 */
public class Manager extends Employee{
  private double bonus=0;
  public Manager(String aName,double s,int y,int m,int d,double b){
    super(aName,s,y,m,d);
    bonus=b;
  }
  public double getSalary(){
    double basicSalary=super.getSalary();
    return basicSalary+bonus;
  }
  public void setBonus(double b){
    bonus=b;
  }
  public String toString(){
    return "Manager@name="+this.getName()+";salary="+getSalary();
  }
  public static void main(String... args){
    Manager m=new Manager("Lipeng",400000,1996,8,18,100000);
    System.out.println(""+m);
  }
}