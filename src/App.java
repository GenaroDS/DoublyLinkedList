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
        System.out.println("");
        System.out.println("Added: Table, code 11, price 50.");
        lista.insertInOrder(product1);/* Insert smaller than the first works */

        System.out.println("Added: Chair, code 3, price 10.");
        lista.insertInOrder(product2); /* Insert smaller than the first works */

        System.out.println("Added: Carpet, code 12, price 30.");
        lista.insertInOrder(product3); /* Insert greater than the last works */

        System.out.println("Added: Keyboard, code 12, price 30 (Repeated code number, gives error)");
        lista.insertInOrder(product7); /* Insert a repeated code doesn't works */

        System.out.println("Added: Pot, code 10, price 7.");
        lista.insertInOrder(product4); /* Insert in between works */

        System.out.println("Added: Fan, code 1, price 35.");
        lista.insertInOrder(product5);
        System.out.println("");

        System.out.println("Now the Doubly Linked List looks like this:");
        System.out.println("-----------------------------------------------------");
        lista.showList(); /* Show how the list is ordered by product code */
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorted by code number regardless of the order in which they were added.");
        System.out.println("");
        
       
        
        System.out.println("");
        System.out.println("First, we delete Carpet to show that removing the tail works:");
        lista.deleteProduct(product3); /* Delete the last works */    
        System.out.println("-----------------------------------------------------");
        lista.showList();
        System.out.println("-----------------------------------------------------");

        System.out.println("");
        
        System.out.println("Then, we delete Pot to show that removing items in between works:");
        lista.deleteProduct(product4); /* Delete in the middle works */
        System.out.println("-----------------------------------------------------");
        lista.showList();
        System.out.println("-----------------------------------------------------");

        System.out.println("");

        System.out.println("Finally, we delete Fan to show that removing the head works. ");
        System.out.println("-----------------------------------------------------");
        lista.deleteProduct(product5); /* Delete the first works */
        lista.showList();
        System.out.println("-----------------------------------------------------");
        System.out.println("");
    }
}
