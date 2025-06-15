package rs.ac.singidunum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter type: ");
        int type = input.nextInt();
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter density: ");
        double density = input.nextDouble();
        System.out.println("Enter color" );
        input.nextLine();
        String color = input.nextLine().trim();
        GeomBody first;

        if(type == 1){
            first = new Sphere(a, color, density);
        } else {
            first = new Cube(a, color, density);
        }

        System.out.println("Enter type: ");
        type = input.nextInt();
        System.out.println("Enter a: ");
        a = input.nextDouble();
        System.out.println("Enter density: ");
        density = input.nextDouble();
        System.out.println("Enter color" );
        input.nextLine();
        color = input.nextLine().trim();
        GeomBody second;;

        if(type == 1){
            second = new Sphere(a, color, density);
        } else {
            second = new Cube(a, color, density);
        }

        System.out.println(first);
        System.out.println("Class: " + first.calculateDensityClass());
        System.out.println(second);
        System.out.println("Class: " + second.calculateDensityClass());
        GeomBody heavier = compareTwoObjects(first, second);
        System.out.println(heavier);
    }

    public static GeomBody compareTwoObjects(GeomBody first, GeomBody second){
        double mass1 = first.calculateMass();
        double mass2 = second.calculateMass();
        if(mass1 > mass2){
            return first;
        } else {
            return second;
        }
    }
}
