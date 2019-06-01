/**.
* Program to remove consonants one after another from a string and check if it is a valid string
* @author Praneeth Kumar V (pkv@st-andrews.ac.uk)
* @version 1
*/
import java.util.ArrayList;
import java.util.Arrays;
public class LostConsonants {
/**.
*To take arguments from command line and remove consonants one after another from a string and check if it is a valid string from given dictionary file
* @param args dictionary and input string
*/
 static final int LEN = 5;
 public static void main(String[] args) {
  int numOfAlternatives = 0;
  if (args.length != 2) {
   System.out.println("Expected 2 command line arguments, but got " + args.length + ".\nPlease provide the path to the dictionary file as the first argument and a sentence as the second argument.");
  }
  else {
   ArrayList<String> lines = FileUtil.readLines(args[0]);
   if (!args[0].substring(args[0].length() - LEN).equals("words")) {
    System.out.println("Invalid dictionary, aborting.");
   }
   else {

   String input = args[1];
   char[] inputArray = args[1].toCharArray();
   String vowels = "aeiouAEIOU ,.";

    for (int i = 0; i <= inputArray.length - 1; i++) {

     if (vowels.indexOf(inputArray[i]) < 0) {

      String newInput = input.substring(0, i) + input.substring(i + 1);
      numOfAlternatives = numOfAlternatives + checkDictionary(lines, newInput);

     }

    }
    if (numOfAlternatives > 0) {
     System.out.println("Found " + numOfAlternatives + " alternatives.");
    }
    else {
     System.out.println("Could not find any alternatives.");
    }
   }
  }
 }




 public static int checkDictionary(ArrayList<String> list1, String stringToCheck) {
 /**.
 *To check if given string is valid or not from given dictionary list
 * @param args word list and input string
 */
  int counter = 0;
  String cleanString = stringToCheck.replace(",", "").replace(".", "").toLowerCase();
  String[] splitString = cleanString.trim().split("\\s+");
  ArrayList<String> copyList = new ArrayList<String>();

   for (String copyWord : list1) {
    copyList.add(copyWord.toLowerCase());
   }

   for (int j = 0; j < splitString.length; j++) {

    if (copyList.contains(splitString[j])) {
     counter++;
    }
   }
   if (counter == splitString.length) {
    System.out.println(stringToCheck); return 1;
   }
   else {
    return 0;
   }
}
}


