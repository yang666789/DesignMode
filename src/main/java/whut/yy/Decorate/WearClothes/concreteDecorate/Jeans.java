package whut.yy.Decorate.WearClothes.concreteDecorate;

import whut.yy.Decorate.WearClothes.Finery;

public class Jeans extends Finery {

    @Override
    public void show() {
        System.out.print("牛仔裤 ");
        super.show();
    }
}
