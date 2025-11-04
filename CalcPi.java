// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int fractionsN = Integer.parseInt(args[0]);
		double sum = 1;
		double fraction;
		boolean PlusOrMinus = true;
		for (int i=2; i<=(fractionsN*2); i++) {
			fraction = 1.0/i;
			if (i%2!=0 && PlusOrMinus) {
				sum = sum - fraction;
				PlusOrMinus = false;
			}
			else if (i%2!=0 && !PlusOrMinus) {
				sum = sum + fraction;
				PlusOrMinus = true;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum*4);
	}
}
