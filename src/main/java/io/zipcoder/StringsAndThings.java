package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int words = 0; // set word counter to 0
        for (int i = 0; i < input.length(); i++) { //for loop to loop through the string
            if (input.charAt(i) == 'y' || input.charAt(i) == 'z') { // searching for y and z in 'input'
                if ((i == (input.length() - 1)) || !Character.isLetter(input.charAt(i + 1))) {// checks if the last letter is y or z, also checks if the space after the end of teh word is blank
                    words++;//increments the count
                }
            }
        }
        return words;
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String input = base;
        input = input.replace(remove, ""); // places 'remove' with empty ""
        return input; // return input.replace(remove, ""); - condensed return statement

        //Below works as well more complicated
//        int find = 0; //stores the index of the substring 'remove' in the base string
//        int previous = 0; //keeps track of the end of the last non-matching segment in base string
//        StringBuilder result = new StringBuilder(base.length());//initialize stringbuilder named result equal to the length of the base string.
//        // this will store the string after all 'remove's have been removed
//        while ((find = base.indexOf(remove, previous)) >=0){ //searches from substring 'remove' in 'base' string from index 'previous
//            //the result is assigned to find
//            // continues as long as the substring was found
//            result.append(base.substring(previous, find));//Extracts the substring from 'base' starting at 'previous' and ending just before 'find'.
//            //Appends this non-matching segment to the result StringBuilder.
//            previous = find + remove.length();//Updates previous to the index just after the end of the found substring remove
//        }
//        result.append(base.substring(previous));//extracts the substring  from 'base', starting at previous to th end of the string
//        //& appends this remaining segment to the 'result' stringbuilder.
//        return result.toString();
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        String removeNot = input.replaceAll("not", "");//removes all 'not's from input
        String removeIs = input.replaceAll("is", "");//removes all 'is'

        int notCount = (input.length() - removeNot.length()) / 3; //calculates # of characters removed after 'not' was removed
        int isCount = (input.length() - removeIs.length()) /2;
        //Since each "not" substring has 3 characters, dividing by 3 gives the count of "not" substrings in the original input string

        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        Boolean result = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }



    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
