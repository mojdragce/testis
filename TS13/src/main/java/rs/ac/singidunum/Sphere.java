package rs.ac.singidunum;

public class Sphere extends GeomBody {

    public static final double PI = 3.14;
    private double r;

    public Sphere(double r, String color, double density) {
        super(color, density);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea() {
        double area = 4 * r * r * PI;
        return area;
    }

    @Override
    public double calculateVolume() {
        double volume = 4 * r * r * r * PI /3;
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
        return "Sphere{" +
                "r=" + r +
                '}';
    }
}
