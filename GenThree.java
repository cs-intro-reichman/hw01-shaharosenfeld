import java.util.concurrent.ThreadLocalRandom;
public class GenThree {
    public static void main(String[] args) {
		/* Feedback
		The init of max and min in the same line can be misleading. It seems like both are set to 0, but only min is. It's better to init them in seperate lines for clarity
		int max; 
		int min = 0;
		*/
		int max,min = 0; 
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);
		/* Feedback
		The variable names firstR, secR, and thirdR are somewhat clear but could be more descriptive, like firstRandom, secondRandom, and thirdRandom.
		*/
        int firstR = ThreadLocalRandom.current().nextInt(min, max);//getting a random number within the range
		int secR = ThreadLocalRandom.current().nextInt(min, max);
		int thirdR = ThreadLocalRandom.current().nextInt(min, max);
			System.out.println(firstR);
			System.out.println(secR);
			System.out.println(thirdR);
		if(firstR < secR && firstR < thirdR)//check to see who is the minimal generated number
			{
				System.out.println("The minimal generated number was "+ firstR);
			}	
			else if(secR < firstR && secR < thirdR)
			{
				System.out.println("The minimal generated number was "+ secR);
			}
			else{
				System.out.println("The minimal generated number was "+ thirdR);
			}
    }
}

