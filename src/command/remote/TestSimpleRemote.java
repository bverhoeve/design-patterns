package command.remote;

public class TestSimpleRemote {

    public static void main(String[] args) {    
        Light light = new  Light("Kitchen");
        LightOnCommand lightsOn = new LightOnCommand(light);
        SimpleRemote remote = new SimpleRemote();
        
        remote.setCommand(lightsOn);
        remote.buttonPressed();

        GarageDoor garage = new GarageDoor("Basement");
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garage);
        remote.setCommand(garageUp);
        remote.buttonPressed();
    }
}
