package whut.yy.Proxy.DynamicProxy.JDKDynamic;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    /**
     * 返回代理对象
     */
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new MyInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}
