package course.DataStructures;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList() {

    }

    public void prepend(int data) {
        Node newHeadNode = new Node(data);
        //(for doubly) the current head will move to position 2 so we need to give it a previous node of the new node in position 1
        this.head.prev = newHeadNode;
        // the new head node next will be the previous head node
        newHeadNode.next = this.head;
        // now set the head to be the new node with it's next being the prev head
        this.head = newHeadNode;
        this.length++;
    }

    // insert at location (index) with the given value
    public void insert(int index, int value) {
        Node newNode = new Node(value);
        // if inserting at the beginning
        if (index == 0){
            this.prepend(value);
        }
        // if the index is > than the length of the linked list, just append it
        if (index >= this.length){
            // faster 0(1) than using append 0(n)
            this.appendUsingTail(value);
        }

        int nodeCounter = 0;
        Node prevNode = null;
        Node currentNode = this.head;
        // 1, 10, **INSERT 666 HERE**, 20, 30, 40
        while (currentNode != null) {
            if (index == nodeCounter) {
                // get the previous node, and make it's next the new node
                prevNode.next = newNode;
                newNode.prev = prevNode; // (for doubly)
                // make the new nodes next to be the rest of the nodes (which is the current node)
                newNode.next = currentNode;
                currentNode.prev = newNode; // (for doubly)
                length++;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            nodeCounter++;
        }
    }

    public void remove(int index){

        int nodeCounter = 0;
        Node prevNode = null;
        Node currentNode = this.head;
        Node next = null;
        // 1, 10, Removethis**666***, 20, 30, 40
        while (currentNode != null) {
            if (index == nodeCounter) {
                // we need to remove currentNode
                // so point the previous node to the next node, this drops the reference to the current node
                prevNode.next = currentNode.next;
                length--;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            nodeCounter++;
        }
    }


    //0(n)
    public void append(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        // if we haven't got a head, create it
        if (this.head == null){
            this.head = newNode;
            this.length = 1;
        } else {
            // Start with the head
            Node node = this.head;
            // traverse the next nodes until we find the last (by null)
            while (node.next != null){
                node = node.next;
            }
            // we know we have the last node, and now append the new node to the last
            node.next = newNode;
            newNode.prev = node; //for doubly
            this.length++;
        }
    }

    // 0(1)
    public void appendUsingTail(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        // if we haven't got a head, create it
        if (this.head == null) {
            this.head = newNode;
            this.length = 1;
            // also set the tail to be the head
            this.tail = head;
        } else {
            // as tail points to the head location in memory in the if statement, we can update the head next object to be new tail
            newNode.prev = this.tail; //for doubly
            // after the head is created, the next node below sets the heads.next to be the newNode (this.tail pointer to head)
            this.tail.next = newNode;
            // this now sets the tail to be the newNode, the above line so now we have Head->[1]--[2]-<Tail
            this.tail = newNode;
            this.length++;
            // we have a new node

        }
    }

    public void printListItemsData(){
        Node node = this.head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public void printPrev(){
        Node node = this.tail;
        while (node != null) {
            System.out.println(node.data);
            node = node.prev;
        }
    }

    public int getLength() {
        System.out.println("Item count in linked list: " + this.length);
        return this.length;
    }

    public void reverseLinkedList() {
        Node first = this.head;
        Node second = this.head.next;
        // get first, get second
        while (second != null){
            // get second.next
            Node getThird = second.next;
            // the current second now has a next of the first, so given [10, 20], 20.next points to 10
            second.next = first;
            // now do the swap [20, 10]
            first = second;
            // [20, 10] and now point 10 to the third item
            second = getThird;
        }
        this.head.next = null;
        this.head = tail;
    }

    public void reverseLinkedListTwo(){
        // https://www.youtube.com/watch?v=D7y_hoT_YZI
        Node current = this.head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;

            current = next;
        }
        this.head = prev;
    }
}