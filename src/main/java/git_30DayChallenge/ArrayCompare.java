import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ArrayCompare {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	int as = 0, bs = 0;
    	    	
    	//imperative way
    	/*for(int i=0;i<a.size();i++){
    		if(a.get(i) < b.get(i))
    			bs++;
    		else if(a.get(i) > b.get(i))
    			as++;
    	}*/
    	
    	//Consumer<Integer> c =  ele -> Integer.valueOf(ele);
    	
    	
    	//System.out.println(a.stream().filter(ele -> ele.equals(b.stream().reduce(be -> be))).count());
    	
    	//System.out.println("a count: "+a.stream().filter(ae -> b.stream().map( be -> be.compareTo(ae))).collect(Collectors.counting()));
    	//System.out.println("b count: "+a.stream().filter(ae -> b.stream().anyMatch( be -> be.compareTo(ae) < 0)).count());
    	
    	/*if(a.stream().filter(ae -> b.stream().anyMatch( be -> be.compareTo(ae) < 0)).count()){
    		bs++;
    	}
    	
    	if(a.stream().anyMatch(ae -> b.stream().anyMatch( be -> be.compareTo(ae) > 0))){
    		as++;
    	}*/
    	
    	return Stream.of(as, bs).collect(toList());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        //bufferedWriter.write(
         String resultStr =  result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n";
       // );
         
         System.out.println(resultStr);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
