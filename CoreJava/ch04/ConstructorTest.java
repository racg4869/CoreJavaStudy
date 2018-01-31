package CoreJava.ch04;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A program used to test the Constructor
 * @author lipeng
 * @version 1.0 2018-1-28
 */
public class ConstructorTest{
  public static void main(String[] args){
    Employee e1=new Employee("Lipeng",400000,1996,8,18);
    Employee e2=new Employee("Lipeng",400000,1996,8,18);
    System.out.println(e1+"\n"+e2);
  }
}
class Employee{
  private static int nextId;
  private int id;
  private String name;
  private double salary;
  private Date hiredate;

  // static initialization block
  static
  {
    nextId=1;
  }
  // object initialization block
  {
    id=nextId++;
  }
  public Employee(String n,double s,int y,int m,int d){
    name=n;
    salary=s;
    hiredate=(new GregorianCalendar(y,m-1,d)).getTime();
  }
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public Date getDate(){
    return (Date)hiredate.clone();
  }
  public void raiseSalary(double p){
    double raise=salary*p/100;
    salary+=raise;
  }
  public String toString(){
    return "id="+id+";name="+name+";hiredate="+hiredate;
  }
}