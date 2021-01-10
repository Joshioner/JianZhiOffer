package com.example.davie.code.dynamicProxy;

//import org.springframework.cglib.proxy.Callback;
//import org.springframework.cglib.proxy.Enhancer;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class CglibProxy implements MethodInterceptor {
//    private static CglibProxy cglibProxy= new CglibProxy();
//
//    public CglibProxy(){
//
//    }
//
//    public static CglibProxy getInstance(){
//        return cglibProxy;
//    }
//
//
//
//    public void before(){
//        System.out.println("调用前----");
//    }
//
//    public void after(){
//        System.out.println("调用后----");
//    }
//
//    public <T> T getProxy(Class<T> tClass){
//        return (T) Enhancer.create(tClass, (Callback) this);
//    }
//
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        before();
//        Object o1 = methodProxy.invokeSuper(o, objects);
//        after();
//
//        return o1;
//    }
//}
//
