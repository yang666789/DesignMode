package whut.yy.Memento.FightBoss;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //全参构造函数
//备忘录，记录游戏角色的部分属性，以便恢复使用
public class RoleStateMemento {
    private int vit;//生命值
    private int atk;//攻击力
    private int def;//防御力
}
