package tanushka.studies.patterns.strategy.quackbehavior;

/**
 * <p>
 * <p>
 *
 * @author tetiana.iefimenko
 * @version $Id$
 * @see
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!Quack!Quack!");

    }
}
