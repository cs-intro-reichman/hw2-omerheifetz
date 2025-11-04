// Demonstrates the Collatz conjecture. didnt work
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		//not working
		int seed = Integer.parseInt(args [0]);
		String mood = args [1];
		int counter = 1;
		int N = 1;
		boolean checkAt1 = true;
		boolean check4v = true;
		// if N is 1 
		if (mood.equals("v")) {
		while (checkAt1) {
			System.out.print(N + " ");
			if (N%2==0) {
				N = N/2;
			}
			else {
				N = N*3+1;
			}
			counter++;
			if (N==1) {
				checkAt1 = false;
				System.out.print(1 + " (" + counter + ")");
				System.out.println();
			}
		}
		counter = 0;
		for (int i=2; i<=seed; i++) {
		check4v = false;
		N = i;
		while (N!=1) {
			System.out.print(N + " ");
			counter++;
			if (N%2==0) {
				N = N/2;
			}
			else {
				N = N*3+1;
			}
		}
		check4v = true;
		counter++;
		System.out.print(1 + " (" + counter + ")");
		System.out.println();
		counter = 0;
	}
	if (check4v) {
	System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
else if (mood.equals("c")) {
	boolean check4c = true;
	for (int i=2; i<=seed; i++) {
		N = i;
		check4c = false;
		while (N!=1) {
			if (N%2==0) {
				N = N/2;
			}
			else {
				N = N*3+1;
			}
		}
		check4c = true;
	}
	if (check4c) {
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}	
}
}
}
