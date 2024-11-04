// Seán Rourke
// C00251168

package cm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RourkeRateTests {

    // Test Cases for Rate

    @Test
    void test_1_ValidKindStaff(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_2_ValidKindStudent(){
        CarParkKind kind = CarParkKind.STUDENT;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_3_ValidKindManagement(){
        CarParkKind kind = CarParkKind.MANAGEMENT;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_4_ValidKindVisitor(){
        CarParkKind kind = CarParkKind.VISITOR;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_5_ValidLowerBoundaryNormalPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(0, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_6_ValidUpperBoundaryNormalPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(18, 24);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_7_ValidLowerBoundaryReducedPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(10, 15);
        Period reduced = new Period(0, 10);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_8_ValidUpperBoundaryReducedPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 24);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_9_ValidLowerBoundaryNormalRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 0, 0);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_10_ValidUpperBoundaryNormalRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 10, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_11ValidLowerBoundaryReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 0);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_12_ValidUpperBoundaryReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 10, 10);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_13_NormalRateEqualsReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 5);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_14_EmptyKind(){
        CarParkKind kind = CarParkKind.valueOf("");

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_15_InvalidKind(){
        CarParkKind kind = CarParkKind.valueOf("Elderly");

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_16_InvalidLowerBoundaryNormalPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(-1, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_17_InvalidUpperBoundaryNormalPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(20, 15);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_18_InvalidLowerBoundaryReducedPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(-1, 5);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_19_InvalidUpperBoundaryReducedPeriod(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 25);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_20_InvalidLowerBoundaryNormalRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, -1, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_21_InvalidUpperBoundaryNormalRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 11, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_22_InvalidLowerBoundaryReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, -1);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_23_InvalidUpperBoundaryReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 11);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_24_NormalRateGreaterThanReducedRate(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 2, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_25_OverlappingNormalPeriods(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal1 = new Period(5, 10);
        Period normal2 = new Period(3,7);
        Period reduced = new Period(10, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal1);
        normalPeriods.add(normal2);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_26_OverlappingReducedPeriods(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced1 = new Period(10, 18);
        Period reduced2 = new Period(17, 21);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced1);
        reducedPeriods.add(reduced2)

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    @Test
    void test_26_OverlappingNormalAndReducedPeriods(){
        CarParkKind kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(9, 18);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        try {
            Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }



    // Test Cases for Calculate

    @Test
    void test_1_NormalPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(6, 10);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("20");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_2_ReducedPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(10, 15);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("15");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_3_FreePeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(2, 4);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("0");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_4_FreeAndNormalPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(4, 7);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("15");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_5_FreeAndReducedPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(15, 20);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("9");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_6_NormalAndReducedPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(8, 12);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("16");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_7_FreeAndNormalAndReducedPeriod(){
        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);
        Period periodStay = new Period(2, 12);

        ArrayList<Period> normalPeriods = new ArrayList();
        normalPeriods.add(normal);
        ArrayList<Period> reducedPeriods = new ArrayList();
        reducedPeriods.add(reduced);

        CarParkKind kind = CarParkKind.STAFF;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, 5, 3);
        BigDecimal expectedOutput = new BigDecimal("31");

        assertEquals(expectedOutput, rate.calculate(periodStay));
    }
}