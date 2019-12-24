import java.util.Scanner;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");//to skip new line or line separator or paragraph separator or next line  
        c = scan.nextLine(); //reads from end of previous value till beginning of next val hence we use scanner skip to skip new line char, otherwise it returns empty string
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println( i+a );

        /* Print the sum of the double variables on a new line. */
        System.out.printf("%.1f %n",d+b);//%n represents new line
		//System.out.println();
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+c);
        scan.close();
    }
}