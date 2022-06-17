package com.wlv.reflection;

import java.lang.reflect.Field;

public class reflection_8 {
  
  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
    Field [] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    for(Field f : fields) {
      f.setAccessible(true);
      double x = f.getDouble(s);
      x++;
      f.setDouble(s, x);
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getDouble(s));
          
    }
  }

}
