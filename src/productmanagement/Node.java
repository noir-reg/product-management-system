/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productmanagement;

/**
 *
 * @author Admin
 */
public class Node<T> {

    T infor;
    Node<T> pre;
    Node<T> next;

    Node() {
        pre = null;
        next = null;
    }

    Node(T element, Node<T> previousNode, Node<T> afterNode) {
        infor = element;
        pre = previousNode;
        next = afterNode;
    }

}
