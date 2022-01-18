package course.Algorithms;


import course.DataStructures.BinaryTreeNode;

public class Recursion {
    public Recursion() {
    }

    public int Factorial(int number) {
        // find factorial of any number
        if (number == 2) {
            return 2;
        }
        return number * this.Factorial(number -1);
    }

    public int NonRecursiveFactorial(int number) {
        // find factorial of any number. Factorial is factorial x previous factorial so if number is 5, we can say
        // 5 x 4!, which is essentially 5 x 24 = 120.
        // e.g 5! = 5 * 4 * 3 * 2 * 1. or 5x4=20, 20x3=60, 60x2=120, 120x1=120;
        int answer = 1;
        for (int i = 2; i <= number; i++) {
           answer = answer * i;
        }
        return answer;
    }

    public int Fibonacci(int num) { // 0(2 ^ n) exponential
        if (num < 2) {
            // if the number is less than 2, the answer will always be 1; 0 + 1 = 1. So the index (2) returns 1.
            return num;
        }
        return Fibonacci(num-1) + Fibonacci(num-2);
    }

    public int FibonacciNonRecursiveDynamic(int number) { // 0(n)
        // Dynamic way (I prefer this, a lot more)
        // needed help, started down the road of storing the values in an array and fetching the
        // previous value to add the sum. Went down the dynamic approach without knowing it.
        // Found/Used the Dynamic problem solution from
        // https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

        int[] store = new int[number + 2];
        // start with 0 & 1
        store[0] = 0;
        store[1] = 1;

        for (int i = 2; i <= number; i++) {
            store[i] = store[i-1] + store[i-2];
        }
        return store[number];
    }

    public void traverseTree(BinaryTreeNode node) {
        // pass in the root
        if (node == null) {
            return;
        }
        System.out.println("Node value: " + node.value);
        traverseTree(node.left);
        traverseTree(node.right);

    }

    public String reverseStringWithRecursion(String someString) {

        // keep going until we get to the last character in the string
        if (someString.length() <=1) {
            return someString;
        }
        // helps with debugging
        String dropTheFirstChar = someString.substring(1);
        char firstChar = someString.charAt(0);
        return reverseStringWithRecursion(dropTheFirstChar) + firstChar;
        //return reverseStringWithRecursion(someString.substring(1)) + someString.charAt(0);
    }

}
