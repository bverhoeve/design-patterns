package singleton.classic;

public class Singleton {
    private static Singleton singleton; // static variable to hold the one instance 

    private Singleton() {} // the constructor is private because only the class can have access to it

    public static Singleton getInstance() { // this method gives us a way to instantiate the class
        if(singleton == null) { // create a new one if there's no instance
            singleton = new Singleton();
        }
       
        return singleton; // return it to the outside world
    }

    // Other useful methods here
}