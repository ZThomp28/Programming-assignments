/**
 * @author Yan Zong Ding
 */

import java.util.*;

public class SimpleBST {

    private SimpleBSTNode root;

    /**
     * Constructs a new BST.
     *
     * This constructor initializes an empty BST.
     *
     */
    public SimpleBST() {

    }


    /**
     * Adds a new entry to the tree or updates the value of an existing key in the tree
     *
     * Traverse the tree to find the appropriate location. If the key is
     * already in the tree, then update its value to the new value. Otherwise
     * create a new node consisting the new (key, value) pair and add it to the tree.
     * The new node becomes a leaf. Then go back up the tree from the new leaf to the root.
     * Upon seeing an imbalanced node, balance it with proper rotations.
     *
     * Time Complexity: O(h) where h is the height of the tree.
     * If the tree is balanced, then the time complexity becomes O(log n) where n is the number of nodes in the tree.
     *
     * @param key    the key of the entry to add or update
     * @param value  the value associated with the key
     */
    public void put(int key, int value) {

    }


    /**
     * Recursive helper method for put()
     *
     * Add the given (key, value) pair to the subtree rooted at a given node if the key
     * was not in the subtree, or update its associated value to the new value.
     * When a new node is added to the tree, upon seeing an imbalanced node
     * on the path up the tree from the new leaf, balance it with proper rotations.
     *
     * Time Complexity: O(h) where h is the height of the tree.
     * If the tree is balanced, then the time complexity becomes O(log n) where n is the number of nodes in the tree.
     *
     * @param node    the root of the subtree to add the new data to or update the value in
     * @param key     the key of the data to add or update
     * @param value   the new value associated with key
     * @return        the new root of the subtree after the data is added or updated
     */
    private SimpleBSTNode putHelper(SimpleBSTNode node, int key, int value) {



        return node;
    }


    /**
     * Returns the value associated with a given key.
     *
     * Traverse the tree to find the appropriate location. If the key is
     * in the tree, then return its value. Otherwise, return null.
     *
     * Time Complexity: O(log n)
     *
     * @param key  the key to search for
     * @return     the value associated with key if key is in the tree, null otherwise
     */

    public int get(int key) {
        return -1;
    }


    /**
     * Recursive helper method for get()
     *
     * Return the value associated with a given key in a subtree whose root is given.
     *
     * Time Complexity: O(h) where h is the height of the tree.
     * If the tree is balanced, then the time complexity becomes O(log n) where n is the number of nodes in the tree.
     *
     * @param node  the root of the subtree to find the value of a given key
     * @param key   a key
     * @return      the value associate with the key in the subtree
     * @throws
     */
    private int getHelper(SimpleBSTNode node, int key) {



        return -1;
    }

    /**
     * Returns the height of a node in the tree
     *
     * @param node  the node to return the height for
     * @return      the height of node if it's valid, -1 if it's null
     */
    private int height(SimpleBSTNode node) {
        if (node == null) {
            return -1;
        }
        else {
            return node.getHeight();
        }
    }


    /**
     * Updates the height and balance factor of a node
     *
     * @param node  the node to update the height and balance factor for
     */
    private void update(SimpleBSTNode node) {
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        node.setBalanceFactor(leftHeight - rightHeight);
        node.setHeight(1 + Math.max(leftHeight, rightHeight));
    }


    /**
     * Performs a right rotation on a node
     *
     * @param node  the node to rotate
     * @return      the left child
     *              which is the new root of the subtree after rotation
     */
    private SimpleBSTNode rotateRight(SimpleBSTNode node) {

        return null;
    }


    /**
     * Performs a left rotation on a node
     *
     * @param node  the node to rotate
     * @return      the right child
     *              which is the new root of the subtree after rotation
     */
    private SimpleBSTNode rotateLeft(SimpleBSTNode node) {

        return null;
    }


    /**
     * Balances an imbalanced node by left and right rotations
     *
     * @param node  the node to balance
     * @return      the new root of the subtree after balance
     */
    private SimpleBSTNode balance(SimpleBSTNode node) {

        return null;
    }


    /**
     * Traverses the tree by an in-order traversal
     * Sorts data by key
     *
     * @return  a list consisting of all keys in the tree in the ascending order
     */
    public List<Integer> inOrder() {

        return null;
    }


    /**
     * Recursive helper method for inOrder()
     *
     * @param node   the node to recurse on
     * @param order  the list that will eventually contain all keys in the tree
     *               in the ascending order
     */
    private void inOrderHelper(SimpleBSTNode node, List<Integer> order) {

    }


    /**
     * Returns the root of the tree
     *
     * @return root
     */
    public SimpleBSTNode getRoot() {
        return root;
    }
}

