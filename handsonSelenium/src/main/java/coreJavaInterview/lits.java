package coreJavaInterview;
import java.util.HashMap;

public class lits {

public static void main(String[] args) {
String[] names = {"a","b","c","d","e","f"};
//int[] numbers = {1,1,3,1,4,3,5,3,2,2,5,2,3,4,5};
int[] numbers ={4,4,5,6,7,5};
HashMap<Integer,Integer> map = new HashMap();
for(int i=0;i<numbers.length;i++) {
if(map.containsKey(numbers[i])) {
int value = map.get(numbers[i]);
map.put(numbers[i], value+1);
System.out.println(map.toString());
}else {
map.put(numbers[i], 1);
System.out.println(map.toString());
}
}
System.out.println(map.toString());
}
}
