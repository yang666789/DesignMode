package whut.yy.Memento.FightBoss;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
//游戏角色状态管理者
//不清楚具体状态数值，只保存和设置备忘录
public class RoleStateCaretaker {

    private RoleStateMemento memento;
}
