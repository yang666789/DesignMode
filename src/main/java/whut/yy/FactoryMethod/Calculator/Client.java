package whut.yy.FactoryMethod.Calculator;

public class Client {
    public static void main(String[] args) {
//        OperatorFactory factory = new MulOperatorFactory();
        //只需要修改要生成的操作工厂子类即可
        OperatorFactory factory = new MiZhiOperatorFactory();
        Operation operation = factory.createOperation();

        operation.setNumberA(2);
        operation.setNumberB(10);
        System.out.println(operation.getResult());
    }
}
