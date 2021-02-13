package singleton.threadsafe;

public class DoubleCheckLockedSingleton {
    
    private static volatile DoubleCheckLockedSingleton singleton;

    private DoubleCheckLockedSingleton() {}

    public static DoubleCheckLockedSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLockedSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLockedSingleton();
                    
                }
            }
        }
        return singleton;
    }
}
