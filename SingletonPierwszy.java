public class SingletonPierwszy {
    private static SingletonPierwszy instance = new SingletonPierwszy();

    private SingletonPierwszy() {
    }

    public static SingletonPierwszy getInstance() {
        return instance;

    }
}
