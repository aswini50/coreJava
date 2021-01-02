package coreJavaInterview;

import java.util.HashMap;

public class StringDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to print duplicate characters from String (m, a, l should be printed)
		
		String origStr= "Malayalams";
		
		char origStrChar[] =origStr.toLowerCase().toCharArray();
		int len = origStr.length();
		System.out.println("String length" +len);
		int i,j,k,l ;
		int countStr =1;
		HashMap<Character, Integer> dup = new HashMap<Character, Integer>();
		
		for (i=0;i<len;i++){
			
			if (dup.containsKey(origStrChar[i])){
				
				
				dup.put(origStrChar[i],countStr+1);
				
			}
			
			else 
			{
				dup.put(origStrChar[i],countStr);	
			}
			
		}
		
		//WAP to find count the occurrence of a given character in String (Requires Hash Map) Park it till Mukesh covers 
		
		System.out.println(dup);
		
		//WAP to remove all duplicates from a given string
		System.out.println(dup.size());
		for (k =0;k< dup.size();k++)
		if(dup.get(origStrChar[k]) >1) {
			dup.remove(origStrChar[k]);
		}
		System.out.println(dup);
		
		// WAP to remove a given character from String
		
		CharSequence charToRemove = "y";
		String newStr = origStr.replace(charToRemove, "");
		
		System.out.println("New String : "+ newStr);
		
	}
		
	
	
	
	}
	
	
	

