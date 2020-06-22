package com.example.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionEx {
    public static void main(String[] args) throws Exception {
        Class cls=Class.forName("com.example.reflection.Test");
        Test test= (Test) cls.newInstance();
        Method method=cls.getDeclaredMethod("setValues", int[].class);
        method.setAccessible(true);
        method.invoke(new Test(),new Object[]{null});
       /* Parameter parameter[]=method.getParameters();
        for(Parameter parameter1 : parameter){
            System.out.println(parameter1.getParameterizedType());
            System.out.println(parameter1.getName());
        }*/

    }
}
