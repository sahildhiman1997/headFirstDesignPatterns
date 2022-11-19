package strategyPattern.duckSimulator;

import strategyPattern.duckSimulator.duckBehaviour.flyBehaviour.FlyRocketPowered;
import strategyPattern.duckSimulator.ducks.Duck;
import strategyPattern.duckSimulator.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
