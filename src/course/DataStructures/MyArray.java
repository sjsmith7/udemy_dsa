package course.DataStructures;


import java.util.HashMap;

public class MyArray {
    public int length = 0;
    public HashMap<Integer, String> data;

    public MyArray() {
        this.length = 0;
        this.data = new HashMap<Integer, String>();
    }

    public String getData(Integer index) {
        return this.data.get(index);
    }

    public Integer push(String item) {
        this.data.put(this.length, item);
        this.length++;
        return this.length;
    }

    public HashMap<Integer, String> pop() {
        String lastItem = this.data.get(this.length -1);
        this.data.remove((this.length-1));
        this.length--;
        return this.data;
    }

    public String delete(int itemAtIndex){
        String itemData = this.data.get(itemAtIndex);
        shiftItems(itemAtIndex);
        this.length--;
        return itemData;
    }

    private void shiftItems(int index) {
        for (int i = index; i < this.length-1; i++ ) {
            String nextData = this.data.get(i + 1);
            this.data.put(i, nextData);
        }
        // remove the last item
        this.data.remove(this.length-1);
    }
}
