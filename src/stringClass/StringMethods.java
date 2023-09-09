package stringClass;

public class StringMethods
{
	public static void main(String[] args)
	{
		String str = new String("Nagpur");
		String s1 = "Mumbai";
		String s2 = "Mumbai";
		System.out.println(str);
		System.out.println(str.toLowerCase());  // nagpur//Converts a string to lower case letters
		
		System.out.println(str.toUpperCase()); //NAGPUR //Converts a string to upper case letters
		
		System.out.println(str.charAt(2));      //g  / /Returns the character at the specified index (position)
		
		System.out.println(str.length());       //6 //Calculate string length
		
		System.out.println(s1.equals(s2));    //true //Compares two strings Returns true if the strings are equal, and false if not
		
		System.out.println(str.isEmpty());    //false //Checks whether a string is empty or not
		
		System.out.println(str.concat(s2));    //	NagpurMumbai //concat a string to the end of another string
		
		System.out.println(str.startsWith("N"));   //true  //Checks whether a string starts with specified characters
		
		System.out.println(str.endsWith("r"));     //true       //Checks whether a string ends with specified characters
		
		System.out.println(str.trim());            //Nagpur      //Removes whitespace from both ends of a string
		
		System.out.println(str.equalsIgnoreCase(s1));  //false//	Compares two strings, ignoring case considerations
		
		System.out.println(str.indexOf("g"));         //2    //	It returns the specified char value index.
		
		System.out.println(str.lastIndexOf("r"));      //5   //Returns the position of the last found occurrence of specified characters in a string
		
		System.out.println(str.substring(2));      //gpur    //Returns a new string which is the substring of a specified string
		
		System.out.println(str.substring(1,4));  //agp       //It returns substring for given begin index and end index.
		
		System.out.println(s1.contains("Mumbai"));  //true        //Checks whether a string contains a sequence of characters
		
		System.out.println(str.replace('N', 'n'));   //nagpur       //returns a new string where the specified values are replaced
		
		System.out.println(str.replaceAll("a","b"));  // Nbgpur      //replace char one to another
		
		System.out.println(str.hashCode());                //hashcode
	
	}

}
