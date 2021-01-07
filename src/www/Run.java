package www;

public class Run {

	public static void main(String[] args) {
		Checker<Integer> isPositive=x->x>0;
		System.out.println(isPositive.check(11));
		Function f = new Function();
		int y = f.multiply(6);
		System.out.println(y);
	}

}
