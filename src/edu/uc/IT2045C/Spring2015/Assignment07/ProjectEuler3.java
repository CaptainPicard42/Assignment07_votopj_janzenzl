	/******************************
	 * Name: Zach Janzen          *
	 * Assignment #: 10           *
	 * Due Date:  3/03/15         *
	 * Description: This program  * 
	 * will solve for the largest *
	 * prime factor of            *
	 * 600851475143               *
	 * Course/Section: IT 2045C   *
	 * Computer Prog. ll          *
	 * Sources: Colin Crowell and *
	 * Benjamin Ward              *
	 * Change History:            *
	 ******************************
	 */
package edu.uc.IT2045C.Spring2015.Assignment07;

public class ProjectEuler3 {
	
		public static long primeNumber(long num) {
			// initialize variables

			// sqrt is only bigger than the largest prime factor to a certain point. it will work for this number however.
			long i =  (long) Math.sqrt(num);



			// begin while loop
			while (i > 1) {

				// num is evenly divisible by i
				if (num % i == 0 && isPrime(i)) {

					break;
				}
				// decrement i
				i--;

			}

			// i is the largest prime factor of the chosen number
			return i;
		}

		// original isPrime check from previous assignment
		public static boolean isPrime(long i2) {

			// initialize variables
			int i = 2;
			int result = 0;

			// begin while loop
			while (i <= i2 / 2) {

				// num is evenly divisible by i?
				if (i2 % i == 0) {

					// set result to 1
					result = 1;
				}

				// add one to i
				i++;
			}

			// if it is not prime:
			if (result == 1) {
				return false;
			}

			// if it is prime:
			else {
				return true;
			}

		}

	}



