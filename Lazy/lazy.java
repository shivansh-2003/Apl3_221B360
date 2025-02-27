public class LazySingleton {
    private LazySingleton() {
        // private constructor to prevent instantiation
    }

    private static class Holder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return Holder.INSTANCE;
    }
}
