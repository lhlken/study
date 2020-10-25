package com.peamo.designpatterns.reflex;

import java.lang.reflect.*;

/**
 * @author hwalong
 * @date 2018/9/22
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person = Person.class.newInstance();
        System.out.println(person);

        System.out.println(Person.class.getName());
        System.out.println(Person.class.getSimpleName());

        printField(Person.class.getFields());
        System.out.println("==========================================");
        printField(Person.class.getDeclaredFields());
        System.out.println("==========================================");
        printMethod(Person.class.getMethods());
        System.out.println("==========================================");
        printMethod(Person.class.getDeclaredMethods());
        System.out.println("==========================================");
        printConstructor(Person.class.getConstructors());
        System.out.println("==========================================");
        System.out.println(Person.class.getSuperclass());
        System.out.println("==========================================");
        printClass(Person.class.getInterfaces());
    }

    public static void printClass(Class[] clazz) {
        for(Class clz : clazz) {
            System.out.println(clz.getSimpleName());
        }
    }

    public static void printField(Field[] fields) {
        for(Field field : fields) {
            System.out.println(field.getName()+"======"+ Modifier.isPrivate(field.getModifiers())+"====="+field.getType().getSimpleName());

        }
    }

    public static void printMethod(Method[] methods) {
        for(Method method : methods) {
            System.out.println(method.getName() +"======"+method.getModifiers() +"======"+method.getReturnType().getName());
            Class[] clazz = method.getParameterTypes();
            for(Class cls:clazz) {
                System.out.println("======"+cls.getSimpleName());
            }

//            Parameter[] parameters = method.getParameters();
//            for(Parameter parameter:parameters) {
//                System.out.println("======="+parameter.getName()+"====="+parameter.getType().getSimpleName());
//            }
        }
    }

    public static void printConstructor(Constructor[] constructors) {
        for(Constructor constructor:constructors) {
            System.out.println(constructor.getName()+"======"+constructor.getModifiers()+"=======");

//            Parameter[] parameters = constructor.getParameters();
//            for(Parameter parameter:parameters) {
//                System.out.println("======="+parameter.getName()+"====="+parameter.getType().getSimpleName());
//            }
        }
    }


}
