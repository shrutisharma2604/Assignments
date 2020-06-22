package com.example.springscope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    "Scope.xml");
            Scope scope = (Scope) context.getBean("scopeTest");
            Scope scopeDuplicate = (Scope) context.getBean("scopeTestDuplicate");
            System.out.println(scope == scopeDuplicate);
            System.out.println(scope + "::" + scopeDuplicate);
        }
}
