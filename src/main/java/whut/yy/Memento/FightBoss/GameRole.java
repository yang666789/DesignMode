package whut.yy.Memento.FightBoss;

import lombok.Data;

//游戏角色
@Data
public class GameRole {
    private int vit;//生命值
    private int atk;//攻击力
    private int def;//防御力

    //保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色状态
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    //显示状态
    public void showState() {
        System.out.println(toString());
    }

    //初始化状态(打boss前)
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗状态(模拟打boss)
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
}
