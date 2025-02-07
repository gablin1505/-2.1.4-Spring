package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(
@Component
public class Needle7 {
    @Autowired
    private Deth8 deth8;

    @Autowired
    public Needle7(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Autowired
    public void setDeth8(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле " + deth8.toString();
    }
}
