import java.util.concurrent.ThreadLocalRandom;
public class GenThree {
    public static void main(String[] args) {
		int max,min = 0;
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);
        int firstR = ThreadLocalRandom.current().nextInt(min, max + 1);
		int secR = ThreadLocalRandom.current().nextInt(min, max + 1);
		int thirdR = ThreadLocalRandom.current().nextInt(min, max + 1);
			System.out.println(firstR);
			System.out.println(secR);
			System.out.println(thirdR);
		if(firstR < secR && firstR < thirdR)
			{
				System.out.println("The minimal number is: "+ firstR);
			}	
			else if(secR < firstR && secR < thirdR)
			{
				System.out.println("The minimal number is: "+ secR);
			}
			else{
				System.out.println("The minimal number is: "+ thirdR);
			}
    }
}
