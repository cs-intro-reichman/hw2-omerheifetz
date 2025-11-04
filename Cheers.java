//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String sIn= args [0];
            int N= Integer.parseInt(args[1]);
            String checkLetters = "AEFHILMNORSX";
            boolean check = false;
            //give me
            for (int i=0; i<sIn.length(); i++) {
                for (int j=0; j<checkLetters.length(); j++) {
                        if (sIn.charAt(i)==checkLetters.charAt(j)) {
                        check = true;
                        }
                }
                if (check) {
                        System.out.println("Give me an " + sIn.charAt(i) + ": " + sIn.charAt(i) + "!");
                        }
                        else {
                        System.out.println("Give me a  " + sIn.charAt(i) + ": " + sIn.charAt(i) + "!");
                        }
                check=false;
            }

            System.out.println("what does that spell?");
            for (int i=0; i<N; i++) {
                System.out.println(sIn + "!!!");
            }
        }
}
