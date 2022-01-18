import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstRecurringCharacter {
    List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    public FirstRecurringCharacter() {
        this.addAll();
    }

    public Integer findFirstRecurringCharacterForArrayOne() {
        HashMap<Integer, String> hMap = new HashMap<>();

        for (int i = 0; i < arr1.size(); i++) {
            if (!hMap.containsKey(arr1.get(i))) {
                hMap.put(arr1.get(i), "");
            } else {
                return arr1.get(i);
            }
        }
        return new Integer(1111);
    }

    public Integer findFirstRecurringCharacterForArrayTwo() {
        HashMap<Integer, String> hMap = new HashMap<>();

        for (int i = 0; i < arr2.size(); i++) {
            if (!hMap.containsKey(arr2.get(i))) {
                hMap.put(arr2.get(i), "");
            } else {
                return arr2.get(i);
            }
        }
        return new Integer(1111);
    }

    private void addAll(){
        arr1.add(2);
        arr1.add(5);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(5);
        arr1.add(1);
        arr1.add(2);
        arr1.add(4);

        arr2.add(2);
        arr2.add(1);
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(1);
        arr2.add(2);
        arr2.add(4);
    };
}
