package com.interview.preparation.encapsulation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

            System.out.println("Declared Method");
           // Method reflection
            Method fieldMethod = Encapsulation.class.getDeclaredMethod("get2XAge");
            fieldMethod.setAccessible(true);

            System.out.println("Invoked method value is : "+fieldMethod.invoke(enc));

            /*
            I can not access others code like java internal code by using reflection,
            Class<?> longCache = Class.forName("java.lang.Long$LongCache");
            Field cacheField = longCache.getDeclaredField("cache");
             // This line WILL CRASH in Java 25!
            cacheField.setAccessible(true);
            */

         //   System.out.println("Get method value is : "+fieldMethod.invoke(enc,));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
