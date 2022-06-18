public class SingletonPrzyklad {
    public static void main(String[] args) {
        SingletonDrugi instance = SingletonDrugi.getInstance();

        System.out.println(instance);

        SingletonDrugi instance1 = SingletonDrugi.getInstance();

        System.out.println(instance1);
    }

}
