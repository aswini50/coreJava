package coreJavaInterview;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strings {

public static void main(String[] args) {
	
String input_sentence = new String("Aswini 1 is 2 java 3 Student 4");
System.out.println(input_sentence);
int sentLength = input_sentence.length();


for(int i=0;i<sentLength;i++) {
Pattern p = Pattern.compile("[0-9]");
Matcher m = p.matcher(Character.toString(input_sentence.charAt(i)));
if(m.matches()) {
System.out.println(input_sentence.charAt(i));
}

}
}
}
