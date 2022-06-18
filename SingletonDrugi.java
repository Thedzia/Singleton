public class SingletonDrugi {
    private static SingletonDrugi instance;

    private SingletonDrugi() {
    }

    public static SingletonDrugi getInstance() {
        if (instance == null) {
            synchronized (SingletonDrugi.class) {
                if (instance == null) {

                    instance = new SingletonDrugi();
                }

            }
        }
        return instance;
    }
}
