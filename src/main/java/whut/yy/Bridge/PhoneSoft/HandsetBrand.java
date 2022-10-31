package whut.yy.Bridge.PhoneSoft;

import lombok.Setter;

public abstract class HandsetBrand {
    @Setter
    protected HandsetSoft soft;//聚合关系

    public abstract void run();//运行

}
