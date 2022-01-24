import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString
{
    String stringToReverse;

    public ReverseString(String reverseMe){
        stringToReverse = reverseMe;
    }


    public String getStringReversed() {
        List<String> backwards = new ArrayList<>();
        // put the String into a list
        List<String> stringList = Arrays.stream(stringToReverse.split("")).toList();

        for (int i = stringList.size()-1; i == 0; i--) {
            backwards.add(stringList.get(i));
        }
        return String.join("", backwards);
    }

    public void revStringToAnotherString() {
        String str = stringToReverse;
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            newStr = character + newStr;
        }
        System.out.println(newStr);
    }

    public void revStringAnotherWay() {

        String str = stringToReverse;
        System.out.println("Before: " + str);
        char[] myCharArray = new char[str.length()];

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            myCharArray[myCharArray.length-count] = str.charAt(i);
            count++;
        }
        String strToReturn = new String(myCharArray);

        System.out.println(strToReturn);
    }

}
