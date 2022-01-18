package course.DataStructures;


public class BinarySearchTree {
    BinaryTreeNode root;

    public BinarySearchTree() {

    }

    public BinaryTreeNode lookupSimple(int value){
        if (this.root == null) {
            return null;
        }

        BinaryTreeNode current = this.root;
        while(current != null) {
            if (value > current.value) {
                current = current.right;
            }
            else if (value < current.value ) {
                current = current.left;
            }
            else if (current.value == value){
                return current;
            }
        }
        // we don't have the value if it's not found in the while loop
        return null;
    }

    public BinaryTreeNode lookup(int value){
        // return the node that contains the value we are after
        if (this.root == null) {
            return null;
        } else if (this.root.left == null && this.root.right == null) {
            // we only have a root node
            return this.root;
        } else if (this.root.value == value){
            // Our Root node is the value we're after
            return this.root;
        }

        BinaryTreeNode current = this.root;
        while(current != null) {

            if (value > current.value) {
                if (current.value == value){
                    return current;
                }
                current = current.right;
            }
            else {
                if (current.value == value){
                    return current;
                }
                current = current.left;
            }
        }
        // we don't have the value if it's not found in the while loop
        return null;
    }

    public void insert(int value) {
        BinaryTreeNode newNode = new BinaryTreeNode(value);

        // add the root node
        if (this.root == null) {
            this.root = newNode;
        } else {
            BinaryTreeNode parentNode = this.root;

            while (parentNode != null) {
                if (newNode.value > parentNode.value) {
                    if (parentNode.right == null) {
                        parentNode.right = newNode;
                        break;
                    } else {
                        parentNode = parentNode.right;
                    }
                } else {
                    if (parentNode.left == null) {
                        parentNode.left = newNode;
                        break;
                    } else {
                        parentNode = parentNode.left;
                    }

                }
            }
        }
    }
}
