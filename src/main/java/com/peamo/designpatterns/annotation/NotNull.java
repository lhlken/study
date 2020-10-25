package com.peamo.designpatterns.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hwalong
 * @date 2018/9/22
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.TYPE})
public @interface NotNull {

    int id() default 0;

    String msg() default "";

    String value() default "";
}
