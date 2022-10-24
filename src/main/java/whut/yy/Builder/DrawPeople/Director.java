package whut.yy.Builder.DrawPeople;

//指挥者
//控制建造过程，用来隔离用户与建造过程的关联
public class Director {
    //region 一般写法
//    private Builder builder;

//    public Director(Builder builder) {
//        this.builder = builder;
//    }

//    public void construct() {
//        builder.buildPartA();
//        builder.buildPartB();
//    }

    //endregion

    //region 简化写法
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
    //endregion
}
