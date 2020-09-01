
public class Problem2 {

	public static void main(String[] args) {
		Date d1 = new Date(12, 19, 2000);
		Date d2 = new Date(9,19,2000);
		
		if(d1.compare(d2) == -1) {
			System.out.println(d1 + " is earlier than " + d2);
		}else if(d1.compare(d2) == 1) {
			System.out.println(d2 + " earlier than " + d1);
		}else {
			System.out.println(d1 + " and " + d2 + " are the same date");
		}
		

	}
}
