package tanushka.studies.patterns.strategy.ducks;

import tanushka.studies.patterns.strategy.flybehavior.FlyWithWings;
import tanushka.studies.patterns.strategy.quackbehavior.Quack;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
}
