package strategyPattern.duckSimulator.duckBehaviour.flyBehaviour;

import strategyPattern.duckSimulator.duckBehaviour.flyBehaviour.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly. ");
    }
}
