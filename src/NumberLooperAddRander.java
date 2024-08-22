import java.lang.Math;

public class NumberLooperAddRander {

	public static void main(String[] args) {
		double CurrentNumber = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println(CurrentNumber);
			Double IncrementAmount = Math.random();
			//var a = (" "+IncrementAmount.toString()+" ");
			//System.out.print(a);
			CurrentNumber = CurrentNumber+IncrementAmount;
		}
	}

}
