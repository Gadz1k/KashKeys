import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    //Add

    @Test
    public void fourPlusTwoShouldReturnSix(){
        Main main = new Main(4,2);
        assertEquals(6,main.add());
    }

    @Test
    public void threePlusMinusFiveShouldReturnMinusTwo(){
        Main main = new Main(3,-5);
        assertEquals(-2,main.add());
    }

    @Test
    public void minusThirteenPlusMinusEightShouldReturnMinusTwentyOne(){
        Main main = new Main(-13,-8);
        assertEquals(-21,main.add());
    }

    @Test
    public void fifteenPlusZeroShouldReturnFifteen(){
        Main main = new Main(15,0);
        assertEquals(15,main.add());
    }

    @Test
    public void minusTwoPlusZeroShouldReturnMinusTwo(){
        Main main = new Main(-2,0);
        assertEquals(-2,main.add());
    }

    @Test
    public void threePointThirtyThreePlusFourPointFortyFourShouldReturnSevenPointSeventySeven(){
        Main main = new Main(3.33,4.44);
        assertEquals(7.77,main.add());
    }

    @Test
    public void minusTwoPointFiftyPlusMinusOneShouldReturnThreePointFifty(){
        Main main = new Main(-2.50,-1);
        assertEquals(-3.50,main.add());
    }

    @Test
    public void fourPointFortyFivePlusZeroShouldReturnFourPointFortyFive(){
        Main main = new Main(4.45,0);
        assertEquals(4.45,main.add());
    }

    @Test
    public void zeroPlusZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.add());
    }

    //Substract

    @Test
    public void nineteenMinusSixShouldReturnThirteen(){
        Main main = new Main(19,6);
        assertEquals(13,main.substract());
    }

    @Test
    public void fourMinusMinusSixShouldReturnTwo(){
        Main main = new Main(4,-6);
        assertEquals(10,main.substract());
    }

    @Test
    public void minusFourteenMinusMinusNineShouldReturnMinusTwentyThree(){
        Main main = new Main(-14,-9);
        assertEquals(-5,main.substract());
    }

    @Test
    public void sixteenMinusZeroShouldReturnSixteen(){
        Main main = new Main(16,0);
        assertEquals(16,main.substract());
    }

    @Test
    public void minusThreeMinusZeroShouldReturnMinusThree(){
        Main main = new Main(-3,0);
        assertEquals(-3,main.substract());
    }

    @Test
    public void fourPointFortyFourMinusFivePointFiftyFiveShouldReturnMinusOnePointEleven(){
        Main main = new Main(4.45,5.55);
        assertEquals(-1.10,main.substract());
    }

    @Test
    public void minusThreePointFiftyPlusMinusOneShouldReturnThreePointFifty(){
        Main main = new Main(-3.50,-2);
        assertEquals(-1.50,main.substract());
    }

    @Test
    public void fivePointFiftyFiveMinusZeroShouldReturnFivePointFiftyFive(){
        Main main = new Main(5.55,0);
        assertEquals(5.55,main.substract());
    }

    @Test
    public void zeroMinusZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.substract());
    }

    //multiply

    @Test
    public void sixMultipliedByFourShouldReturnTwentyFour(){
        Main main = new Main(6,4);
        assertEquals(24,main.multiply());
    }

    @Test
    public void twoMultipliedByMinusFourShouldReturnMinusEight(){
        Main main = new Main(2,-4);
        assertEquals(-8,main.multiply());
    }

    @Test
    public void minusTwelveMultipliedByMinusSevenShouldReturnEightyFour(){
        Main main = new Main(-12,-7);
        assertEquals(84,main.multiply());
    }

    @Test
    public void eightMultipliedByZeroShouldReturnZero(){
        Main main = new Main(8,0);
        assertEquals(0,main.multiply());
    }

    @Test
    public void minusTwoMultipliedByZeroShouldReturnZero(){
        Main main = new Main(-2,0);
        assertEquals(0,main.multiply());
    }

    @Test
    public void threePointFortyMultipliedByTwoPointTwentyFiveShouldReturnSevenPointSixtyFive(){
        Main main = new Main(3.40,2.25);
        assertEquals(7.65,main.multiply());
    }

    @Test
    public void minusTwoPointSeventyMultipliedByMinusFourShouldReturnTenPointEighty(){
        Main main = new Main(-2.70,-4);
        assertEquals(10.80,main.multiply());
    }

    @Test
    public void threePointSixtyFiveMultipliedByZeroShouldReturnZero(){
        Main main = new Main(3.65,0);
        assertEquals(0,main.multiply());
    }

    @Test
    public void zeroMultipliedByZeroShouldReturnZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.multiply());
    }

    //divide

    @Test
    public void eightDividedBySixShouldReturn(){
        Main main = new Main(8,6);
        assertEquals(1.33,main.divide());
    }

    @Test
    public void thirtySixDividedBySixShouldReturnSix(){
        Main main = new Main(36,6);
        assertEquals(6,main.divide());
    }

    @Test
    public void fourDividedByMinusSixShouldReturnMinusZeroPointSixtySix(){
        Main main = new Main(4,-6);
        assertEquals(-0.67,main.divide());
    }

    @Test
    public void minusFourteenDividedByMinusElevenShouldReturnOnePointTwentySeven(){
        Main main = new Main(-14,-11);
        assertEquals(1.27,main.divide());
    }

    @Test
    public void sevenDividedByZeroShouldReturnNaN(){
        Main main = new Main(7,0);
        assertEquals(NaN,main.divide());
    }

    @Test
    public void minusThreeDividedByZeroShouldReturnNaN(){
        Main main = new Main(-3,0);
        assertEquals(NaN,main.divide());
    }

    @Test
    public void fivePointFortyDividebByOnePointTwentyFiveShouldReturnFourPointThirtyTwo(){
        Main main = new Main(5.40,1.25);
        assertEquals(4.32,main.divide());
    }

    @Test
    public void minusFivePointFiftyDividedByMinusTwoShouldReturnTwoPointSeventyFive(){
        Main main = new Main(-5.50,-2);
        assertEquals(2.75,main.divide());
    }

    @Test
    public void twoPointFiftyFiveDividedByZeroShouldReturnNaN(){
        Main main = new Main(2.55,0);
        assertEquals(NaN,main.divide());
    }

    @Test
    public void zeroDividedByZeroShouldReturnNaN(){
        Main main = new Main(0,0);
        assertEquals(NaN,main.divide());
    }

    //square

    @Test
    public void fiveSquaredShouldReturnTwentyFive(){
        Main main = new Main(5);
        assertEquals(25,main.square());
    }

    @Test
    public void minusThreeSquaredShouldReturnNine(){
        Main main = new Main(-3);
        assertEquals(9,main.square());
    }

    @Test
    public void fivePointFortySquaredShouldReturnThirtyFourPointEightyOne(){
        Main main = new Main(5.90);
        assertEquals(34.81,main.square());
    }

    @Test
    public void minusEightPointFiftySquaredShouldReturnSeventyTwoPointTwentyFive(){
        Main main = new Main(-8.50);
        assertEquals(72.25,main.square());
    }

    @Test
    public void zeroSquaredShouldReturnZero(){
        Main main = new Main(0);
        assertEquals(0,main.square());
    }

    //root

    @Test
    public void eightyOneRootedShouldReturnNine(){
        Main main = new Main(81);
        assertEquals(9,main.root());
    }

    @Test
    public void sevenPointEightyRootedShouldReturnTwoPointSeventyNine(){
        Main main = new Main(7.80);
        assertEquals(2.79,main.root());
    }

    @Test
    public void minusNineRootedShouldReturnNaN(){
        Main main = new Main(-9);
        assertEquals(NaN,main.root());
    }

    @Test
    public void zeroRootedShouldReturnZero(){
        Main main = new Main(0);
        assertEquals(0,main.root());
    }
}
