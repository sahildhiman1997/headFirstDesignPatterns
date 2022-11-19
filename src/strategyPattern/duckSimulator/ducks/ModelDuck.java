package strategyPattern.duckSimulator.ducks;

import strategyPattern.duckSimulator.duckBehaviour.flyBehaviour.NoFlyBehaviour;
import strategyPattern.duckSimulator.duckBehaviour.quackBehaviour.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehaviour = new NoFlyBehaviour();
        quackBehaviour = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a model duck");
    }
}
