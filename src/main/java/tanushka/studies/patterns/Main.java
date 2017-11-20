package tanushka.studies.patterns;

import tanushka.studies.patterns.strategy.ducks.MallardDuck;
import tanushka.studies.patterns.strategy.ducks.ModelDusk;
import tanushka.studies.patterns.strategy.flybehavior.FlyRocketPowered;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class Main {
    public static void main(String[] args) {
        callStrategy();
    }

    private static void  callStrategy() {
        final MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.perfomFly();
        mallardDuck.performQuack();

        final ModelDusk modelDusk = new ModelDusk();
        modelDusk.perfomFly();
        modelDusk.performQuack();
        modelDusk.setFlyBehavior(new FlyRocketPowered());
        modelDusk.perfomFly();
    }

    private static void  callObserver() {

    }

    private static void  callDecorator() {

    }
}
