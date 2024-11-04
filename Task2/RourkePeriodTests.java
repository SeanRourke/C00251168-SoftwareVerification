// Seán Rourke
// C00251168

package cm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RourkePeriodTests {

// Test Cases for Period

@Test
void test_1_PeriodValidInput(){
    try {
        Period period = new Period(12, 15);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_2_ValidLowerBoundaryPeriod(){
    try {
        Period period = new Period(0, 1);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_3_ValidUpperBoundaryPeriod(){
    try {
        Period period = new Period(23, 24);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_4_StartGreaterThanEnd(){
    try {
        Period period = new Period(8, 5);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_5_StartEqualToEnd(){
    try {
        Period period = new Period(5, 5);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_6_InvalidLowerBoundaryStart(){
    try {
        Period period = new Period(-1, 3);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_7_InvalidUpperBoundaryStart(){
    try {
        Period period = new Period(24, 24);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_8_InvalidLowerBoundaryEnd(){
    try {
        Period period = new Period(0, 0);
    } catch (IllegalArgumentException e){
        throw e;
    }
}

@Test
void test_5_InvalidUpperBoundaryEnd(){
    try {
        Period period = new Period(20, 25);
    } catch (IllegalArgumentException e){
        throw e;
    }
}


// Test Cases for Duration

@Test
void test_1_DurationValidInput(){
    Period period = new Period(5, 10);
    int expectedDuration = 5;
    assertEquals(expectedDuration, period.duration());
}

@Test
void test_2_LowerBoundaryDuration(){
    Period period = new Period(0, 1);
    int expectedDuration = 1;
    assertEquals(expectedDuration, period.duration());
}

@Test
void test_3_UpperBoundaryDuration(){
    Period period = new Period(5, 24);
    int expectedDuration = 19;
    assertEquals(expectedDuration, period.duration());
}

// Test Cases for Overlaps

@Test
void test_1_Overlap(){
    Period period1 = new Period(3, 13);
    Period period2 = new Period(11, 15);
    boolean expectedOverlap = true;
    assertEquals(expectedOverlap, period1.overlaps(period2));
}

@Test
void test_1_NoOverlap(){
    Period period1 = new Period(5, 7);
    Period period2 = new Period(10, 12);
    boolean expectedOverlap = false;
    assertEquals(expectedOverlap, period1.overlaps(period2));
}

@Test
void test_1_OverlapBoundary1End2Start(){
    Period period1 = new Period(14, 17);
    Period period2 = new Period(17, 20);
    boolean expectedOverlap = false;
    assertEquals(expectedOverlap, period1.overlaps(period2));
}

@Test
void test_1_OverlapBoundary1Start2End(){
    Period period1 = new Period(21, 23);
    Period period2 = new Period(17, 21);
    boolean expectedOverlap = false;
    assertEquals(expectedOverlap, period1.overlaps(period2));
}

}