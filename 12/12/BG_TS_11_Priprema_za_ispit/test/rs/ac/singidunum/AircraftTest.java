package rs.ac.singidunum;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class AircraftTest {

    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    @Test
    public void testCalculateTripFuelRequired(){
        IEngine engine = context.mock(IEngine.class);

        Aircraft aircraft = new Aircraft("Cesna", 4, engine);
        context.checking(new Expectations() {{
            oneOf(engine).calculateConsumption();
            will(returnValue(30.0));
        }});

        Assert.assertEquals(300.0, aircraft.calculateRequiredTripFuel(1000), 0.0);
    }
}
