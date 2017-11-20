package tanushka.studies.patterns.strategy.ducks;

import tanushka.studies.patterns.strategy.flybehavior.FlyBehavior;
import tanushka.studies.patterns.strategy.quackbehavior.QuackBehavior;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void perfomQuack() {
        this.quackBehavior.quack();
    }

    public void perfomFly() {
        this.flyBehavior.fly();
    }

    public void swim() {

    }

    public void display() {

    }


}
