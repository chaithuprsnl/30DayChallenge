import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Comparator;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	public Difference(int[] elements){
  		this.elements = elements;
  	}
  	
  	public void computeDifference(){
  		List<Integer> list = new ArrayList<>();
  		IntStream.range(0, elements.length-1).forEach(i -> {
  			IntStream.range(i, elements.length-1).forEach(j -> list.add(Math.abs(elements[i]-elements[j+1])));
  		});
  		
  		//Imperative way
  		/*for(int i = 0;i<elements.length-1;i++){
            for(int j=i;j<elements.length-1;j++){
                list.add(Math.abs(elements[i]-elements[j+1]));
            }
        }*/
  		
  		maximumDifference = list.stream().max(Comparator.naturalOrder()).get();
  	}

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}