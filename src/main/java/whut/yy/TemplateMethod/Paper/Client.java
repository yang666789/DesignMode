package whut.yy.TemplateMethod.Paper;

public class Client {
    public static void main(String[] args) {
        TestPaper paper;

        paper = new StudentA();
        paper.templateMethod();

        System.out.println();

        paper = new StudentB();
        paper.templateMethod();
    }
}
