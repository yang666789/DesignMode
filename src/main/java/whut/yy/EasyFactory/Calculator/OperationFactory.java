package whut.yy.EasyFactory.Calculator;

public class OperationFactory {
    public static Operation getOperation(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            case "MiZhi":
                oper = new OperationMiZhi();
                break;
        }
        return oper;
    }
}
