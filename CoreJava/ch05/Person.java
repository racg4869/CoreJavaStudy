package CoreJava.ch05;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author lipeng
 * @version 1.0 2018-01-29
 */
public class Person{
  private String name;
  public Person(){
    System.out.println("Person() : do  nothing!");
  }
  public Person(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public String toString(){
    return "Person@name="+name;
  }
  public static void main(String[] args) {
      Person[] pep=new Person[3];
      pep[0]=new Person("lipeng");
      pep[1]=new Employee("lipeng", 400000, 1996, 8, 18);
      pep[2]=new Manager("lipeng", 400000, 1996, 8, 18,10000);

      //dynamic binding
      for(Person p:pep){
        System.out.println(p.toString());
      }

      System.out.println(pep[2] instanceof Person);
  }
}