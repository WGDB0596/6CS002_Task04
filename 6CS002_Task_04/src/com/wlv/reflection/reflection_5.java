package com.wlv.reflection;

import java.lang.reflect.Field;

public class reflection_5 {

  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
    
    //use .getDeclaredFields() instead of .getFields() 
    
    Field [] fields =  s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getDouble(s));
      
    }
  }
}
