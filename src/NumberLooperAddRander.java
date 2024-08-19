import java.lang.Math;

public class NumberLooperAddRander {

	public static void main(String[] args) {
		double CurrentNumber = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println(CurrentNumber);
			Double IncrementAmount = Math.random();
			//var y = (" "+IncrementAmount.toString()+" ");
			//System.out.print(y);
			CurrentNumber = CurrentNumber+IncrementAmount;
		}
	}

}
