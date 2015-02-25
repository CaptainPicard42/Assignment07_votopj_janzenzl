/****************************************************
 * Name: Patrick Voto								*
  * Java II, IT2045, Spring, 2015					*
 * Assignment07										*
 * 3/3/2015											*
 * ProjectEuler3				 					*
 * 													*
 ****************************************************/

package edu.uc.IT2045C.Spring2015.Assignment07;
//This is the Main Class that calls the 
//method solution from the class ProjectEuler3
public class Main {
	public static void main(String[] args){
		//Create a new object 'solution'
		ProjectEuler3 solution = new ProjectEuler3();
		//Print out the results.
		System.out.println(solution.primeNumber(600851475143L));
		
		
	}
}
