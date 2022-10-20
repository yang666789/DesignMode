package whut.yy.TemplateMethod.Paper;

/**
 * 把不变行为搬移到超类，去除子类中的重复代码来体现优势
 * 其中的抽象方法延迟到具体的子类中实现
 */
public abstract class TestPaper {

    public void templateMethod() {
        questionOne();
        questionTwo();
        questionThree();
    }

    public void questionOne() {
        System.out.println("1.下面有关JVM内存，说法错误的是？（" + answerOne() + "）\n" +
                "A.程序计数器是一个比较小的内存区域，用于指示当前线程所执行的字节码执行到了第几行，是线程隔离的\n" +
                "B.Java方法执行内存模型，用于存储局部变量，操作数栈，动态链接，方法出口等信息，是线程隔离的\n" +
                "C.方法区用于存储JVM加载的类信息、常量、静态变量、即时编译器编译后的代码等数据，是线程隔离的 // ×\n" +
                "D.原则上讲，所有的对象都在堆区上分配内存，是线程之间共享的");
    }

    public void questionTwo() {
        System.out.println("2.JAVA中，下列语句哪一个正确（" + answerTwo() + "）\n" +
                "A.class中的constructor不可省略\n" +
                "B.constructor必须与class同名，但方法不能与class同名\n" +
                "C.constructor在一个对象被new时执行\n" +
                "D.一个class只能定义一个constructor");
    }

    public void questionThree() {
        System.out.println("3.JAVA反射机制主要提供了以下哪些功能？（" + answerThree() + "）\n" +
                "A.在运行时判断一个对象所属的类\n" +
                "B.在运行时构造一个类的对象\n" +
                "C.在运行时判断一个类所具有的成员变量和方法\n" +
                "D.在运行时调用一个对象的方法");
    }

    protected abstract String answerOne();

    protected abstract String answerTwo();

    protected abstract String answerThree();
}
