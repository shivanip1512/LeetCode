package recursion.advance;

public class PrintSteps_TowerOfHanoi {

	public static void main(String[] args) {
		Character source = 'A';
		Character dest = 'C';
		Character helper = 'B';
		int disks = 5;
		printSteps(disks, source, dest, helper);
	}

	private static void printSteps(int n, Character source, Character dest, Character helper) {
		if(n==0)
			return;
		
		printSteps(n-1, source, helper, dest);
		System.out.println("Moving disk "+n+" from "+source+" -> "+dest);
		printSteps(n-1, helper, dest, source);
		
	}

}
