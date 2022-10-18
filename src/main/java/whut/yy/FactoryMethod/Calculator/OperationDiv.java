package whut.yy.FactoryMethod.Calculator;


public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        //除数为0结果为infinity
        result = getNumberA() / getNumberB();
        return result;

//        double result = 0;
//        if (getNumberB() != 0)
//            result = getNumberA() / getNumberB();
//        else
//            throw new Exception("除数不能为0");
//        return result;
    }
}
