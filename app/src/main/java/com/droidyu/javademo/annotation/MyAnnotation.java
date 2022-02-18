package com.droidyu.javademo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "droidYu";
    int age() default  0;
    String value();
}
