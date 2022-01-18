package course.DataStructures;

public class Queue {
    int length;
    Node front;
    Node rear;

    public Queue() {
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    // Add to the end of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            // start the queue
            this.front = newNode;
            this.rear = newNode;
        } else {
            // the rear moves while the front stays constant.
            // The current rear now points to the new node
            // when the queue has a single entry, the front will point to the rear, so rear.next updates the front.next Node to the new node
            // while still maintaining the this.front pointer
            this.rear.next = newNode;
            // and now the new node is the rear
            this.rear = newNode;
        }
        this.length++;
    }

    // grab the first from the queue
    public Node dequeue() {
        if (this.length == 0){
            return null;
            //We don't have anything in the queue
        }
        if (this.front == this.rear){
            // we are removing the last item from the queue
            // so we need to clean up the rear pointer otherwise it will still contain a pointer to the last
            this.rear = null;
        }

        Node front = this.front;
        this.front = this.front.next;
        this.length--;
        return front;
    }
    
    public int peek() {
        Node front = this.front;
        return front.data;
    }

    public void printQueue(){
        Node node = this.front;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
