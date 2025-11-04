//feedback

/*
Great work boaz!
*/

// change to capital lettars
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String sIn = args [0];
            String sIn1 = sIn.toUpperCase();
            int N = Integer.parseInt(args[1]);
            String checkLetters = "AEFHILMNORSX";
            boolean check = false;
            //give me
            for (int i=0; i<sIn.length(); i++) {
                for (int j=0; j<checkLetters.length(); j++) {
                        if (sIn1.charAt(i)==checkLetters.charAt(j)) {
                        check = true;
                        }
                }
                if (check) {
                        System.out.println("Give me an " + sIn1.charAt(i) + ": " + sIn1.charAt(i) + "!");
                        }
                        else {
                        System.out.println("Give me a  " + sIn1.charAt(i) + ": " + sIn1.charAt(i) + "!");
                        }
                check=false;
            }

            System.out.println("What does that spell?");
            for (int i=0; i<N; i++) {
                System.out.println(sIn1 + "!!!");
            }
        }
}
