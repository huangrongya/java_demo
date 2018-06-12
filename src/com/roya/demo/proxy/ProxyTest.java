package com.roya.demo.proxy;

import com.roya.demo.designPattern.proxy.Source;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler{

    private Object target;

    /**
     * describe: 绑定委托对象
     * create by huangrongya
     * 2018/6/12 0012 14:04
     **/
    public Object bind(Object target, Class[] interfaces){
        this.target = target;
        //取得代理对对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理..............");
        Object result = null;
        System.out.println("i am going to say 'hello'");
        result = method.invoke(target, args);
        System.out.println("代理执行完成.....");
        return result;
    }
}
