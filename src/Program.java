
public class Program {
	public static void main(String[] args) {
		int
			a = 2,
			b = 3,
			minRes = 0,
			d = 1;
		
		minRes = min(a, b);
		System.out.println("Минимальное число: " + minRes);
		
		for (int i = 0; i < 8; i++) {
			d *= minRes;
		}
		System.out.println("d = " + d);
	}
	
	public static int min(int first, int second) {
		if (first > second) {
			return second;
		}
		else if (first == second) {
			return first;
		}
		else {
			return first;
		}
	}
}
