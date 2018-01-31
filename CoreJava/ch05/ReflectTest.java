package CoreJava.ch05;

import java.util.*;
import java.lang.reflect.*;

/**
 * test reflect in java
 * @author lipeng
 * @version 1.0 2018-1-30
 */
public class ReflectTest{
  public static void main(String[] args){
    String name;
    if(args.length>0){
      name=args[0];
    }else{
      System.out.print("Enter the class name:");
      Scanner in=new Scanner(System.in);
      name=in.next();
    }

    try {
      Class cls=Class.forName(name);
      printClassdetail(cls);
      // only can used for constructor with no explicitly parameter
      Object obj=cls.newInstance();
      System.out.println("new a object with class:"+obj.getClass());
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public static void printClassdetail(Class cls){
    printModifiers(cls);
    System.out.println(" class "+cls.getName()+"{");
    printConstructor(cls);
    printMethods(cls);
    printFields(cls);
    System.out.println("}");
  }
  /**
   * print modifiers of a class
   */
  public static void printModifiers(Class cls){
    String ms=Modifier.toString(cls.getModifiers());
    if(ms.length()>0){
      System.out.print(ms);
    }
  }
  /**
   * print all the constructors of a class
   */
  public static void printConstructor(Class cls){
    Constructor[] constructors=cls.getConstructors();

    for(Constructor c:constructors){
      System.out.print("\t");
      String ms=Modifier.toString(c.getModifiers());
      if(ms.length()>0){
        System.out.print(ms+" ");
      }
      String name=c.getName();
      System.out.print(name+"(");
      Class[] paramtypes=c.getParameterTypes();
      for(int i=0;i<paramtypes.length;i++){
        Class t=paramtypes[i];
        if(i>0){
          System.out.print(",");
        }
        System.out.print(t.getName()+" ");
      }
      System.out.println(");");
    }
  }
  /**
   * print all the methods of a class
   */
  public static void printMethods(Class cls){
    for(Method m:cls.getMethods()){
      System.out.print("\t");
      String modifiers=Modifier.toString(m.getModifiers());
      if(modifiers.length()>0){
        System.out.print(modifiers+" ");
      }
      System.out.print(m.getReturnType().getName()+" "+m.getName()+"(");
      Class[] paramtypes=m.getParameterTypes();
      for(int i=0;i<paramtypes.length;i++){
        Class t=paramtypes[i];
        if(i>0){
          System.out.print(",");
        }
        System.out.print(t.getName()+"");
      }
      System.out.println(");");
    }
  }
  /**
   * print all the filds of class
   */
  public static void printFields(Class cls){
    Field[] fs=cls.getDeclaredFields();
    for(Field f:fs){
      System.out.print("\t");
      String ms=Modifier.toString(f.getModifiers());
      if(ms.length()>0){
        System.out.print(ms+" ");
      }
      System.out.println(f.getType().getName()+" "+f.getName()+";");
    }
  }
}