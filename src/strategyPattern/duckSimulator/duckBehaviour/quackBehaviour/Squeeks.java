package strategyPattern.duckSimulator.duckBehaviour.quackBehaviour;

import strategyPattern.duckSimulator.duckBehaviour.quackBehaviour.QuackBehaviour;

public class Squeeks implements QuackBehaviour {
    @Override
    public String quack() {
        return "SQUEEEK SQUEEK";
    }
}
