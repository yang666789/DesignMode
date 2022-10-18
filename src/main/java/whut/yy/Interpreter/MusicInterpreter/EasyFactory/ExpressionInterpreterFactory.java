package whut.yy.Interpreter.MusicInterpreter.EasyFactory;

import whut.yy.Interpreter.MusicInterpreter.Expression;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂模式
 * 创建对应的文法解释器
 */
public class ExpressionInterpreterFactory {

    // 相当于在配置文件里写好的
    // 双括号初始化
    private static final Map<String, String> Expression_CLASS_NAME = new HashMap<>() {{
        put("O", "Scale");
        put("T", "Speed");
        put("C", "Note");
        put("D", "Note");
        put("E", "Note");
        put("F", "Note");
        put("G", "Note");
        put("A", "Note");
        put("B", "Note");
        put("P", "Note");
    }};

    public static Expression createExpressionInterpreter(String key) {
        Expression expression = null;

        //region 简单工厂
//        switch (key) {
//            case "O":
//                expression = new Scale();
//                break;
//            case "T":
//                expression = new Speed();
//                break;
//            case "C":
//            case "D":
//            case "E":
//            case "F":
//            case "G":
//            case "A":
//            case "B":
//            case "P":
//                expression = new Note();
//                break;
//        }
        //endregion

        //region 简单工厂+反射
        try {
            Class<?> expressionClass = Class.forName("whut.yy.Interpreter.MusicInterpreter."
                    + Expression_CLASS_NAME.get(key));
            Constructor<?> constructor = expressionClass.getDeclaredConstructor();
            expression = (Expression) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion

        return expression;
    }
}
