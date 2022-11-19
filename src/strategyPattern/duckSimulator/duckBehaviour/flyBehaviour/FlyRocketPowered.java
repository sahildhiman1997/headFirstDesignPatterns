package strategyPattern.duckSimulator.duckBehaviour.flyBehaviour;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println( "Flying rocket powered");
    }
}
