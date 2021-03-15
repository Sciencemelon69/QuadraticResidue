/**
 *In Richard Borcherd's course on number theory, in the first video, he talked about quadratic residues.
 *An Integer a is a quadratic residue mod m if x²=a mod m is solvable.
 *This program takes parameters a and m and searches for a solution to the above equation.
 *A third parameter is passed to specify the range to be searched for solutions.
 */

import java.lang.Math;

class Solver{

	public static void main(String[] args) {
	
	int a = Integer.parseInt(args[0]);
	int m = Integer.parseInt(args[1]);

	long maxCheckValue = Long.parseLong(args[2]);

	boolean solutionFound = false;
	long x = 0; 
	long solution = 0;

	while (!solutionFound && x < maxCheckValue) {
		if (Math.pow(x,2)%m == a) {
			solutionFound = true;
			solution = x;
			System.out.println("Solution found. x² = " + a + " mod " + m + " for x = " + solution);
		}
		else {
			x++;
		}
	}

	if (!solutionFound) {
		System.out.println("No solution was found up to " + maxCheckValue);
	}
}
}
