package koschei.models;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Deth8 deth8 ;
    @Autowired
    public Egg6(Deth8 deth8){
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " +deth8.toString();
    }
}
