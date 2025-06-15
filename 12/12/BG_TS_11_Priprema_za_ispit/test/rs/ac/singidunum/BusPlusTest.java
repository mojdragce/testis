package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Test;

public class BusPlusTest {

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC1(){
        int numMonths = 1;
        double expectedResults = 0.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC2(){
        int numMonths = 5;
        double expectedResults = 5;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceLEC3(){
        int numMonths = 9;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceIEC1(){
        int numMonths = -1;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceIEC2(){
        int numMonths = 13;
        BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV1(){
        int numMonths = 0;
        double expectedResults = 0.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV2(){
        int numMonths = 1;
        double expectedResults = 0.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV3(){
        int numMonths = -1;
        double expectedResults = 0.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV4(){
        int numMonths = 11;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test // 12 ne treba da bude uvršteno u uslov
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV5(){
        int numMonths = 12;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV6(){
        int numMonths = 13;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV7(){
        int numMonths = 2;
        double expectedResults = 0.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test // 3 treba da buve uvršteno u uslov
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV8(){
        int numMonths = 3;
        double expectedResults = 5.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV9(){
        int numMonths = 4;
        double expectedResults = 5.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV10(){
        int numMonths = 5;
        double expectedResults = 5.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test // 6 treba da bude uvršteno u uslov
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV11(){
        int numMonths = 6;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceBV12(){
        int numMonths = 7;
        double expectedResults = 10.0;
        double result = BusPlus.calculateDiscountForPayingMultipleMonthsInAdvance(numMonths);
        Assert.assertEquals(expectedResults, result, 0.001);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceSC1(){
        int age = 70;
        boolean specialNeeds = true;
        BusPlus.Status status = BusPlus.Status.UNEMPLOYED;
        BusPlus.Gender gender = BusPlus.Gender.MALE;

        double expectedResult = 0.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceSC2(){
        int age = 22;
        boolean specialNeeds = false;
        BusPlus.Status status = BusPlus.Status.PREGNANT;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;

        double expectedResult = 0.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceSC3(){
        int age = 22;
        boolean specialNeeds = false;
        BusPlus.Status status = BusPlus.Status.STUDENT;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;

        double expectedResult = 960.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }

    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvanceDC4(){
        int age = 22;
        boolean specialNeeds = false;
        BusPlus.Status status = BusPlus.Status.EMPLOYED;
        BusPlus.Gender gender = BusPlus.Gender.MALE;

        double expectedResult = 3200.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvancePC5(){
        int age = 22;
        boolean specialNeeds = true;
        BusPlus.Status status = BusPlus.Status.EMPLOYED;
        BusPlus.Gender gender = BusPlus.Gender.MALE;

        double expectedResult = 0.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvancePC6(){
        int age = 70;
        boolean specialNeeds = false;
        BusPlus.Status status = BusPlus.Status.UNEMPLOYED;
        BusPlus.Gender gender = BusPlus.Gender.MALE;

        double expectedResult = 1600.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvancePC7(){
        int age = 22;
        boolean specialNeeds = true;
        BusPlus.Status status = BusPlus.Status.STUDENT;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;

        double expectedResult = 0.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }


    @Test
    public void testCalculateDiscountForPayingMultipleMonthsInAdvancePC8(){
        int age = 22;
        boolean specialNeeds = true;
        BusPlus.Status status = BusPlus.Status.PREGNANT;
        BusPlus.Gender gender = BusPlus.Gender.FEMALE;

        double expectedResult = 0.0;
        double actual = BusPlus.calculateBusPlus(age, status, gender, specialNeeds);
    }




}
