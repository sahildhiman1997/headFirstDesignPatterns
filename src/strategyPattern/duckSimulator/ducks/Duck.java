package strategyPattern.duckSimulator.ducks;

import strategyPattern.duckSimulator.duckBehaviour.flyBehaviour.FlyBehaviour;
import strategyPattern.duckSimulator.duckBehaviour.quackBehaviour.QuackBehaviour;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void display() {
        System.out.println("I'm a duck");
    }
}
