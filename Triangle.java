public class Triangle {
    public static void main(String[] args) {
        int a = 0;
		a = Integer.parseInt(args[0]);//changing a to integer
        int b = 0;
		b = Integer.parseInt(args[1]);//changing b to integer
        int c = 0;
		c = Integer.parseInt(args[2]);//changing c to integer
		if(a+b>c && a+c>b && b+c>a)
			System.out.println(a+ ", "+b+", "+c+" : true");
		else
			System.out.println(a+ ", "+b+", "+c+" : false");
    }
}
