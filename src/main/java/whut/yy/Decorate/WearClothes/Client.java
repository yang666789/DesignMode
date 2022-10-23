package whut.yy.Decorate.WearClothes;

import whut.yy.Decorate.WearClothes.concreteDecorate.Hoodie;
import whut.yy.Decorate.WearClothes.concreteDecorate.Jeans;
import whut.yy.Decorate.WearClothes.concreteDecorate.TShirt;

public class Client {
    public static void main(String[] args) {
        Person yy = new Person("西浦杨");
        TShirt tShirt = new TShirt();
        Jeans jeans = new Jeans();
        Hoodie hoodie = new Hoodie();

        hoodie.decorate(yy);
        tShirt.decorate(hoodie);
        jeans.decorate(tShirt);

        jeans.show();
    }
}
