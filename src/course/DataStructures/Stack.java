package course.DataStructures;

// Stack using LinkedList
public class Stack {
    Node top;
    Node bottom;
    int length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;

    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.bottom = newNode;
            this.top = newNode;
        } else {
            // Top down approach, the new node will be the new top, so the item below (it's next) it will be the current top
            newNode.next = this.top;
            // now our new node is the top
            this.top = newNode;
        }
        this.length++;
    }
    public Node pop() {
        if (this.top == null){
            return null;
        }
        if (this.top == this.bottom){
            this.bottom = null;
        }
        // The node underneath the top becomes the new top, return the old top
        Node top = this.top;
        this.top = top.next;
        this.length--;
        return top;
    }

    public Node peek() {
        // just want to see the highest/top item on the stack
        return this.top;
    }

    public void printNodesTopToBottom() {
        Node top = this.top;
        while (top != null) {
            System.out.println(top.data);
            top = top.next;
        }
    }
}
