import java.util.Scanner;

public class BinaryCount {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        String binStr = Integer.toBinaryString(n);
        char[] ch = binStr.toCharArray();
        long count = 0, result = 0;
        for(int i=0; i<ch.length; i++){
        	if(ch[i] == '1'){
        		++count;
        		result = Math.max(result, count);
        	}	
        	else
        		count = 0;
        }
        System.out.println(result);
    }
}
