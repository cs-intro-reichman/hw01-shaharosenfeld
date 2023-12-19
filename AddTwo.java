public class AddTwo {
    public static void main(String[] args) {
        int x,y = 0;
		x = Integer.parseInt(args[0]);//changing x to integer
		y = Integer.parseInt(args[1]);//changing y to integer
		System.out.println(x + " + " + y + " = " + (x+y));
    }
}
