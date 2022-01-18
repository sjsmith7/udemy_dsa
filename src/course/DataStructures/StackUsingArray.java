package course.DataStructures;

import java.util.ArrayList;

public class StackUsingArray {
    ArrayList<Integer> data;

    public StackUsingArray() {
        ArrayList<Integer> data = new ArrayList<>();
    }

    public void push(int value) {
        data.add(-1, value);
    }

    public Integer pop() {
        return data.remove(-1);
    }

    public Integer peek() {
        return data.get(-1);
    }

    public void printNodesTopToBottom() {
        for (int item: this.data){
            System.out.println(item);
        }
    }
}
