package whut.yy.Interpreter.MusicInterpreter;

//演奏速度
//每value一个节拍
public class Speed extends Expression {
    @Override
    protected void excute(String key, double value) {
        String speed;
        if (value < 500)
            speed = "快速";
        else if (value >= 1000)
            speed = "慢速";
        else
            speed = "中速";
        System.out.print(speed + " ");
    }
}
