package whut.yy.Mediator.Peace;

import lombok.Setter;

//联合国安全理事会
public class UnitedNationsSecurityCouncil implements UnitedNations {
    //具体联合国需要认识相关具体国家
    @Setter
    private USA colleague1;
    @Setter
    private Iraq colleague2;

    @Override
    public void declare(String message, Country colleague) {
        //美国发过来，伊拉克接收
        if (colleague == colleague1) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
