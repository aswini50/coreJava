package coreJavaInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input_sentence = "aeioufcc";
	       System.out.println(input_sentence);
	      
	       int sentLength = input_sentence.length();


	       for(int i=0;i<sentLength;i++) {
	       System.out.println("in for loop");
	       Pattern p = Pattern.compile("[0-9]");
	       Matcher m1 = p.matcher(Character.toString(input_sentence.charAt(i)));
	       if(!m1.matches()) {
	       System.out.println("Sorry , this is an alphanumeric");
	       break ;
	       }
	       else
	       {
	    	   if(i==sentLength-1)
	    	   {
	    	   System.out.println("Yes, this contains only numerics");
	    	   
	    	   }
	       }
	       
	       }  
	       // WAP to count a number of vowels and consonants in a String
	       
	    	   
	      Pattern vowelP = Pattern.compile("[a,e,i,o,u]");
	      Pattern alphaP = Pattern.compile("[a-z]");
	      int vowelCount =0;
	      int consCount=0;
	      //char[] inp = input_sentence.toLowerCase().toCharArray();
	     for( int i = 0 ;i<sentLength;i++){
	    	 System.out.println("In 2nd loop");
	    	 Matcher alphaM = alphaP.matcher(Character.toString(input_sentence.charAt(i)));
	    	 Matcher vowelM	=vowelP.matcher(Character.toString(input_sentence.charAt(i)));
	    	 
	    	 if(alphaM.matches())
	    	 {
	    		 System.out.println("Inside if");
	    		 if(vowelM.matches()){
	    			 vowelCount ++;
	    			 System.out.println(vowelCount);
	    		 }
	    		 else{
	    			 consCount ++;
	    			 
	    		 }
	    
	    			 
	    		 }
	    	 else {
	    		 System.out.println("inside else");
	    		 if (i == sentLength-1){
	    			 
	    			 if ((vowelCount == 0 ) || (consCount == 0)) {
	    				 System.out.println("Sorry, this sentence has no alphabets");
	    			 }
	
	    				 
	    			 }
	    		 }
	    	
	     }
	   System.out.println("Vowel Count is : " + vowelCount);
		 System.out.println("Consonant Count is : " + consCount);
	     }
	     

	}


	


