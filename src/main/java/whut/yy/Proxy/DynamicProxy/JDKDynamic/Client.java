package whut.yy.Proxy.DynamicProxy.JDKDynamic;

public class Client {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java,I love you!");
    }
}
