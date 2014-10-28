package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAction.class, TestResource.class, TestResourcePool.class,
		TestSchedulers.class })
public class AllTests {

}
