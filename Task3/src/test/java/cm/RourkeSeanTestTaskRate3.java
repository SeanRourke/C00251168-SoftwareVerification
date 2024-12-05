// Seán Rourke
// C00251168

package cm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;

class RateTest {

    private CarParkKind kind;
    private ArrayList<Period> normalPeriods;
    private ArrayList<Period> reducedPeriods;
    private BigDecimal normalRate;
    private BigDecimal reducedRate;

    @BeforeEach
    public void setUp() {
        kind = CarParkKind.STAFF;

        Period normal = new Period(5, 10);
        Period reduced = new Period(10, 18);

        normalPeriods = new ArrayList<>();
        normalPeriods.add(normal);
        reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reduced);

        normalRate = new BigDecimal(5);
        reducedRate = new BigDecimal(3);
    }

    // Test Cases for Rate

    @Test
    void test_1_ValidKindStaff() {

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_2_ValidKindStudent() {

        kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_3_Management() {

        kind = CarParkKind.MANAGEMENT;

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_4_ValidKindVisitor() {

        kind = CarParkKind.VISITOR;

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_5_ValidLowerBoundaryNormalPeriod() {

        normalPeriods.removeFirst();
        Period normal = new Period(0,10);
        normalPeriods.add(normal);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_6_ValidUpperBoundaryNormalPeriod() {

        normalPeriods.removeFirst();
        Period normal = new Period(18,24);
        normalPeriods.add(normal);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_7_ValidLowerBoundaryReducedPeriod() {

        normalPeriods.removeFirst();
        Period normal = new Period(10,15);
        normalPeriods.add(normal);
        reducedPeriods.removeFirst();
        Period reduced = new Period(0,10);
        reducedPeriods.add(reduced);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_8_ValidUpperBoundaryReducedPeriod() {

        reducedPeriods.removeFirst();
        Period reduced = new Period(10,24);
        reducedPeriods.add(reduced);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_9_ValidLowerBoundaryNormalRate() {

        normalRate = new BigDecimal(0);
        reducedRate = new BigDecimal(0);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_10_ValidUpperBoundaryNormalRate() {

        normalRate = new BigDecimal(10);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_11_ValidLowerBoundaryReducedRate() {

        reducedRate = new BigDecimal(0);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_12_ValidUpperBoundaryReducedRate() {

        normalRate = new BigDecimal(10);
        reducedRate = new BigDecimal(10);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_13_NormalRateEqualsReducedRate() {

        normalRate = new BigDecimal(5);
        reducedRate = new BigDecimal(5);

        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        Assertions.assertNotNull(rate);
    }

    @Test
    void test_14_InvalidLowerBoundaryNormalRate() {

        normalRate = new BigDecimal(-1);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_15_InvalidUpperBoundaryNormalRate() {

        normalRate = new BigDecimal(11);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_16_InvalidLowerBoundaryReducedRateRate() {

        reducedRate = new BigDecimal(-1);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_17_InvalidUpperBoundaryReducedRate() {

        reducedRate = new BigDecimal(11);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_28_NormalRateLessThanReducedRate() {

        normalRate = new BigDecimal(2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_19_OverlappingNormalPeriods() {

        Period normal2 = new Period(3,7);
        normalPeriods.add(normal2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_20_OverlappingReducedPeriods() {

        Period reduced2 = new Period(17,21);
        reducedPeriods.add(reduced2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_21_OverlappingNormalAndReducedPeriods() {

        reducedPeriods.removeFirst();
        Period reduced = new Period(9, 18);
        reducedPeriods.add(reduced);

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_22_NullNormalPeriods() {

        normalPeriods = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_23_NullReducedPeriods() {

        reducedPeriods = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_24_NullNormalRate() {

        normalRate = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    @Test
    void test_25_NullReducedRate() {

        reducedRate = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate));
    }

    // Test Cases for Calculate

    @Test
    void test_1_NormalPeriod() {

        Period periodStay = new Period(6, 10);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(20);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_2_ReducedPeriod() {

        Period periodStay = new Period(10, 15);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(15);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_3_FreePeriod() {

        Period periodStay = new Period(2, 4);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(0);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_4_FreeAndNormalPeriod() {

        Period periodStay = new Period(4, 7);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(10);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_5_FreeAndReducedPeriod() {

        Period periodStay = new Period(15, 20);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(9);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_6_NormalAndReducedPeriod() {

        Period periodStay = new Period(8, 12);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(16);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_7_FreeAndNormalAndReducedPeriod() {

        Period periodStay = new Period(2, 12);
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(31);

        Assertions.assertEquals(expectedOutput, rate.calculate(periodStay));
    }

    @Test
    void test_8_VisitorNotFree() {

        Period periodStay = new Period(6, 10);
        kind = CarParkKind.VISITOR;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(5);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_9_VisitorFree() {

        Period periodStay = new Period(6, 8);
        kind = CarParkKind.VISITOR;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(0);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_10_ManagementLowerBoundary() {
        Period periodStay = new Period(1, 3);
        kind = CarParkKind.MANAGEMENT;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(4);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_11_ManagementAboveMinimum() {
        Period periodStay = new Period(6, 10);
        kind = CarParkKind.MANAGEMENT;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(20);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_11_StudentWithDiscount() {
        Period periodStay = new Period(5, 10);
        kind = CarParkKind.STUDENT;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(20.125);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void test_12_StudentNoDiscount() {
        Period periodStay = new Period(5, 6);
        kind = CarParkKind.STUDENT;
        Rate rate = new Rate(kind, reducedPeriods, normalPeriods, normalRate, reducedRate);
        BigDecimal expectedOutput = new BigDecimal(5);
        int expected = 0;

        int result = expectedOutput.compareTo(rate.calculate(periodStay));

        Assertions.assertEquals(expected, result);
    }
}
