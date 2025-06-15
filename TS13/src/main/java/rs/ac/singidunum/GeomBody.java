package rs.ac.singidunum;

public abstract class GeomBody {
    private String color;
    private double density;

    public GeomBody(String color, double density){
        this.color = color;
        this.density = density;
    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public abstract double calculateArea();

    public abstract double calculateVolume();

    public abstract double calculateMass();

    public int calculateDensityClass(){
        int densityClass;

        if(density > 5000){
            densityClass = 3;
        } else if(density > 3000){
            densityClass = 2;
        } else {
            densityClass = 1;
        }

        return densityClass;
    }

    @Override
    public String toString() {
        return "GeomBody{" +
                "color='" + color + '\'' +
                ", density=" + density +
                '}';
    }
}
