package whut.yy.Adapter.BasketballTranslator;

//外籍球员，姚明
//老接口，待适配的接口
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jinGong(){
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void fangShou(){
        System.out.println("外籍中锋" + name + "防守");
    }

}
