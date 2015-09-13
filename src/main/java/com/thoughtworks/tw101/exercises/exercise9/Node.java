package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).

//Definition of binary tree - The formal recursive definition is: a binary tree is either empty (represented by a null pointer),
// or is made of a single node, where the left and right pointers (recursive definition ahead) each point to a binary tree.

public class Node {
    private Node left;
    private Node right;
    private String name;

    public Node(String name) {
        left = null;
        right = null;
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        this.insert(this, nameOfNewNode);
    }

    private Node insert(Node node, String nameOfNewNode) {
        if (node==null) {
            node = new Node(nameOfNewNode);
        }
        else {
            if (nameOfNewNode.compareTo(node.name) < 0) {
                node.left = insert(node.left, nameOfNewNode);
            }
            else {
                node.right = insert(node.right, nameOfNewNode);
            }
        }
        return(node); // in any case, return the new pointer to the caller
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        addNames(this, names);
        return names;
    }

    private void addNames(Node node, List<String> names) {
        if (node == null) return;

        // left, node itself, right
        addNames(node.left, names);
        names.add(node.name);
        addNames(node.right, names);
    }
}
