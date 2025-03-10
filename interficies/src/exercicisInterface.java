public class exercicisInterface {

}

interface isVehicle {
    String getName();
    void setName(String name);
    int getMaxPassengers();
    void setMaxPassengers(int maxPassengers);
    int getMaxSpeed();
    void setMaxSpeed(int maxSpeed);
}

interface IsLandVehicle {

    int getNumWheels();
    void setNumWheels(int numWheels);

}

interface IsSeaVehicle {

    int getDisplacement();
    void setDisplacement(int displacement);

}


class Jeep implements isVehicle, IsLandVehicle {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {
    }
}

class Hovercraft implements isVehicle, IsLandVehicle, IsSeaVehicle {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {
    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(int displacement) {
    }
}

class Frigate implements isVehicle, IsSeaVehicle {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(int displacement) {
    }
}




