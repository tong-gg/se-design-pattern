package manypatterns;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(new CountingDuckFactory());
    }
    void simulate(AbstractDuckFactory duckFactory) {
        // before using Factory Pattern
//        Quackable mallardDuck = new QuackerCounter(new MallardDuck()); // MallardDuck is decorated
//        Quackable redHeadDuck = new RedHeadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Goose is not Quackable, use Adapter Pattern
//        Goose goose = new Goose();

        // using Factory Pattern
        Quackable mallardDuck = duckFactory.createMallardDuck(); // MallardDuck is decorated
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(goose);
        System.out.println("\nDuck Simulator");

        Flock flockOfRubberDucks = new Flock();
        flockOfRubberDucks.add(rubberDuck);
        flockOfRubberDucks.add(duckFactory.createRubberDuck());
        flockOfRubberDucks.add(duckFactory.createRubberDuck());

        flockOfDucks.add(flockOfRubberDucks);
//        simulate(mallardDuck);
//        simulate(redHeadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(goose);
        simulate(flockOfDucks);
//        simulate(flockOfRubberDucks);

        System.out.println("Num quacks = " + QuackerCounter.getNumberOfQuack());
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
