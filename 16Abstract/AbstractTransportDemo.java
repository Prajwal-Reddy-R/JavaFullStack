

abstract class Transport {
    String energySource;
    int capacity;

    Transport(String energySource, int capacity) {
        this.energySource = energySource;
        this.capacity = capacity;
    }

    
    abstract void ignite();
}


class Bus extends Transport {
    public Bus(String energySource, int capacity) {
        super(energySource, capacity);
    }

    @Override
    void ignite() {
        System.out.println("Bus carries " + capacity + " passengers and runs on " + energySource);
    }
}


class Scooter extends Transport {
    public Scooter(String energySource, int capacity) {
        super(energySource, capacity);
    }

    @Override
    void ignite() {
        System.out.println("Scooter carries " + capacity + " passengers and runs on " + energySource);
    }
}


public class AbstractTransportDemo {
    public static void main(String[] args) {
        Bus cityBus = new Bus("Diesel", 40);
        Scooter electricScooter = new Scooter("Electric", 2);

        cityBus.ignite();
        electricScooter.ignite();
    }
}
