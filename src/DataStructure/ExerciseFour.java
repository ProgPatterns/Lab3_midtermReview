package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFour <T extends Comparable<T>> {

    Node root;

    static class Node<T>{
        T data;
        Node left;
        Node right;

        public Node(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public void addIterative(T data) {
        Node<T> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node<T> current = root;
        Node<T> parent = null;

        while (current != null) {
            parent = current;
            if (data.compareTo(current.data) < 0) {
                current = current.left;
            } else if (data.compareTo(current.data) > 0) {
                current = current.right;
            } else {
                // Handle duplicates
                return;
            }
        }

        // Insert the new node at the empty spot
        if (data.compareTo(parent.data) < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public Object[] toArray(){
        List<T> elements = new ArrayList<>();
        inOrderTraversalRecursive(root, elements);
        return elements.toArray();
    }

    private void inOrderTraversalRecursive(Node<T> node, List<T> list){
        if(node != null){
            inOrderTraversalRecursive(node.left, list);
            list.add(node.data);
            inOrderTraversalRecursive(node.right, list);
        }
    }
}
