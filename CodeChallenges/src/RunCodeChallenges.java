public class RunCodeChallenges {

    public static void main(String[] args) {
        // ReverseStringTest();
        // MergeTwoSortedArraysTest();
        // FirstRecurringCharacterTest();
        ReverseString reverseStringTest = new ReverseString("fred");
        reverseStringTest.revStringAnotherWay();
    }


    public static void ReverseStringTest() {
        ReverseString rString = new ReverseString("shai");
        System.out.println(rString.getStringReversed());
    }
    public static void MergeTwoSortedArraysTest() {
        MergeTwoSortedArrays msa = new MergeTwoSortedArrays();
        System.out.println(msa.MergeTwoSortedArraysFunc());
    }

    public static void FirstRecurringCharacterTest() {
        FirstRecurringCharacter frc = new FirstRecurringCharacter();
        Integer firstChar = frc.findFirstRecurringCharacterForArrayOne();
        Integer secondChar = frc.findFirstRecurringCharacterForArrayTwo();
        System.out.println(firstChar);
        System.out.println(secondChar);

    }

}
