package observer.weather;
 
public interface Publisher {

    public Boolean subscribe(Subscriber s);
    public Boolean unsubscribe(Subscriber s);
    public void publish();

}