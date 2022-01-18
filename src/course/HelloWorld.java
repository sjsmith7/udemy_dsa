package course;

import course.DataStructures.*;
import course.Algorithms.*;

public class HelloWorld {

    public static void main(String[] args) {
        //true == test run.
        ArrayTest(false);
        LinkedListTest(false);
        StackTest(false);
        QueueTest(false);
        BinarySearchTreeTest(false);
        GraphTest(false);
        RecursionTest(false);
        SortingTest(false);
    }
    public static void SortingTest(Boolean runTest) {
        if (!runTest) {
            return;
        }
        Sorting sort = new Sorting();

    }

    public static void RecursionTest(Boolean runTest) {
        if (!runTest) {
            return;
        }
        Recursion rec = new Recursion();
        // Factorial
        System.out.println(rec.NonRecursiveFactorial(5));
        System.out.println(rec.Factorial(5));

        // Fibonacci
        System.out.println(rec.FibonacciNonRecursiveDynamic(5));
        System.out.println(rec.Fibonacci(3));

        // Traverse tree using recursion
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(25);
        // start at the root node. The node with a value of 10 is the root.
        rec.traverseTree(bst.lookup(10));

        // question
        System.out.println(rec.reverseStringWithRecursion("fred"));
    }

    public static void GraphTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        // now add the edges
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(0, 1);
        graph.addEdge(5, 6);
        graph.showConnections();
    }

    public static void BinarySearchTreeTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(25);
        System.out.println("test");
        System.out.println(bst.lookup(25).value);
        System.out.println(bst.lookupSimple(25).value);
    }

    public static void QueueTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        Queue myQ = new Queue();
        myQ.enqueue(10);
        myQ.enqueue(20);
        myQ.enqueue(30);
        System.out.println("First node removed: " + myQ.dequeue().data);
        System.out.println("First node is now: " + myQ.peek());
        myQ.dequeue();
        myQ.dequeue();
        // should have nothing in the queue
        myQ.printQueue();
    }

    public static void StackTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.printNodesTopToBottom();
        Node test = myStack.pop();
        System.out.println("Should be 30: " + test.data); // should be 30
        myStack.printNodesTopToBottom(); // should only contain 20, 10
        System.out.println("Should be 20: " + myStack.pop().data);
        // should only have a single node remaining
        myStack.printNodesTopToBottom();
        //myStack.peek();
    }

    public static void LinkedListTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        // linked list using traversal 0(n)
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(30);
        // prepend some data
        myLinkedList.prepend(1);
        myLinkedList.printListItemsData();
        myLinkedList.getLength();

        //insert some data at index
        myLinkedList.insert(2, 666);
        myLinkedList.printListItemsData();
        myLinkedList.getLength();

        // Linked list using tail reference 0(1)
        LinkedList myLinkedListUsingTail = new LinkedList();
        myLinkedListUsingTail.appendUsingTail(10);
        myLinkedListUsingTail.appendUsingTail(20);
        myLinkedListUsingTail.appendUsingTail(30);
        myLinkedListUsingTail.appendUsingTail(40);
        myLinkedListUsingTail.appendUsingTail(50);
        //prepend some data
        myLinkedListUsingTail.prepend(1);
        myLinkedListUsingTail.printListItemsData();
        myLinkedListUsingTail.getLength();

        // Test removing index
        myLinkedList.remove(2);
        myLinkedList.printListItemsData();
        myLinkedList.getLength();

        // test doubly
        LinkedList dll = new LinkedList();
        dll.appendUsingTail(10);
        dll.appendUsingTail(20);
        dll.appendUsingTail(30);
        dll.appendUsingTail(40);
        dll.appendUsingTail(50);
        dll.appendUsingTail(60);
        // dll.appendUsingTail(30);
        // dll.printPrev();
        dll.getLength();

        //dll.reverseLinkedList();
        //dll.printListItemsData();

       //dll.reverseLinkedListTwo();
        dll.reverseLinkedListTwo();
        dll.printListItemsData();
    }

    public static void ArrayTest(boolean runTest) {
        if (!runTest) {
            return;
        }
        MyArray arr = new MyArray();
        System.out.println(arr.getData(0));

        int len_of_my_array = arr.push("hello");
        arr.push("my");
        arr.push("!");
        arr.push("name");
        arr.push("jeff");
        System.out.println("len of array is now: " + len_of_my_array + " at index 0 is: " + arr.getData(0));

        // remove the second
        //System.out.println(arr.pop());
        System.out.println(arr.length);
        System.out.println("after this, delete item 2: " + arr.data);
        arr.delete(2);
        System.out.println(arr.data);
    }
}
