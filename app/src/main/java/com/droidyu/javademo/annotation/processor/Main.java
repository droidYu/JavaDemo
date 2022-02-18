package com.droidyu.javademo.annotation.processor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        getAnnotation(Api.class);
    }

    public static void getAnnotation(Class clazz) {
        //获取传入的.class中的所有方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            //遍历获取到到方法数组，获取每个方法中的所有注解
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                //遍历获取到的所有注解，判断注解类型，分别打印注解内容
                if (annotation instanceof GET) {
                    print("GET",method,((GET) annotation).value());
                } else if (annotation instanceof POST) {
                    print("POST",method,((POST) annotation).value());
                }
            }
        }
    }

    public static void print(String methodType,Method method, String annotationValue) {
        System.out.println("从 "+methodType+" 方法："+method.getName()+" 获取到注解的值：" + annotationValue);
    }
}
