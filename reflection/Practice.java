package com.example.reflection;
import java.lang.reflect.Method;

class Demo{

    public int add(int a,int b){
        return a+b;
    }

}
public class Practice {

    public static void main(String[] args) {
        Demo demo=new Demo();
        Class cls=demo.getClass();
        System.out.println("Class Name is= " + cls.getName());
        Method[] method=cls.getDeclaredMethods();
        for (Method method1:method)
            System.out.println(method1.getName());
    }
}
