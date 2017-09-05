package org.mark;
public class PrimeGenerator{
private static int[] result;
private static boolean[] crossedOut;

public static int[] generatePrimes(int maxValue){
if(maxValue<2)
	return new int[maxValue];
else{
	UncrossIntegerUpto(maxValue);
	crossOutMultiples();
	putUncrossedIntegerIntoResult();
	return result;

}
}

private static void UncrossIntegerUpto(int maxValue){
	crossedOut=new boolean[maxValue+1];
	for(int i=2;i<maxValue+1;i++)
		crossedOut[i]=false;
}
private static void crossOutMultiples(){
	int iterationLimit=determineIterationLimit();
	for (int i=2;i<iterationLimit;i++ ) {
		crossOutMultiplesOf(i);
		}
}
private static int determineIterationLimit(){
	double limit = Math.sqrt(crossedOut.length);
    return (int)limit;
}
private static void crossOutMultiplesOf(int i){
	for(int multiple=2*i;
		multiple<crossedOut.length;
		multiple=+i)
		if(notCrossedOut(i))
			crossedOut[multiple]=true;
}
private static boolean notCrossedOut(int i){
	return crossedOut[i] == false;
}
private static void putUncrossedIntegerIntoResult(){
	result=new int[numberOfUncrossedIntergers()];
	for(int i=2,j=0;i<crossedOut.length;i++)
		if(notCrossedOut(i))
			result[j++]=i;
}
private static int numberOfUncrossedIntergers(){
	int count=0;
	for(int i=2;i<crossedOut.length;i++)
		if(notCrossedOut(i))
			count++;

		return count;
}

}