package org.junit.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite; 
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample.class, Sample1.class})
public class SuitClass {
	//SuiteClasses used for combining the
	//more than one classes
}
