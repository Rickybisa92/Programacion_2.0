public class Bycicle {
    final int MAX_GEAR = 7;

    double wheelSize = 27; //pulgadas del diametro de la rueda
    double ratios[] = new double[MAX_GEAR]; //relacion de cambio de marcha

    String name; // nombre de la bicicleta
    int gear = 1; // marcha de la bicicleta
    int speed; // velocidad de la bicileta
    int cadence; // velocidad de los pedales

    Bycicle(double[] ratios, String name) {
        this.ratios = ratios;
        this.name = name;
    }

    void brake() {
        if (this.speed < 10) {
            this.speed = 0;
        } else {
            this.speed = this.speed - 10;
        }
    }

    void changeGearUp() {
        if (this.gear < MAX_GEAR) {
            this.gear++;
        }
    }

    void changeGearDown() {
        if (this.gear > 1) {
            this.gear--;
        }
    }

    void changeCadence(int cadence) {
        this.cadence = cadence;
        double rpm2 = this.ratios[this.gear - 1] * cadence;
        double rad = (this.wheelSize) * 2.54 / 2;
        double circ = 2 * Math.PI * rad;
        double velCmPorMinut = circ * rpm2;
        double velKmPorMinut = velCmPorMinut / 100000;
        double velKmPorHora = velKmPorMinut * 60;
        this.speed = (int) velKmPorHora;

    }

    void printStates() {
        System.out.printf("cadence: %d, speed: %d, gear: %d\n", this.cadence, this.speed, this.gear);
    }

    void setRatios(double[] ratios) {
        this.ratios = ratios;
    }

    public static void main(String[] args) {
    Bycicle bike1 = new Bycicle(new double[]{1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0}, "Bike1");
    bike1.changeCadence(80);
    bike1.changeGearUp();
    bike1.changeGearUp();
    bike1.changeCadence(80);
    bike1.printStates();
    bike1.brake();
    bike1.printStates();

        System.out.println("--------------------------------------------------");

    Bycicle bikeCPU = new Bycicle(new double[]{1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0}, "BikeCPU");
    bikeCPU.changeGearUp();
    bikeCPU.changeGearUp();
    bikeCPU.changeCadence(80);
    bikeCPU.printStates();
    bikeCPU.brake();
    bikeCPU.printStates();
    }

}
