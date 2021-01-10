package com.example.davie.code.dynamicProxy;

import com.example.davie.code.dynamicProxy.impl.TeacherImpl;
import com.example.davie.code.dynamicProxy.impl.UserImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法开始执行前....");
        method.invoke(target,args);
        System.out.println("方法结束执行....");
        return null;
    }

    public static void main(String[] args) {
        UserDao userDao = new UserImpl();

        JdkProxy jdkProxy = new JdkProxy(userDao);

        ClassLoader classLoader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        UserDao user = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, jdkProxy);
        user.save();

//        TeacherImpl teacher = new TeacherImpl();
//
//        ClassLoader classLoader1 = teacher.getClass().getClassLoader();
//        Class<?>[] interfaces1 = teacher.getClass().getInterfaces();
//        TeacherImpl o = (TeacherImpl) Proxy.newProxyInstance(classLoader1, interfaces1, jdkProxy);
//         o.save();
    }
}
