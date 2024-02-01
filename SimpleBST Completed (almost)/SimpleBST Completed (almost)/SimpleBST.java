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
        root = putHelper(root, key, value);
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

        // Base Case: node is null
        if (node == null) {
            return new SimpleBSTNode(key, value);
        }

        if (key == node.getKey()) {
            node.setValue(value);
        }
        else if (key < node.getKey()) {
            node.setLeft(putHelper(node.getLeft(), key, value));
        }
        else {
            node.setRight(putHelper(node.getRight(), key, value));
        }

        return balance(node);
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
        return getHelper(root, key);
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
     * @throws      NoSuchElementException if node is null
     */
    private int getHelper(SimpleBSTNode node, int key) {

        // Base Case: node is null
        if (node == null) {
            String errMsg = String.format("key %d does not exist", key);
            throw new NoSuchElementException(errMsg);
        }

        if (key == node.getKey()) {
            return node.getValue();
        }
        else if (key < node.getKey()) {
            return getHelper(node.getLeft(), key);
        }
        else {
            return getHelper(node.getRight(), key);
        }
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
        SimpleBSTNode left = node.getLeft();
        node.setLeft(left.getRight());
        left.setRight(node);
        update(node);
        update(left);

        return left;
    }


    /**
     * Performs a left rotation on a node
     *
     * @param node  the node to rotate
     * @return      the right child
     *              which is the new root of the subtree after rotation
     */
    private SimpleBSTNode rotateLeft(SimpleBSTNode node) {
        SimpleBSTNode right = node.getRight();
        node.setRight(right.getLeft());
        right.setLeft(node);
        update(node);
        update(right);

        return right;
    }


    /**
     * Balances an imbalanced node by left and right rotations
     *
     * @param node  the node to balance
     * @return      the new root of the subtree after balance
     */
    private SimpleBSTNode balance(SimpleBSTNode node) {
        update(node);
        if (Math.abs(node.getBalanceFactor()) <= 1) {
            return node;
        }

        // Rotation Case 1 or 3
        if (node.getBalanceFactor() == 2) {
            if (node.getLeft().getBalanceFactor() >= 0) { // Rotation Case 1
                return rotateRight(node);
            }
            else { // Rotation Case 3
                node.setLeft(rotateLeft(node.getLeft()));
                return rotateRight(node);
            }
        }
        else { // Rotation Case 2 or 4

            // Complete this else block
            // Replace this line with your return statement
            return node;
        }

    }


    /**
     * Traverses the tree by an in-order traversal
     * Sorts data by key
     *
     * @return  a list consisting of all keys in the tree in the ascending order
     */
    public List<Integer> inOrder() {
        List<Integer> order = new LinkedList<>();
        inOrderHelper(root, order);

        return order;
    }


    /**
     * Recursive helper method for inOrder()
     *
     * @param node   the node to recurse on
     * @param order  the list that will eventually contain all keys in the tree
     *               in the ascending order
     */
    private void inOrderHelper(SimpleBSTNode node, List<Integer> order) {
        if (node == null) return;

        inOrderHelper(node.getLeft(), order);
        order.add(node.getKey());
        inOrderHelper(node.getRight(), order);

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

