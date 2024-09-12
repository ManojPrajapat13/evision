package Evision;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "ram";
		String s2 = "ram";
		String s3 = new String("ram");
		String s6 = new String("ram");
		System.out.println(s3.equals(s6)); // t
		String s4 = "hdhd";
		String s5 = "asdfghjkl";
		System.out.println(s1.equals(s2)); // t
		System.out.println(s1.equals(s3)); // t
		System.out.println(s1.equals(s4)); // f

		System.out.println(s1 == s2); // t same memory location
		System.out.println(s1 == s3); // f
		System.out.println(s5 == s4); // f

		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // 0
		System.out.println(s1.compareTo(s4)); // 10
		System.out.println(s4.compareTo(s1)); // -10
		System.out.println(s1.compareTo(s5)); // 17
		System.out.println(s5.compareTo(s1)); // -17
		System.out.println(s5.compareTo(s4)); // -7
		System.out.println(s4.compareTo(s5)); // 7
		
		String text= new String("Hello, My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split(" ");  
        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length );
        for(int i = sentences.length -1 ; i>= 0 ; i--) {
        	System.out.print(sentences[i]+ "--");
        }System.out.println("----------");
        
        String s="Sachin";  
        s.concat(" Tendulkar"); //concat() method appends the string at the end  
        System.out.println(s);  //will print Sachin because strings are immutable objects  
        
	}
}
