package whut.yy.Interpreter.MusicInterpreter;

//音阶
public class Scale extends Expression {
    @Override
    protected void excute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}
