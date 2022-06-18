public class SingletonMetoda {
    private static SingletonMetoda instance;

    private SingletonMetoda() {
    }

    public static synchronized SingletonMetoda getInstance() {
        if (instance == null) {
            instance = new SingletonMetoda();
        }
        return instance;
    }

}
