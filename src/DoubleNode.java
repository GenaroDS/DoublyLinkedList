public class DoubleNode {
    Product data;
    DoubleNode next;
    DoubleNode previous;

    public DoubleNode(Product data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public DoubleNode(Product data, DoubleNode next, DoubleNode previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Product getValue() {
        return this.data;
    }

    public void linkNext(DoubleNode n) {
        this.next = n;
    }

    public void linkPrevious(DoubleNode n) {
        this.previous = n;
    }

    public DoubleNode getNext() {
        return this.next;
    }

    public DoubleNode getPrevious() {
        return this.previous;
    }

    public boolean hasNext(){
        return this.next != null;
    }
    public boolean hasPrevious(){
        return this.previous != null;
    }
    public void deleteNext() {
        this.next = null;
    }

    public void deletePrevious() {
        this.previous = null;
    }
}
