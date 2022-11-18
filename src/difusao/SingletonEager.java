package difusao;

public class SingletonEager {
        private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static difusao.SingletonEager getInstancia() {
            return instancia;
    }
}
