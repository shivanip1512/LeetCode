package recursion.advance;

public class StaircaseProblem {

	public static void main(String[] args) {
		int step = 4;
		System.out.println(getWaysToReach(step));
	}

	private static int getWaysToReach(int step) {
		if (step < 0)
			return 0;
		if (step == 0 || step == 1)
			return 1;

		return getWaysToReach(step - 1) + getWaysToReach(step - 2) + getWaysToReach(step - 3);
	}

}
