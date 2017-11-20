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
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public Duck setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }

    public Duck setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void perfomFly() {
        this.flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks can swim");
    }

    public abstract void display();

}
