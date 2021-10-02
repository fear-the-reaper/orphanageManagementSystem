package TestCase;
import TestCase.StackTest;
import TestCase.LinkedListTest;

import static org.junit.Assert.*;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.Test;
import org.junit.runner.Result;
@RunWith(Suite.class)
@SuiteClasses({StackTest.class,LinkedListTest.class})
public class linkedLIstBasedTestsSuit {

}
