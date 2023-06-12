package whut.yy.Proxy.DynamicProxy.CGLibDynamic;

public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
