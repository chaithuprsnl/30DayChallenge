import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here. Imperative way
         *
         int sum = 0;
         for(int num:ar){
            sum = sum + num;
         }
         return sum; */
         
         //Declarative way
         //return Arrays.stream(ar).sum();
    	
    	return Arrays.stream(ar).reduce(0, (x,y)->x+y);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        ar = Arrays.stream(arItems).mapToInt(Integer::parseInt).toArray();
        
        /*for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }*/

        int result = simpleArraySum(ar);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}
