package rs.ac.singidunum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {

    private Cube cube;

    @Before
    public void setUp() {
        cube = new Cube(2.0, "red", 3.0);
    }

    @Test
    public void testGetA() {
        assertEquals(2.0, cube.getA(), 0.001);
    }

    @Test
    public void testCalculateArea() {
        double expectedArea = 6 * 2.0 * 2.0; // 24.0
        assertEquals(expectedArea, cube.calculateArea(), 0.001);
    }

    @Test
    public void testCalculateVolume() {
        double expectedVolume = 2.0 * 2.0 * 2.0; // 8.0
        assertEquals(expectedVolume, cube.calculateVolume(), 0.001);
    }

    @Test
    public void testCalculateMass() {
        double expectedMass = 8.0 * 3.0; // volume * density = 24.0
        assertEquals(expectedMass, cube.calculateMass(), 0.001);
    }

    @Test
    public void testToString() {
        String expected = "Cube{a=2.0}";
        assertEquals(expected, cube.toString());
    }
}
