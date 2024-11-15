// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int maxSeed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int counter;
		if(mode == 'v'){
		for(int i = 1; i <= maxSeed; i++){
			int j = i;
			counter = 0;
	        System.out.print(j + " ");
			do{
              if(j % 2 == 0){
				j /= 2;
				System.out.print(j + " ");
			  }else{
				j = (j * 3) + 1;
				System.out.print(j + " ");
			  }
			counter++;
			}while(j > 1);
			System.out.println("(" + ++counter + ")");
		}
		System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
	}else{
          System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
		}
	}
}
