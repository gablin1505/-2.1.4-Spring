package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(



//На свете есть океан , на океане остров , на острове дерево , на дереве заяц , в зайце утка

/// На свете есть океан , на океане остров , на острове дерево , на дереве заяц , в зайце утка
@Component
public class Duck5 {
    private Egg6 egg6;
    @Autowired
    public Duck5(Egg6 egg6) {
        this.egg6 = egg6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}
