package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(
//На свете есть океан , на океане остров , на острове дерево , на дереве заяц , в зайце утка
@Component
public class Rabbit4 {
    private Duck5 duck ;
    @Autowired
    public Rabbit4(Duck5 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
