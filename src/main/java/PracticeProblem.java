public class PracticeProblem {

	public static void main(String args[]) {

	}

public static int sum(int num, int numAgain){
	//Q1
	int result = num+numAgain;
	return result;
}

public static int difference(int numtwo, int numB){
	// Q2
	int difference  = numtwo - numB;
	return difference;
}

public static double product(double oneone, double twotwo){
	//Q3
	double produce = oneone*twotwo;
	return produce; 
}

public static String removeFirst(String help){
	//Q4
	return (help.substring(1));

}

public static int combinedLength(String text, String textTwo){
	//Q5
	return (text.length()+textTwo.length());
}
public static boolean isEven(int what){
	//Q6
	boolean result = (what%2) == 0;
	return result;

	
}
public static boolean isOdd(int huh){
	//Q7 
	boolean ans = (huh%2)!=0;
	return ans;
}
public static boolean isPositive(int where){
	boolean here = where>0;
	return here;
}
public static boolean isNegative(int how){
	boolean why = (how<0);
	return why;
}
	

	
}
