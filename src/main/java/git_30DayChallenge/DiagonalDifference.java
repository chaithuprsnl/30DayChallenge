package git_30DayChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        	int n = arr.size();
           List<Integer> ldiag = new ArrayList<Integer>();
           List<Integer> rdiag = new ArrayList<Integer>();
           IntStream.range(0, n).forEach( index -> {
        	 IntStream.range(0, arr.get(index).size()).filter(sindex -> index==sindex).forEach(i->ldiag.add(arr.get(index).get(i)));
           });
           
           IntStream.range(0, n).forEach( index -> {
          	 IntStream.range(0, arr.get(index).size()).filter(sindex -> index==n-sindex-1).forEach(i->rdiag.add(arr.get(index).get(i)));
             });
           
           int lsum = ldiag.stream().mapToInt(Integer::new).sum();
           int rsum = rdiag.stream().mapToInt(Integer::new).sum();
           
        return Math.abs(lsum-rsum);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

