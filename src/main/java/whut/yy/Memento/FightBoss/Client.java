package whut.yy.Memento.FightBoss;

public class Client {

    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.initState();//打boss前状态
        lixiaoyao.showState();

        //保存至备忘录,客户端并不知道具体数值
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(lixiaoyao.saveState());

        //打boss中
        lixiaoyao.fight();
        lixiaoyao.showState();

        //恢复状态
        lixiaoyao.recoveryState(caretaker.getMemento());
        lixiaoyao.showState();
    }
}
