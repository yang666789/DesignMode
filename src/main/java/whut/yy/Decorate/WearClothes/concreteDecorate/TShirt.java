package whut.yy.Decorate.WearClothes.concreteDecorate;

import whut.yy.Decorate.WearClothes.Finery;

/**
 * 具体装饰类
 */
public class TShirt extends Finery {

    @Override
    public void show() {
        System.out.print("T恤 ");
        super.show();
    }
}
