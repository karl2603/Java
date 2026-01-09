interface LightControl{
void turnOnLight();
void turnOffLight();
}

interface TemperatureControl{
    void increaseTemp();
    void decreaseTemp();
}

interface SecurityControl{
    void cameraOn();
    void cameraOff();
}

class SmartHome implements LightControl, TemperatureControl, SecurityControl{
    @Override
    public void turnOnLight() {
        System.out.println("Light has been turned on");        
    }
    @Override
    public void turnOffLight(){
        System.out.println("Light has been turned off");
    }
    @Override
    public void increaseTemp() {
        System.out.println("Temperature has been increased");
    }
    @Override
    public void decreaseTemp(){
        System.out.println("Temperature has been decreased");
    }
    @Override
    public void cameraOn(){
        System.out.println("Camera has been turned on");
    }
    @Override
    public void cameraOff(){
        System.out.println("Camera has been turned off");
    }
}



public class MultiInheritance {
    public static void main(String args[]){
    SmartHome KarlHome = new SmartHome();
    KarlHome.turnOffLight();
    KarlHome.decreaseTemp();
    KarlHome.cameraOn();
    }
}
