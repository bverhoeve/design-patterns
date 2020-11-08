package observer.weather;

public interface Subscriber {
    public void update(float temp, float humidity, float pressure);
}
