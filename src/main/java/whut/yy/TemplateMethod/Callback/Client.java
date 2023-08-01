package whut.yy.TemplateMethod.Callback;


/**
 * @author gagayang
 * @description
 * @date 2023/7/29
 */
public class Client {
    public static void main(String[] args) {
        TestPaper testPaper = new TestPaper();

        AnswerOneCallback oneCallback = () -> "C";
        AnswerTwoCallback twoCallback = () -> "C";
        AnswerThreeCallback threeCallback = () -> "ABCD";

        testPaper.templateMethod(oneCallback, twoCallback, threeCallback);
    }
}
