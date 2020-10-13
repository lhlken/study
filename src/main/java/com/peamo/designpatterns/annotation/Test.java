package com.peamo.designpatterns.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author hualong.li
 * @date 2018/9/22
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        checkPerson(person);
    }

    public static void checkPerson(Person person) throws IllegalAccessException {
        Field[] fields = person.getClass().getDeclaredFields();
        for(Field  field : fields) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(NotNull.class)) {
                Annotation annotation = field.getAnnotation(NotNull.class);
                Object object = field.get(person);
                if(object == null) {
                    System.out.println(field.getName()+"====="+((NotNull) annotation).value());
                }
            }

        }

    }
}
