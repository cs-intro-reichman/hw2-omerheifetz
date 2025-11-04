// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args [0]);
		int newNum = 1;
		int counter=1;
		System.out.print("1 4 2 1 (4)");
		for (int i=2; i<=seed; i++) {
			newNum=i;
			System.out.println();
		if (newNum==1) {
			newNum = newNum*3+1;
			while (newNum!=1) {
				System.out.print(newNum + " ");
				if (newNum%2==0) {
					newNum/=2;
				}
				else {
					newNum = newNum*3+1;
				}
				counter++;
		}
	}
		else {
			while (newNum!=1) {
				System.out.print(newNum + " ");
				if (newNum%2==0) {
					newNum/=2;
				}
				else {
					newNum = newNum*3+1;
				}
				counter++;
			}
		}
		System.out.print("1 (" + counter + ")");
		counter = 1;
	}
}
}
