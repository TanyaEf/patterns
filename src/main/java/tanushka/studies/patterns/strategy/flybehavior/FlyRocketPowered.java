package tanushka.studies.patterns.strategy.flybehavior;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I;m flying as a rocket!!!");
    }
}
