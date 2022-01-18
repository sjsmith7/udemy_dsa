import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString
{
    String stringToReverse;

    public ReverseString(String reverseMe){
        stringToReverse = reverseMe;
    }


    public String getStringReversed(){
        List<String> backwards = new ArrayList<>();
        // put the String into a list
        List<String> stringList = Arrays.stream(stringToReverse.split("")).toList();

        for (int i = stringList.size()-1; i == 0; i--) {
            backwards.add(stringList.get(i));
        }
        return String.join("", backwards);
    }

}
