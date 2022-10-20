package whut.yy.TemplateMethod.Paper;

public class StudentB extends TestPaper {
    @Override
    protected String answerOne() {
        return "C";
    }

    @Override
    protected String answerTwo() {
        return "C";
    }

    @Override
    protected String answerThree() {
        return "ABCD";
    }
}
