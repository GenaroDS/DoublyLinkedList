public class DoublyLinkedList {
    DoubleNode head;
    DoubleNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean freeCode(int codex) {
        if (!isEmpty()) {
            DoubleNode aux = head;
            while (aux != null) {
                if (aux.getValue().getCode() == codex) {
                    return false;
                }
                aux = aux.next;
            }
            return true;
        }
        return true;
    }

    public void addToEnd(Product obj) {
        if (freeCode(obj.getCode())) {
            if (!isEmpty()) {
                this.tail = new DoubleNode(obj, null, tail);
                tail.previous.next = tail;
            } else {
                this.head = this.tail = new DoubleNode(obj);
            }
        }
    }

    public void addToStart(Product obj) {
        if (freeCode(obj.getCode())) {
            if (!isEmpty()) {
                this.head = new DoubleNode(obj, this.head, null);
                head.next.previous = this.head;
            } else {
                this.head = this.tail = new DoubleNode(obj);
            }
        }
    }

    public void showList() {
        if (!isEmpty()) {
            DoubleNode aux = head;
            while (aux != null) {
                System.out.println(aux.getValue().toString());
                aux = aux.next;
            }
        }
    }

    public void deleteProduct(Product obj){
        int toDelete = obj.getCode();
        if (!isEmpty()) {
            DoubleNode aux = head;
            DoubleNode auxPrev = null;
            DoubleNode auxNext = null;
            while (aux != null) {
                if ((aux.getValue().getCode() == toDelete) && (aux.hasNext()) && (aux.hasPrevious())){
                    auxPrev = aux.getPrevious();
                    auxNext = aux.getNext();
                    auxPrev.linkNext(auxNext);
                    auxNext.linkPrevious(auxPrev);
                    break;
                }
                if ((aux.getValue().getCode() == toDelete) && (aux.hasNext()) && !(aux.hasPrevious())){
                    this.head = aux.getNext();
                    this.head.deletePrevious();
                    break;
                }
                if ((aux.getValue().getCode() == toDelete) && !(aux.hasNext()) && (aux.hasPrevious())){
                    aux = aux.getPrevious();
                    aux.deleteNext();
                    break;
                }
                aux = aux.next;
            }
        }
    }

    public void insertInOrder(Product obj) {
        int toInsert = obj.getCode();
        if (freeCode(toInsert)) {
            if (isEmpty()) {
                addToStart(obj);
            } else if (head.getValue().getCode() > toInsert) {
                addToStart(obj);
            } else if (tail.getValue().getCode() < toInsert) {
                addToEnd(obj);
            } else {
                DoubleNode aux = head;
                while ((aux.getValue().getCode() < toInsert) && (aux.getNext().getValue().getCode() < toInsert)){
                    aux = aux.getNext();
                }
                DoubleNode auxNext = aux.getNext();
                DoubleNode newNode = new DoubleNode(obj);
                aux.linkNext(newNode);
                newNode.linkNext(auxNext);
                newNode.linkPrevious(aux);
                auxNext.linkPrevious(newNode);
            }
            
        } else {
            System.out.println("Error, the code: " + obj.getCode() + " of the product " + obj.getDescripcion()
                    + " is under use");
        }
    }

}