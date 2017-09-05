package org.mark;
public class PrimeGenerator{
	private static boolean[] crossedOut;
	private static int[] result;

	public static int[] generatePrimes(int maxValue){
		if (maxValue < 2)
			return new int[0];
		else{
			uncrossIntegersUpTo(maxValue);
			crossOutMultiples();
			putUnCrossedIntegersIntoResult();
			return result;
		}

	}

//initialize the crossedout array;
	private static void uncrossIntegersUpTo(int maxValue){
		crossedOut = new boolean[maxValue+1];
		for(int i=0;i<crossedOut.length;i++)
			crossedOut[i]=false;
	}

	private static void crossOutMultiples(){
		int limit = determineIterationLimit();
		for (int i=2;i< limit;i++){
			if(notCrossed(i))
				crossOutMultiplesOf(i);
		}
	}

	private static int determineIterationLimit(){
		double iterationLimit = Math.sqrt(crossedOut.length);
		return (int)iterationLimit;
	}

	private static void crossOutMultiplesOf(int i){
		for(int multiple=2*i;
			multiple<crossedOut.length;
			multiple=+i)
		    crossedOut[multiple]=true;
	}

	private static boolean notCrossed(int i){return crossedOut[i] == false;}

	private static void putUnCrossedIntegersIntoResult(){
		result = new int[numberOfUnCrossedIntegers()];
		for(int i=2,j=0;i<crossedOut.length;i++)
			if(notCrossed(i))
			result[j++]=i;
	}
	private static int numberOfUnCrossedIntegers(){
		int count=0;
		for(int i=2;i<crossedOut.length;i++){
			if(notCrossed(i))
				count++;
		}
		return count;
	}
}