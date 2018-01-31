package CoreJava.ch04;
/**
 * @author lipeng
 * @version 1.0
 */
public class ParamTest{
  public static void main(String[] args){
    /**
     * Test 1: 
     * method will not change the primitive parameters
     */
    int a=10;
    System.out.printf("Before: a=%d",a);
    tripleValue(a);
    System.out.printf("After: a=%d",a);

    /**
     * Test 2:
     * method can modify the object
     */
    Employee e=new Employee("lipeng", 16000, 1996, 8, 18);
    System.out.println("Before:"+e);
    tripleSalary(e);
    System.out.println("After:"+e);

    /**
     * Test 3:
     * Method can not attach a new object to object parameter
     * 
     */
    Employee c,d;
    c=new Employee("Carl Cracker",75000,1987,12,15);
    d=new Employee("Hary Hacker",50000,1989,10,1);
    System.out.println("Before : c is "+c+", d is "+d);
    swapEmployee(c,d);
    System.out.println("After : c is "+c+", d is "+d);

    System.out.println("So Java is call by value !");
  }
  public static void tripleValue(int x){
    x=x*3;
  }
  public static void tripleSalary(Employee e){
    e.raiseSalary(200);
  }

  public static void swapEmployee(Employee x,Employee y){
    Employee temp;
    temp=x;
    x=y;
    y=temp;
  }
}