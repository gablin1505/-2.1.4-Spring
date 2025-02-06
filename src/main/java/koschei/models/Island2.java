package koschei.models;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(
public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
