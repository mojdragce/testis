package rs.ac.singidunum;

public class Aircraft {
    private String name;

    private int passengers;

    private IEngine engine;

    public Aircraft(String name, int passengers, IEngine engine){
        this.name = name;
        this.passengers = passengers;
        this.engine = engine;
    }

    public double calculateRequiredTripFuel(int trip){
        return (engine.calculateConsumption() / 100) * trip;
    }
}
