/*
 * Name: Daniel Williams & Matthew Ambrose
 *
 * UML
 * +seed -- double
 * +multiplier -- double
 * +increment -- double
 * modulus -- double
 *
 * SetSeed(double): void
 * RandGenerator(): double
 *
 */

import java.util.Random;

/**
 * CIS 175 MidTerm Project -- Pseudo-Random Number Sequence Generator using Linear Congruence
 *
 * @author Daniel Williams
 * @author Matthew Ambrose
 * @version 2.0
 * Date: 03/28/19 --> 04/11/19
 *
 */
public class LinearCongruence {


	static Random rand = new Random();


	public LinearCongruence() {
		// TODO Auto-generated constructor stub
		int seed = 1;
		int mult = 0;
		int inc = 0;
		int mod = 0;

	}


	public static double SetSeed(double s) {

		// let user set seed

		return s;
	}

	public static int RandGenerator() {

		//do the calculations, generate rand numbers, print them out

		return
	}

	public class RndGen {

		// private fields
		private int multiplier; // = 40;
		private int increment; 	// = 3641;
		private int modulus; 	// = 729;
		private int seed; 		// = 1;
		private boolean[] numberIsUsed;	// size will be set in constructor to same size as modulus

		public RndGen(int argMultiplier, int argIncrement, int argModulus, int argSeed) {
			boolean[] numberIsUsed = new boolean[modulus];
			this.multiplier
		}

		public RndGen() {
			RndGen(40,3641,729,1)
		}

		public int getSeed() {
			return this.seed;
		}
	}


	public static void main(String[] args) {

		// These four initial values are set based on the example used in the project instructions.
		int multiplier = 40;
		int increment = 3641;
		int modulus = 729;
		int seed = 1;

		// Initialize the program.
		RandGenerator genX = new RandomGenerator(theMultiplier,theSeed,theIncrement,theModulus);

		while (usedNumbers[seed])
		{

		}


	}

}
