import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		System.out.println("Program Started");
		
		CyclesStd exCulc = new CyclesStd();
		
		ArraysStd exArray = new ArraysStd(new int[5]);
		System.out.println(Arrays.toString(exArray.nums));
		
	}
}