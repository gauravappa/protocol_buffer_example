package com.example.java.programming.d.dataevolution;

public class DataEvolution {

	public static void main(String[] args) {
		
		/* Rules For Data Evolution : 
		 * 1. Dont Change Numeric Tags for existing fields
		 * 2. You can add new fields old code will just ignore them.
		 * 3, if code reads unknown data then default value takes place
		 * 4. field can be removed as long as tag number is never used again in newer fields
		 *    you can make field OBSOLUTE_ to say that it is no longer in used
		 *    or you can make tag reserved 
		 *    
		 */
		
		/* Adding new field
		 * You can add new field by defining field with new tag
		 * any old code that reads this new proto will just ignore it
		 * any new code that reads old code will use default value for new fields
		 * therefore handle default value with care
		 */
		
		/* Renaming field name :
		 * You can freely change field name because it does not require while serializing only tag is used
		 */
		
		
		
		/* Removing field
		 * if old code read new data then default value takes place in old code
		 * if new code read old data then field is just dropped
		 * always reserve name and tag when removed
		 * reserved "first_name"; reserving field
		 * reserved 2;  //reserving tag
		 * we reserve to avoid serialization conflict in forward and backward compatibility
		 * you cannot reserve tag and name in same reserved line .
		 * reserved 9 to 11,10;
		 * reserved "first_name","last_name";
		 */ 
	}
	
}
