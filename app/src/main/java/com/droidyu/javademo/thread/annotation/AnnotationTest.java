package com.droidyu.javademo.thread.annotation;

@MyAnnotation("no value")
//@MyMethod //这里会报错，编译不能通过
public class AnnotationTest {
    @MyMethod //正确的使用位置
    public void method() {

    }
}
