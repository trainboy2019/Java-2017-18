package xyz.ikerolader;

import java.util.Arrays;
import java.util.List;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int notFoundPsn = sample.indexOf("ic");
		System.out.println("sample.indexOf(\"ic\") = " + notFoundPsn);
		
		
		
		List<String> x=Arrays.asList(sample.split(" "));
		if(x.contains("brown")) {
			System.out.println("lol");
		}
		
		
		List<String> splitStatement=Arrays.asList(sample.split(" "));
		List<String> keys=Arrays.asList("brown fox jumper".split(" "));
		int[] locations = {0};
		int currentKey=0;
		for (int i=0;i<splitStatement.size();i++) {
			if (currentKey>keys.size()) {
				currentKey=keys.size();
			}
			if(splitStatement.get(i)==keys.get(currentKey)) {		//User mentions keyphrase
				currentKey++;
				locations[locations.length]=i;
			}
		}
		for (int j=0;j<locations.length-2;j++) {
			if (locations[j++]+1!=locations[j+2]) {
				System.out.println("false");
			}
		}
		System.out.println("true");
		

	}
	
	

}
