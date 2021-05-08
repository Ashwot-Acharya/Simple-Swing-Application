package menu.project;

import java.util.Random;

public class MyGuess  {

   int guess() {
	   Random rand = new Random(); 
	int upperbound = 10;
   int int_random = rand.nextInt(upperbound);
   return int_random;
	}




}
