package manypatterns;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{

    private List<Quackable> quackers;

    public Flock() {
        this.quackers = new ArrayList<>();
    }

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        for (Quackable duck : quackers) {
            duck.quack();
        }
    }
}
