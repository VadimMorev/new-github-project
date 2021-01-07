package www;

public class Run {

	public static void main(String[] args) {
		Checker<Integer> isPositive=x->x>0;
		System.out.println(isPositive.check(11));
	}

}
