package whut.yy.Interpreter.MusicInterpreter;

public abstract class Expression {
    //解释器
    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        } else {
            //region 处理信息
            String playKey = context.getText().substring(0, 1);//截取第一个字母
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            double playValue = Double.parseDouble(context.getText().substring(0, 1));//截取参数值
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            //endregion

            excute(playKey, playValue);
        }
    }

    //执行
    protected abstract void excute(String key, double value) ;
}
