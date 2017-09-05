package org.mark;

import junit.framework.*;
public class TestGeneratePrimes extends TestCase{
	public static void main(String args[]){
     int[] i = PrimeGenerator.generatePrimes(3);
     for(int j=0;j<i.length;j++)
     System.out.println(i[j]);
	}
	public TestGeneratePrimes(String name){
		super(name);
	}
	public void testPrimes(){
		PrimeGenerator.generatePrimes(1);
	}
}