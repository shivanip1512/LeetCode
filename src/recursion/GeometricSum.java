package recursion;

public class GeometricSum {

	public static void main(String[] args) {
		System.out.println(geoSum(5));
	}

	private static Double geoSum(int k) {
		if(k==0)
			return 1.0;

		return geoSum(k-1) + 1/Math.pow(2, k);
	}

}
