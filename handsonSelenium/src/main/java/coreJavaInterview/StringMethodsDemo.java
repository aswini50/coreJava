package coreJavaInterview;


import java.util.Arrays ;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.checkerframework.checker.units.qual.Length;

import io.netty.util.internal.SystemPropertyUtil;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello" ;
		String str2="Hello";
		
		String str3="hello";
		
		String str4="Hello World Welcome to Java";
		
		
		//Basic Methods
		char charData =str1.charAt(1);
		System.out.println(charData);
		String strUpper = str1.toUpperCase();
		System.out.println("Upper Case " + strUpper);
		String strLower =str1.toLowerCase();
		System.out.println("Lower Case " + strLower);
		System.out.println("Original String is immutable " + str1 );
		
		//Comparison Methods
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3));//true
		System.out.println(str1.equals(str4));//false
		
		//Contains Methods
		System.out.println(str1.contains("Java"));//false
		System.out.println(str4.contains("Java"));//true
		
		//Starts and Ends With Methods
		System.out.println(str4.startsWith("Hello"));//true
		System.out.println(str4.endsWith("Bye"));//false
		
		//String array
		String mess="Customer id is 8971";
		//Split Method
		String[] arr = mess.split(" ");
		String data = arr[3];
		//Integer is Wrapper Class and parseInt is method
		int myInt = Integer.parseInt(data);
		System.out.println(myInt);
		int id = 897;
		
		if(id == myInt){
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
			
		}
		
		
		//  WAP to count a number of words in String
		
		String[] revisedStr =  str4.split(" ");
		int strCount = revisedStr.length;
		System.out.println("The no. of words in this String is: "+ strCount);
		
		
		//  WAP to check if two given String is the anagram of each other
		
		String strAnagram1 = "ikte" ;
		String strAnagram2 = "Kite" ;
		
		int strAnagram1Len = strAnagram1.length();
		int strAnagram2Len = strAnagram2.length();
		System.out.println(strAnagram1.compareToIgnoreCase(strAnagram2));
		if (strAnagram1Len == strAnagram2Len) {
			{
				if(strAnagram1.compareToIgnoreCase(strAnagram2) ==0)  {
					System.out.println(strAnagram1.compareToIgnoreCase(strAnagram2));
					System.out.println("This words are anagrams !");
				}
				else {
					System.out.println("Sorry, these words are not anagrams");
				}
			}
			
		}
		else 
		{
			System.out.println("Sorry, these words are not anagrams");
			
			
		}
		
		// Another logic (Reference tutorial)
		char arrStr1[] =strAnagram1.toLowerCase().toCharArray() ;
		char arrStr2[] =strAnagram2.toLowerCase().toCharArray();
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
        if(Arrays.equals(arrStr1,arrStr2)){
        	System.out.println("Hey, these two words are anagrams!!!");
        	
        }
        else{
        	System.out.println("Sorry, not anagrams!");
        }
		
        // Palindromes
        
        String palStr = "Arora" ;
        String palRev="";
        int palLen = palStr.length();
        int m,n;
        
        for(m=palLen-1;m>=0;m--) {
        	palRev= palRev + palStr.charAt(m);
        }
        
        if (palRev.equalsIgnoreCase(palStr)) {
        	System.out.println("Yes, This is a palindrome !!! Congrats");
        }
        else{
        	System.out.println("Sorry, not a palindrome");
        }
        
        //Palindromes using array
        
        String palRevArr ="";
        char[] palStrOriginalChar = palStr.toCharArray(); 
        
        for(m=palLen-1;m>=0;m--) {
        	  		
        		palRevArr = palRevArr + palStrOriginalChar[m];	
        		System.out.println(palRevArr);
        }
        
        	System.out.println("Reversed String is: "+ palRevArr);
        	System.out.println("Original String is : " + palStr );
        if (palRevArr.toLowerCase().equals(palStr.toLowerCase())){
        	System.out.println("Yes, Palindrome");
        }
        
        else{
        	System.out.println("Sorry, not a palindrome");
        } 
	  //  WAP to print all permutation of a String --> ON HOLD
      
      //  WAP to find the first non-repeating character in a given String
        
      /* char[] strOccurence = palStr.toCharArray();
       int z;
       int valuez=1;
       HashMap<Character, Integer> dup = new HashMap<Character, Integer>() ;
       for (z=0;z<=palLen;z++){
    	   if (dup.containsKey(strOccurence[z]))
    	   {
    		   dup.put(strOccurence[z],valuez+1);
    		   
    	   }
    	   else {
    		   dup.put(strOccurence[z], valuez);
    	   }
    	   //System.out.println(dup);
       }
        */
      //  WAP to check if a String contains only digits?
      //Option 1 :  (Using regex)
      
              		

	// Convert numbers in string to int
	
	String numStr ="123";
	int numInt = Integer.parseInt(numStr);	
		System.out.println("The integer from the String is : "+ numInt);
	
	
		
		 //WAP to convert a byte array to String
		
		byte[] byteArr = {'a','1','c'} ;
		String byteStr = new String(byteArr);
		System.out.println("Byte array converted to String : "+ byteStr );	
				
		}
	}
	






