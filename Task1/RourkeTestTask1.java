// Seán Rourke
// C00251168

package cm;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Rourke Task1 Test Suite")
@SelectClasses({RourkePeriodTests.class, RourkeRateTests.class}) 

class RourkeTestTask1 {
}