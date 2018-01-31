package CoreJava.ch04;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author lipeng
 * @version 1.0 20118-01-28
 */
public class Employee{
  public Employee(String n,double s,int year,int month,int day){
    id=nextId++;
    name=n;
    salary=s;
    GregorianCalendar g=new GregorianCalendar(year,month-1,day);
    hireDay=g.getTime();
  }
  
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  // 可变对象的获取一定要使用clone 
  // 不然会破坏封装性
  public Date getHireday(){
    //return hireDay;
    return (Date) hireDay.clone();
  }
  public void raiseSalary(double p){
    salary+=salary*p/100;
  }
  public boolean equal(Employee other){
    return name.equals(other.name);
  }
  public int getId(){
    return id;
  }
  public static int getNextId(){
    return nextId;
  }
  public String toString(){
    return "name="+name+",id="+id+",salary="+salary+",hireDay="+hireDay;
  }
  private final int id;
  private static int nextId=1;
  private  String name;
  private  double salary;
  private  Date hireDay;
  
  // main方法是可以用于测试
  public static void main(String[] args){
    Employee[] staff=new Employee[3];
    staff[0]=new Employee("Carl Cracker",75000,1987,12,15);
    staff[1]=new Employee("Hary Hacker",50000,1989,10,1);
    staff[2]=new Employee("Tony Tester",40000,1990,3,15);

    for(Employee e:staff){
      e.raiseSalary(5);
    }

    for(Employee e:staff){
      System.out.printf("name=%s,id=%d,salary=%f,hireDay=%s\n",e.getName(),e.getId(),e.getSalary(),e.getHireday().toString());
    }
  }

}