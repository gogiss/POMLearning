package POMLearning;

import org.junit.runner.RunWith;		
import org.junit.runners.Suite;	

//To run more test classes add the to the test suite
@RunWith(Suite.class)
@Suite.SuiteClasses({
	LoginTests.class,
	ShopPageTests.class
})

public class RunAllTests {

}