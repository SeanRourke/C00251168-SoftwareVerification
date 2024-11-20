// Seán Rourke
// C00251168

package cm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PeriodTest {

    // Test Cases for Period

    @Test
    void test_1_PeriodValidInput() {

        int start = 12;
        int end = 15;

        Period period = new Period(start, end);

        Assertions.assertNotNull(period);
    }

    @Test
    void test_2_ValidLowerBoundaryPeriod() {

        int start = 0;
        int end = 1;

        Period period = new Period(start, end);

        Assertions.assertNotNull(period);
    }

    @Test
    void test_3_ValidUpperBoundaryPeriod() {

        int start = 23;
        int end = 24;

        Period period = new Period(start, end);

        Assertions.assertNotNull(period);
    }

    @Test
    void test_4_StartGreaterThanEnd() {

        int start = 8;
        int end = 5;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_5_StartEqualToEnd() {

        int start = 5;
        int end = 5;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_6_InvalidLowerBoundaryStart() {

        int start = -1;
        int end = 3;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_7_InvalidUpperBoundaryStart() {

        int start = 24;
        int end = 24;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_8_InvalidLowerBoundaryEnd() {

        int start = 0;
        int end = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_9_InvalidUpperBoundaryEnd() {

        int start = 24;
        int end = 24;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    @Test
    void test_10_NegativeEnd() {

        int start = 0;
        int end = -1;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Period(start, end));
    }

    // Test Cases for Duration

    @Test
    void test_1_ValidDuration() {

        int start = 5;
        int end = 10;
        Period period = new Period(start, end);
        int expectedDuration = 5;

        Assertions.assertEquals(expectedDuration, period.duration());
    }

    @Test
    void test_2_LowerBoundaryDuration() {

        int start = 0;
        int end = 1;
        Period period = new Period(start, end);
        int expectedDuration = 1;

        Assertions.assertEquals(expectedDuration, period.duration());
    }

    @Test
    void test_3_UpperBoundaryDuration() {

        int start = 5;
        int end = 24;
        Period period = new Period(start, end);
        int expectedDuration = 19;

        Assertions.assertEquals(expectedDuration, period.duration());
    }
    
    // Test Cases for Overlaps

    @Test
    void test_1_Overlap(){

        Period period1 = new Period(3, 13);
        Period period2 = new Period(11, 15);
        boolean expectedOverlap = true;

        Assertions.assertEquals(expectedOverlap, period1.overlaps(period2));
    }

    @Test
    void test_2_NoOverlap(){

        Period period1 = new Period(5, 7);
        Period period2 = new Period(10, 12);
        boolean expectedOverlap = false;

        Assertions.assertEquals(expectedOverlap, period1.overlaps(period2));
    }

    @Test
    void test_3_OverlapBoundary1End2Start(){

        Period period1 = new Period(14, 17);
        Period period2 = new Period(17, 20);
        boolean expectedOverlap = false;

        Assertions.assertEquals(expectedOverlap, period1.overlaps(period2));
    }

    @Test
    void test_4_OverlapBoundary1Start2End(){

        Period period1 = new Period(21, 23);
        Period period2 = new Period(17, 21);
        boolean expectedOverlap = false;

        Assertions.assertEquals(expectedOverlap, period1.overlaps(period2));
    }
}
