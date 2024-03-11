package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	
	@Test
	void countTest() {
		char[]ar1= {'1','2','1','3'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		assertEquals(2,arrayChar1.count('1'));
		assertEquals(1,arrayChar1.count('3'));
		assertEquals(0,arrayChar1.count('4'));
		assertEquals(0,arrayChar1.count('q'));
	}
	
	@Test
	void CompareToIgnoreCase() {
		
		assertEquals(0, new ArrayChar(new char[] {'a','A'}).compareToIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertEquals(0, new ArrayChar(new char[] {'A','A'}).compareToIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertEquals(0, new ArrayChar(new char[] {'a','a'}).compareToIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertEquals(-1, new ArrayChar(new char[] {'A'}).compareToIgnoreCase(new ArrayChar(new char[] {'a','a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'}).compareToIgnoreCase(new ArrayChar(new char[] {'A','A'})));
	}
	
	@Test
	void contains() {
		assertTrue(new ArrayChar(new char[] {'1','2','3'}).contains('2'));
		assertTrue(new ArrayChar(new char[] {'1','2','3'}).contains('1'));
		assertFalse(new ArrayChar(new char[] {'a','B','c'}).contains('b'));
		assertTrue(new ArrayChar(new char[] {'a','B','c'}).contains('B'));
	}
	
	@Test
	void compareToTest() {
		char[]ar1= {'1','2','3'};
		char[]ar2= {'9'};
		char[]ar3= {'1','2','3'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		ArrayChar arrayChar2=new ArrayChar(ar2);
		ArrayChar arrayChar3=new ArrayChar(ar3);
		assertEquals(8,arrayChar2.compareTo(arrayChar1));
		assertEquals(-8,arrayChar1.compareTo(arrayChar2));
		assertEquals(1,new ArrayChar(new char[] {'a','a'}).compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(0,arrayChar3.compareTo(arrayChar1));
	}
	@Test
	void equalsTest() {
		assertFalse(new ArrayChar(new char[] {'a','A'}).equals(new ArrayChar(new char[] {'A','A'})));
		assertTrue(new ArrayChar(new char[] {'A','A'}).equals(new ArrayChar(new char[] {'A','A'})));
		assertFalse(new ArrayChar(new char[] {'a','a'}).equals(new ArrayChar(new char[] {'A','A'})));
		assertFalse(new ArrayChar(new char[] {'A'}).equals(new ArrayChar(new char[] {'a','a'})));
		assertFalse(new ArrayChar(new char[] {'a'}).equals(new ArrayChar(new char[] {'A','A'})));
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		assertTrue(new ArrayChar(new char[] {'a','A'}).equalsIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertTrue(new ArrayChar(new char[] {'A','A'}).equalsIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertTrue(new ArrayChar(new char[] {'a','a'}).equalsIgnoreCase(new ArrayChar(new char[] {'A','A'})));
		assertFalse(new ArrayChar(new char[] {'A'}).equalsIgnoreCase(new ArrayChar(new char[] {'a','a'})));
		assertFalse(new ArrayChar(new char[] {'a'}).equalsIgnoreCase(new ArrayChar(new char[] {'A','A'})));
	}
	
	@Test
	void indexOfTest() {
		char[]ar1= {'1','2','3','2'};
		
		ArrayChar arrayChar1=new ArrayChar(ar1);
		
		assertEquals(1,arrayChar1.indexOf('2'));
		assertEquals(-1,arrayChar1.indexOf('9'));
		
	}
	@Test
	void lastindexOfTest() {
		char[]ar1= {'1','2','3','2'};
		
		ArrayChar arrayChar1=new ArrayChar(ar1);
		
		assertEquals(3,arrayChar1.lastindexOf('2'));
		assertEquals(-1,arrayChar1.lastindexOf('9'));
		
	}

}
