package whut.yy.Mediator.Peace;

public class Client {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();
        //具体国家需要认识中介者
        USA usa = new USA(securityCouncil);
        Iraq iraq = new Iraq(securityCouncil);

        //中介者需要认识具体国家
        securityCouncil.setColleague1(usa);
        securityCouncil.setColleague2(iraq);

        //具体国家通过中介进行交互
        usa.declare("不准研制核武器，否则要发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略。");
    }
}
