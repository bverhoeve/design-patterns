package observer.weather;

import java.util.ArrayList;

public class WeatherData implements Publisher{
	private float temperature;
	private float humidity;
    private float pressure;
    
    private ArrayList<Subscriber> subscribers;
	
	public WeatherData() {
        this.subscribers = new ArrayList<Subscriber>();
	}
	
	public void publish() {
        for (Subscriber s : this.subscribers) {
            s.update(this.temperature, this.humidity, this.pressure);
        }
	}

	public Boolean subscribe(Subscriber s) {
        this.subscribers.add(s);
        return true;
    }

    public Boolean unsubscribe(Subscriber s) {
		
        int index = this.subscribers.indexOf(s);
        
		if (index >= 0 ) {
            this.subscribers.remove(index);
            return true;
        } else {
            return false;
        }
    }

	public void measurementsChanged() {
		this.publish();	
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

	

}
