package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(
@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
