public class Coins {
    public static void main(String[] args) {
        int x = 0;
		x = Integer.parseInt(args[0]);//changing x to integer
		int quarterNum = x/25;//checking how many quarters needeed
		int centNum = x%25;//checking how many cents needeed
		System.out.println("Use " + quarterNum+ " quarters and " +centNum+ " cents");
    }
}
