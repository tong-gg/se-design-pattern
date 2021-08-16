package manypatterns;

public class QuackerCounter implements Quackable{

    private Quackable duck;
    private static int numberOfQuack;

    public QuackerCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}
