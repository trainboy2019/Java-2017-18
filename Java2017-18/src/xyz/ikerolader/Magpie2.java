package xyz.ikerolader;

import java.util.Arrays;
import java.util.List;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses funcctions and if else statements to handle default responses.
 * @author Laurie White, edited by Ike Rolader
 * @version April 2012, January 2018
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";							//Intro
	}
	
	
	/**
	 * Checks a user statement for any key words
	 * 
	 * @param statement
	 *            the user statement
	 * @param key
	 *            the keywords separated by a space
	 * @return true if the word is in statement
	 */
	public Boolean checkStatement(String statement, String key) {
		List<String> splitStatement=Arrays.asList(statement.split(" "));
		List<String> keys=Arrays.asList(key.split(" "));
		for (int i=0;i<keys.size();i++) {
			if(splitStatement.contains(keys.get(i))) {		//User mentions keyphrase
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Gets the number word of the given keyword
	 * 
	 * @param statement
	 *            the user statement
	 * @param key
	 *            the keywords separated by a space
	 * @return the number word the key is
	 */
	public int getStatementIndex(String statement, String key) {
		List<String> splitStatement=Arrays.asList(statement.split(" "));
		List<String> keys=Arrays.asList(key.split(" "));
		for (int i=0;i<keys.size();i++) {
			if(splitStatement.contains(keys.get(i))) {		//User mentions keyphrase
				return splitStatement.indexOf(keys.get(i));
			}
		}
		return -2;
	}
	
	/**
	 * Checks a user statement for a sequence of words
	 * 
	 * @param statement
	 *            the user statement
	 * @param key
	 *            the keywords separated by a space
	 * @return true if the sequence is in the statement
	 */
	public boolean checkStatementSequence(String statement, String key) {
		List<String> keys=Arrays.asList(key.split(" "));
		int numToCheck=getStatementIndex(statement,keys.get(0))+1;
		for (int i=1;i<keys.size();i++) {
			if(numToCheck==getStatementIndex(statement,keys.get(i))) {
				numToCheck=getStatementIndex(statement,keys.get(i))+1;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	
	public String getResponse(String statement)
	{
		String response = "";
		List<String> splitStatement=Arrays.asList(statement.split(" "));
		if(checkStatement(statement,"no")) {					//User says no
			response="Why so negative?";
		}
		else if(checkStatement(statement,"mother father sister brother")) {		//User mentions family 
			response="Tell me more about your family";
		}
		//Template
//		if(checkStatement(statement,"")) {		//User mentions 
//			response="";
//		}
//		else 
		else if(checkStatement(statement,"cat dog")) {		//User mentions cats or dogs
			response="Tell me more about your pets";
		}
		else if(checkStatement(statement,"Kecia")) {			//User mentions Kecia
			response="She sounds like a good teacher.";
		}
		else if(checkStatement(statement,"VGhpcyBpcyBhIHJlYWxseSBpbnRlcmVzdGluZyBzdGF0ZW1lbnQu")) {		//User mentions secret string
			response="This is a really interesting statement.";
		}
		else if(checkStatement(statement,"butterfly")) {		//User mentions butterfly
			response="Sphere";
		}
		else if(checkStatement(statement,"golf")) {			//User mentions golf
			response="ball";
		}
		else if(statement.trim().isEmpty()) {				//User says nothing  
			response="SAY SOMETHING!!!";
		}
		else if(checkStatementSequence(statement,"I like")) {									//Check for "I like <something>"
			int location=getStatementIndex(statement,"like")+1;								//Get <something>'s location
			response="What do you like about "+splitStatement.get(location)+"?";
		}
		else if(checkStatementSequence(statement,"I want")) {									//Check for "I want <something>"
			int location=getStatementIndex(statement,"want")+1;								//Get <something>'s location
			response="Would you really be happy if you had "+splitStatement.get(location)+"?";
		}
		else
		{
			response = getRandomResponse();					//User did none of the above
		}
		return response;
	}
		
		/**else if (statement.indexOf("cat") >= 0				//User mentions pets
				|| statement.indexOf("dog") >= 0)			//
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Kecia") >= 0)			//User mentions Kecia
		{
			response = "She sounds like a good teacher.";
		}
		else if (statement.indexOf("VGhpcyBpcyBhIHJlYWxseSBpbnRlcmVzdGluZyBzdGF0ZW1lbnQu") >= 0)	//Secret string
		{
			response = "This is a really interesting statement.";
		}
		else if (statement.indexOf("butterfly") >= 0)			//User mentions butterfly
		{
			response = "Sphere";
		}
		else if (statement.indexOf("golf") >= 0)			//User mentions golf
		{
			response = "Ball";
		}
		else if (statement.trim().isEmpty())					//User doesn't say anything
		{
			response = "SAY SOMETHING!!!";
		}
		
		
	}*/


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		String[] responseOptions= {
				"Interesting, tell me more.",
				"Hmmm.",
				"Do you really think so?",
				"You don't say.",
				"Really?",
				"Umm..."
				};
		double r = Math.random();
		int whichResponse = (int)(r * responseOptions.length);
		String response = responseOptions[whichResponse];
		return response;
	}
		
		/*{if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Really?";
		}
		else if (whichResponse == 5)
		{
			response = "Umm...";
		}*/
	
	
	//This is here to allow me to use a plug-in to collapse unused code. It needs a function beneath it.
	@SuppressWarnings("unused")
	private void comments() {}
	
	
		
}
