package TestCase;

import static org.junit.Assert.*;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.Test;
import org.junit.runner.Result;

import TestCase.Arraytest;
import TestCase.QueueTest;
@RunWith(Suite.class)
@SuiteClasses({Arraytest.class,QueueTest.class})
public class ArrayBasedTestsSuit {

}
