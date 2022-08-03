public class App {
    public static void main(String[] args) {
        Product product1 = new Product(11, "Table", 50);
        Product product2 = new Product(3, "Chair", 10);
        Product product3 = new Product(12, "Carpet", 30);
        Product product7 = new Product(12, "Keyboard", 30);
        Product product4 = new Product(10, "Pot", 7);
        Product product5 = new Product(1, "Fan", 35);
        Product product6 = new Product(4, "Spoon", 2);
        DoublyLinkedList lista = new DoublyLinkedList();
        lista.insertInOrder(product1); /* Insert smaller than the first works */
        lista.insertInOrder(product2); /* Insert smaller than the first works */
        lista.insertInOrder(product3); /* Insert greater than the last works */
        lista.insertInOrder(product4); /* Insert in between works */
        lista.insertInOrder(product7); /* Insert a repeated code doesn't works */
        lista.insertInOrder(product5);
        lista.insertInOrder(product6);
        lista.showList(); /* Show how the list is ordered by product code */
        System.out.println("-------"); 
        lista.deleteProduct(product3); /* Delete the last works */    
        lista.showList();
        System.out.println("-------");
        lista.deleteProduct(product4); /* Delete in the middle works */
        lista.showList();
        System.out.println("-------");
        lista.deleteProduct(product5); /* Delete the first works */
        lista.showList();
    }
}
