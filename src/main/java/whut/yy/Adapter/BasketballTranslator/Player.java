package whut.yy.Adapter.BasketballTranslator;

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();//进攻
    public abstract void defense();//防守
}
