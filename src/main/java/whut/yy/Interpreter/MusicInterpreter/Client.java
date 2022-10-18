package whut.yy.Interpreter.MusicInterpreter;

import whut.yy.Interpreter.MusicInterpreter.EasyFactory.ExpressionInterpreterFactory;

public class Client {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        //音乐-上海滩
        System.out.println("上海滩：");
        String music = "T 499 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 " +
                "A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        context.setText(music);
        while (context.getText().length() > 0) {
            //region 找到不同的文法解释器解释
            String key = context.getText().substring(0, 1);
            Expression expression = ExpressionInterpreterFactory.createExpressionInterpreter(key);
            expression.interpret(context);
            //endregion
        }
    }
}
