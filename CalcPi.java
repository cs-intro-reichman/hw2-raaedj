// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		Double piCalc = 0.0;
		for(int i = 0; i < n; i++){
			if (i % 2 == 0) {
                piCalc += 1.0 / (2 * i + 1);
            } else {
                piCalc -= 1.0 / (2 * i + 1);
            }
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     " + piCalc*4);
	}
}
