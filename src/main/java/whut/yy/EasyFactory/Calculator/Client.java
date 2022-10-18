package whut.yy.EasyFactory.Calculator;

public class Client {

    public static void main(String[] args) throws Exception {
//        Operation oper = OperationFactory.getOperation("MiZhi");
        Operation oper = OperationFactory.getOperation("/");
        oper.setNumberA(2);
        oper.setNumberB(0);
        System.out.println("计算结果为:" + oper.getResult());
    }
}
