import java.util.concurrent.ThreadLocalRandom;
public class GenThree {
    public static void main(String[] args) {
		int max,min = 0;
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);
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
