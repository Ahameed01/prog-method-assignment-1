/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part

	public void run() {
		
		placeFirstBeeper();
		moveTwoStepsAheadAndPlaceBeeper();
	}

	private void moveTwoStepsAheadAndPlaceBeeper() {
		// TODO Auto-generated method stub
		while (frontIsClear()){
		for (int i=0; i<2; i++){
			putBeeper();
			move();
			
		}
		}
	}

	private void placeFirstBeeper() {
		// TODO Auto-generated method stub
		putBeeper();
	}
}

