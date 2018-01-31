package CoreJava.ch05;

import java.lang.reflect.*;
import java.util.Date;

/**
 * detect the detail of an object
 * @author lipeng
 * @version 1.0
 */
public class ObjectAnalyzer{
  public static void main(String[] args){
    ObjectAnalyzer oa=new ObjectAnalyzer(new Date());

    Person p=(Person )new Manager("Lipeng",400000,1996,8,18,100000);
    Class cls=p.getClass();
    try{
      Field f=cls.getField("bonus"); 
      f.get(p);
    }catch(Exception e){
      e.printStackTrace();
    }

  }
  public ObjectAnalyzer(Object obj){
    Class cls=obj.getClass();
    ReflectTest.main(new String[]{cls.getName(),});
    for(Constructor c:cls.getDeclaredConstructors()){

    }
  }
}