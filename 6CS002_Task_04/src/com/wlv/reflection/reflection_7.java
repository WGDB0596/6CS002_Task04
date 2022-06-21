package com.wlv.reflection;

import java.lang.reflect.Field;

/*
 * *This experiment demonstrates that data integrity is not as solid as first
 * thought as this experiment  manages to obtain the name and value of the private
 * member. This is done by setting the accessibility flag to true. By calling
 * setAccessible(true) the code is asking to switch data hiding off.
 */

public class reflection_7 {
  
  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
    Field[] fields = s.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for (Field f : fields) {
      f.setAccessible(true);
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
        f.getType(), f.getFloat(s));
    }
    
  }

}
