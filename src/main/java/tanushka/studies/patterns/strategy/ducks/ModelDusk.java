package tanushka.studies.patterns.strategy.ducks;

import tanushka.studies.patterns.strategy.flybehavior.FlyNoWay;
import tanushka.studies.patterns.strategy.quackbehavior.Quack;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class ModelDusk extends Duck {
    public ModelDusk() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
