package singleton.threadsafe;

public class SyncSingleton {

    private static SyncSingleton singleton; // static variable to hold the one instance 
    
    private SyncSingleton() {} // the constructor is private because only the class can have access to it
    
    public synchronized static SyncSingleton getInstance() { // this method gives us a way to instantiate the class
        if(singleton == null) { // create a new one if there's no instance
            singleton = new SyncSingleton();
        }
           
    return singleton; // return it to the outside world
    }
    
        // Other useful methods here
}
