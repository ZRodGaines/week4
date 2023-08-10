package week4proj;

public class week4code {

	//create method that takes in a String userword as well as an int n
		public static String repeatWord(String userword, int n ) {
			//create an empty string to hold that word that will be returned
			String returnword = "";
			//for every time a word needs to be repeated concatenate the word
			//with itself adding on top of each other
			for (int i = 0; i <= n;i++) {
				returnword += userword;
			}
			//returning the final word
			return returnword;
			
		}
		
		//method takes in two strings
		static String fullName(String firstName, String lastName) {
			//placeholder string
			String full = "";
			//concat string with space in between
			full = (firstName + " " + lastName);
			
			//return concat string
			return full;
		}
		//method returns boolean & takes in int array 
		static boolean isGreaterThan100(int array[]) {
			//init sum
			int sum = 0;
			//add all int in array
			for (int i = 0; i <= array.length - 1; i++) {
				sum += array[i];
			}
			// if/else check if more than 100, return proper boolean
			if (sum > 100) {
				return true;
			}
			else {
				return false;
			}
					
		}
			
		static double doubleAvg(double array[]) {
			double avg = 0;
			for (int i = 0; i <= array.length - 1; i++) {
				avg += array[i];
			}
			avg = avg/array.length;
			return avg;
		}
		
		static boolean firstBiggerThanSecond(double array[], double array2[]) {
			double avg1 = 0;
			for (int i = 0; i <= array.length - 1; i++) {
				avg1 += array[i];
			}
			avg1 = avg1/array.length;
			
			double avg2 = 0;
			for (int i = 0; i <= array.length - 1; i++) {
				avg2 += array[i];
			}
			avg2 = avg2/array.length;
			
			if (avg1 > avg2) {
				return true;
			}
			else {
				return false;
			}
		
		}
		
		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			//checking if isHotOutside is true AND if moneyInPocket is
			//equal or greater than 10.50
			if (isHotOutside && moneyInPocket >= 10.50) {
				return true;
			}
			else {
				return false;
			}
		}
		
		static void WhichMovieToWatch(double rating1, double rating2) {
			if (rating1 > rating2) {
				System.out.println("Watch Movie 1");
			}
			else {
				System.out.println("Watch Movie 2");
			}
		}
		
		//test use of methods
		static int[] testarr = {12,52,11,23};
		
		static double[] testarrD = {33,12,54,32,5};
		
		static double[] testarrD2 = {72,4,55,12,43};
		
		static boolean greater = isGreaterThan100(testarr);
		
		static String JhonnyName = fullName("Jhonny","Smith");
		 
		 static String repeated = repeatWord("word", 5);
		 
		 static double testD = doubleAvg(testarrD);
		 
		 static boolean test12 = firstBiggerThanSecond(testarrD, testarrD2);
		 
		 static boolean drinktest = willBuyDrink(true, 92);
	
	public static void main(String[] args) {
		
		
		//init ages array
		int[] ages = {3,9,23,64,2,8,28,93}; 
		
		//subtracting last element in ages by the first element
		ages[ages.length - 1] = ages[ages.length - 1] - ages[0];
		System.out.println(ages[ages.length - 1]);
		
		int[] ages2 = {19,22,32,54,22,93,54,12,48};
		
		ages2[ages2.length - 1] = ages2[ages2.length - 1] - ages2[0];
		System.out.println(ages2[ages2.length - 1]);
		
		//creating int varible to hold average value
		int avg = 0;
		//iterating through the values of ages2, adding them
		//to the avg int
		for (int i = 0; i <= ages2.length - 1; i++) {
			avg += ages2[i];
		}
		
		//finding the avg, dividing the sum by the amount
		avg = avg / ages2.length;
		System.out.println(avg);
		
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		int avg2 = 0;
		for (int i = 0; i <= names.length - 1; i++) {
			avg2 += names[i].length();
		}
		avg2 = avg2 / names.length;
		System.out.println(avg2);
		
		String concat = "";
		for (int i = 0; i < names.length - 1; i++ ) {
			concat += names[i];
		}
		System.out.println(concat);
		
		//3. Last element of an array is found by arrayname[arrayname.length]
		//4. The first element of any array is found by arrayname[0]
		
		int namelengths[] = new int[5];
		
		for (int i = 0; i <= namelengths.length - 1; i++) {
			namelengths[i] = names[i].length();
		}
		
		int lenSum = 0;
		for (int i = 0; i <= namelengths.length - 1; i++) {
			lenSum += namelengths[i];
		}
		System.out.println(lenSum);
		System.out.println(repeated);
		System.out.println(JhonnyName);
		System.out.println(greater);
		System.out.println(testD);
		System.out.println(test12);
		System.out.println(drinktest);
		
		
		
	}
	
	
	
	
	
	
	


}
