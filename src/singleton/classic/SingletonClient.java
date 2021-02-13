package singleton.classic;

public class SingletonClient {
    public static void main(String [] args) {

        Singleton single = Singleton.getInstance();

        Singleton dubbel = Singleton.getInstance();
        System.out.println(single);
        System.out.println(dubbel);
    }
}
