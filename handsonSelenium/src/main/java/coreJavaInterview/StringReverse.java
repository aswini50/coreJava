package coreJavaInterview;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "Happy";
		char strChar[] =originalStr.toCharArray();
		int lenStr =originalStr.length();
		int i ;
		String rev="";
		for(i= lenStr-1; i>=0;i--)
		{
			rev =rev + strChar[i];
			System.out.println(rev);
			
		}
		 System.out.println(rev);
		 
		 
		/* This is not working due to null pointer ==> Mukesh to review
		 * int lenStr =originalStr.length();
		char letters[] = null  ;
		int i ;
		for(i= lenStr-1; i>=0;i--)
		{
			letters[i] =originalStr.charAt(i);
			System.out.println(letters[i]);
			
		} */
		
		
	}

}
