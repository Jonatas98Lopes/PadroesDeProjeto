import difusao.SingletonEager;
import difusao.SingletonLazy;
import difusao.SingletonLazyHolder;
import facade.Facade;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Behaviour normal = new NormalBehaviour();
        Behaviour defensive = new DefensiveBehaviour();
        Behaviour offensive = new OffensiveBehaviour();

        Robo robo = new Robo();
        robo.setBehaviour(normal);
        robo.move();
        robo.setBehaviour(defensive);
        robo.move();
        robo.setBehaviour(offensive);
        robo.move();

        // Facade

        Facade facade = new Facade();
        facade.getClient("George", "127389");


    }
}