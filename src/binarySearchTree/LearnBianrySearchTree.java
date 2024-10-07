package binarySearchTree;

import program.Array;

import java.util.ArrayList;

public class LearnBianrySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    // Search key

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }

    }
        // Delete of node
        public static Node delete (Node root,int val){
            if (root.data > val) {
                root.left = delete(root.left, val);
            } else if (root.data<val) {
                root.right = delete(root.right, val);
            }else{
                //Case 1 no chile (leaf code)

                if(root.left == null && root.right== null){
                    return null;
                }
                // case 1 one child
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }
                // case 3 two child
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }
            return root;
        }

    private static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // print in Range
    public  static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        // Leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else { // non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root,3)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
       delete(root,5);
        inorder(root);
        System.out.println();
        printInRange(root,2,10);
        System.out.println();
        printRoot2Leaf(root,new ArrayList<>());
    }
}

        //int values[] = {5, 1, 3, 4, 2, 7};
//        Node root = null;
//        for (int i = 0; i < values.length; i++) {
//            root = insert(root, values[i]);
//        }
//        inorder(root);
//        System.out.println();
//    }


