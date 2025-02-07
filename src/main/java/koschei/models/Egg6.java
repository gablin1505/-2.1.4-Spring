package koschei.models;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    @Autowired
    private Needle7 needle7;

    @Autowired
    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Autowired
    public void setNeedle7(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
