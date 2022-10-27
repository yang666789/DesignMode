package whut.yy.Mediator.Peace;

//抽象国家
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

}
