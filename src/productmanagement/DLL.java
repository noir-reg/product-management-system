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
public class DLL<T> {

    protected Node<T> header, trailer;

    public DLL() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;

    }

    public Node<T> getHeader() {
        return header;
    }

    public void setHeader(Node<T> header) {
        this.header = header;
    }

    public Node<T> getTrailer() {
        return trailer;
    }

    public void setTrailer(Node<T> trailer) {
        this.trailer = trailer;
    }

    public boolean isEmpty() {
        return header == null;
    }

    public void addFirst(T e) {
        addBetween(e, header, header.next); 
    }

    
    public void addLast(T e) {
        addBetween(e, trailer.pre, trailer); 
    }

    
    private void addBetween(T e, Node<T> predecessor, Node<T> successor) {
        // create and link a new node
        Node<T> newest = new Node<>(e, predecessor, successor);
        predecessor.next = newest;
        successor.pre = newest;

    }

    
    public void remove(Node<T> node) {

        Node<T> predecessor = node.pre;
        Node<T> successor = node.next;
        predecessor.next = successor;
        successor.pre = predecessor;

    }

    public void printAll() {
        for (Node<T> tmp = header.next; tmp != trailer; tmp = tmp.next) {
            System.out.println(tmp.infor);
        }
    }

}
