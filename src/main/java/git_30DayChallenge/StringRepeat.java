import java.util.function.IntPredicate;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcac";
		long n = 1000000000000l;
		
		long rt = n/str.length();
		long rmch = n%str.length(); 
		
		IntPredicate p = i -> i==97;
		long acount = str.chars().filter(p).count();
		
		System.out.println(acount);
		
		acount = acount * rt;
		
		int i = 0;
		while(i < rmch){
			if(str.charAt(i) == 'a')
				acount++;
			i++;
		}
		
		System.out.println(acount);

	}

}
