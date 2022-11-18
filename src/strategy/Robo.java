package strategy;

public class Robo {
    private Behaviour behaviour;

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
    public void move() {
        behaviour.move();
    }
}
