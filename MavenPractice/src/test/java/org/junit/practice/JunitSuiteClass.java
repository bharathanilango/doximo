package org.junit.practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitFacebook.class,JunitFlipkart.class})
public class JunitSuiteClass {
	//used to group all the test cases
	/*This class is used to run all the test cases which is specified inside the @SuiteClass 
	 * annotation ,we ensure that class should declare the method as a @Test annotation
	*/
}
