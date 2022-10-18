package whut.yy.Adapter.BasketballTranslator;

//外籍球员的翻译
//适配器：教练和外籍球员都可以听懂对方的话
public class Translator extends Player {
    private ForeignCenter center = new ForeignCenter();

    public Translator(String name) {
        super(name);
        center.setName(name);
    }

    @Override
    public void attack() {
        center.jinGong();
    }

    @Override
    public void defense() {
        center.fangShou();
    }
}
