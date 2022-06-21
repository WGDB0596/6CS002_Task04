package com.wlv.reflection;

import java.lang.reflect.Field;

/*

When this code is run it prints details of a single field, an integer called a
with value 10.
The private access modifier has stopped details of the b field from being revealed.
  This shows data hiding is working an Java is good
  at maintaining data integrity.
 */

public class reflection_4 {

  public static void main(String[] args) throws Exception{
    Simple s = new Simple();
      Field[] fields = s.getClass().getFields();
      System.out.printf("There are %d fields\n", fields.length);
      for(Field f : fields) {
        System.out.printf("field name=%s type=%s value=%d\n", f.getName(), f.getType(), f.getFloat(s));
    }
  }
  
}


