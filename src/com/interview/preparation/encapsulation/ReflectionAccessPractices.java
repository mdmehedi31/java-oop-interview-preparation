package com.interview.preparation.encapsulation;

import java.lang.reflect.Field;

public class ReflectionAccessPractices {

    public ReflectionAccessPractices() {
        Encapsulation enc = new Encapsulation();
        try {

            /* This is call Reflection, Normally we can not access the private property.
               But we can access an update this by using reflection,
            */

            Field field =enc.getClass().getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Value is : "+field.get(enc));
            field.set(enc, 20);

            System.out.println("Updated value is : "+field.get(enc));

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
