package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//На свете есть океан , на океане остров , на острове дерево ,
// на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(
@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Autowired
    public Ocean1(Island2 island) {
        this.island = island;
    }

    @Autowired
    public void setIsland(Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
