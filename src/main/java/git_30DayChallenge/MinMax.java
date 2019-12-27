import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinMax {
	
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        //Java 8
    	long minSum = Arrays.stream(arr).sorted().limit(4).mapToLong(Long::new).sum();
   
        long maxSum = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(4).mapToLong(Long::new).sum();
    	
    	/* Java 7
    	 * 
    	 * long minSum = 0, maxSum = 0;
    	
    	Arrays.sort(arr);
    	
    	for(int i = 0; i<4; i++){
    		minSum = minSum + arr[i];
    	}
    	
    	for(int i = arr.length-1; i>=arr.length-4; i--){
    		maxSum = maxSum + arr[i];
    	}*/
    	
    	System.out.println(minSum+" "+maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
