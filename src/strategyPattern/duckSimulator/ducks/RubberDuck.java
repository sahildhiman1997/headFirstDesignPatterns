package strategyPattern.duckSimulator.ducks;

import strategyPattern.duckSimulator.duckBehaviour.flyBehaviour.NoFlyBehaviour;
import strategyPattern.duckSimulator.duckBehaviour.quackBehaviour.Squeeks;

public class RubberDuck extends Duck {


    public RubberDuck(){
        this.flyBehaviour = new NoFlyBehaviour();
        this.quackBehaviour = new Squeeks();
    }
}
