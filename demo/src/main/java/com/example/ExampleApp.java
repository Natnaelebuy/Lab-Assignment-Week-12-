package com.tree;

public class ExampleApp {

  public static void main(String[] args) {
    // create tree
    Node bst = new Node(30);

    // add more nodes
    Integer[] nums = { 5, 3, -3, 2, -100, 39, 120 };
    // students should write code to
    // add all the values of the nums array into the tree using
    // Node.java's add method

    // print tree
    System.out.println("Printing the tree using in-order");
    bst.printInOrder();

    // post order print
    System.out.println("Printing the tree using post-order");
    // student needs to write code to
    // do a post order traversal of the tree
    bst.printPostOrder();
  }
}
