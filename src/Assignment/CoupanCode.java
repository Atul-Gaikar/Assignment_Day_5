package Assignment;

public class CoupanCode {

	
	public static void main(String[] args) {
		
		 // char array to get characters for coupan
		 
		char[] chars = "abcdefghijklmnop".toCharArray();
		
		// length of coupan
		 
		int max = 10000;
		
		 // random value
		 
		double d = Math.random();
		int random = (int) (d * max);
		String sb = "";
		System.out.println("random double " + d + " random at start " + random);

		while (random > 0) {
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
			System.out.println(random + "  " + random % chars.length + " sb is " + sb);
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}
}