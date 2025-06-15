package rs.ac.singidunum;

public class Cube extends GeomBody {

    private double a;

    public Cube(double a, String color, double density) {
        super(color, density);
        this.a = a;
    }

    public double getA(){
        return a;
    }
    @Override
    public double calculateArea() {
        double area = 6 * a * a;
        return area;
    }

    @Override
    public double calculateVolume() {
        double volume = a * a * a;
        return volume;
    }

    @Override
    public double calculateMass() {
        double volume = calculateVolume();
        double density = getDensity();
        double mass = volume * density;
        return mass;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }
}
